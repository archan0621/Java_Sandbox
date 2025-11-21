package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149 {

    static int[][] arr;
    static boolean[][] used;
    static int[][] memo; // 메모이제이션 배열 [depth][이전색]
    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine().trim());

        arr = new int[size][3];
        used = new boolean[size][3];
        memo = new int[size][4]; // 이전 색깔 저장용 (0~2: RGB, 3: 시작 상태)

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0, size, 3); // depth=0, sum=0, prevColor=3 (시작 시 이전색 없음)

        System.out.println(result);
    }

    public static void dfs(int depth, int sum, int size, int prevColor) {
        if (depth == size) {
            result = Math.min(result, sum);
            return;
        }

        // 이미 같은 상태(depth, prevColor)에서 최소값을 구해봤으면 그 이상 탐색할 필요 없음
        if (memo[depth][prevColor] != 0 && sum >= memo[depth][prevColor]) {
            return;
        }
        memo[depth][prevColor] = sum;

        for (int i = 0; i < 3; i++) {
            if (depth == 0) {
                if (!used[depth][i]) {
                    used[depth][i] = true;
                    dfs(depth + 1, sum + arr[depth][i], size, i);
                    used[depth][i] = false;
                }
            } else {
                if (!used[depth][i] && !used[depth - 1][i]) {
                    used[depth][i] = true;
                    dfs(depth + 1, sum + arr[depth][i], size, i);
                    used[depth][i] = false;
                }
            }
        }
    }
}