package BaekJoon;

import java.util.Scanner;

public class Q9663 {
    static int N;
    static int ans = 0;
    static int[] arr; // arr[row] = queen이 놓인 col 위치

    public static void dfs(int col) {
        if (col == N) { // 모든 행에 퀸을 배치 완료
            ans++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[col] = i;
            if (isSafe(col)) {
                dfs(col + 1);
            }
        }
    }

    public static boolean isSafe(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[i] == arr[col]) return false;
            if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N]; // 각 행에 놓인 퀸의 열 정보
        dfs(0);
        System.out.println(ans);
    }
}
