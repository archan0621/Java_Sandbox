package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1932 {

    static int[] tree;
    static int treeIndex = 1;
    static int maxResult = Integer.MIN_VALUE;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine().trim());
        long total = (long) size * (size + 1) / 2;
        tree = new int[(int) total + 1];
        dp   = new Integer[(int) total + 1];

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                tree[treeIndex++] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = dfs(0, 1, size);
        System.out.println(ans);
    }

    static int dfs(int depth, int current, int size) {
        // 리프(마지막 줄)면 현재 값 그대로 반환
        if (depth == size - 1) return tree[current];

        if (dp[current] != null) return dp[current];

        // 아래 행으로 내려갈 때 인덱스 이동:
        // 현재 depth는 0-based → 현재 행 번호 r = depth + 1
        // 왼쪽 자식 = current + r
        // 오른쪽 자식 = current + r + 1
        int r = depth + 1;
        int left  = dfs(depth + 1, current + r, size);
        int right = dfs(depth + 1, current + r + 1, size);

        return dp[current] = tree[current] + Math.max(left, right);
    }
}
