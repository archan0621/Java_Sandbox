package BaekJoon;

import java.util.Scanner;

public class Q24116_V2 {

    static int[] dp;
    static int calcCount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        dp = new int[N + 1];
        dp[1] = 1;
        dp[2] = 1;

        System.out.print(dfs(N) + " " + calcCount);
    }

    public static int dfs(int num) {
        if (num <= 2) {
            return dp[num];
        }

        if (dp[num] == 0) {
            int tmpResult = dfs(num - 1) + dfs(num - 2);
            calcCount++;
            dp[num] = tmpResult;
        }

        return dp[num];
    }
}
