package BaekJoon;

import java.util.*;

public class Q2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N + 1];
        for (int i = 1; i <= N; i++) a[i] = sc.nextInt();

        if (N == 1) {
            System.out.println(a[1]);
            return;
        }
        if (N == 2) {
            System.out.println(a[1] + a[2]);
            return;
        }

        int[] dp = new int[N + 1];
        dp[1] = a[1];
        dp[2] = a[1] + a[2];

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(
                        dp[i - 1],
                        Math.max(
                            dp[i - 2] + a[i],
                            dp[i - 3] + a[i - 1] + a[i]
                        )
                     );
        }

        System.out.println(dp[N]);
    }
}
