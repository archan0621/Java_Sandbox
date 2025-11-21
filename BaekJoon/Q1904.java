package BaekJoon;

import java.util.Scanner;

public class Q1904 {
    static final int MOD = 15746;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 1) { System.out.println(1); return; }
        if (N == 2) { System.out.println(2); return; }

        int a = 1; // dp[1]
        int b = 2; // dp[2]
        for (int i = 3; i <= N; i++) {
            int c = (a + b) % MOD;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}