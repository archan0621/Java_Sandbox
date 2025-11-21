package BaekJoon;

import java.util.Scanner;

public class Q12865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 물건 수
        int K = sc.nextInt();  // 가방 무게 한도
        int[] W = new int[N + 1];
        int[] V = new int[N + 1];
        
        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            W[i] = sc.nextInt();
            V[i] = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {
            for (int w = 1; w <= K; w++) {
                if (W[i] > w)
                    dp[i][w] = dp[i - 1][w];
                else
                    dp[i][w] = Math.max(dp[i - 1][w],
                                        dp[i - 1][w - W[i]] + V[i]);
            }
        }

        System.out.println(dp[N][K]);
    }
}
