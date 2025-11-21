package BaekJoon;

import java.util.Scanner;

public class Q1904_V2 {

    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        dp = new int[N + 5];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 5;
        dp[5] = 8;

        System.out.println(dfs(N) % 15746);
    }

    public static int dfs(int num) {
        if (num <= 5) {
            return dp[num];
        }

        if (dp[num] == 0) {
            int result = (dfs(num - 1) % 15746) + (dfs(num - 2) % 15746);
            dp[num] = result;
        }

        return dp[num];
    }
}
