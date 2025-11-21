package BaekJoon;

import java.util.Scanner;

public class Q1463 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n + 1];
        dp[1] = 0; // 1은 이미 1이므로 0회

        for (int i = 2; i <= n; i++) {
            // 기본 케이스: 1을 빼는 연산
            int best = dp[i - 1] + 1;

            if (i % 2 == 0) best = Math.min(best, dp[i / 2] + 1);
            if (i % 3 == 0) best = Math.min(best, dp[i / 3] + 1);

            dp[i] = best;
        }

        System.out.println(dp[n]);
    }
}