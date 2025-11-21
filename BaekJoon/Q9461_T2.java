package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Q9461_T2 {

    static BigInteger[] dp = new BigInteger[100 + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dp[1] = BigInteger.ONE;
        dp[2] = BigInteger.ONE;
        dp[3] = BigInteger.ONE;

        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println(dfs(sc.nextInt()));
        }
    }

    public static BigInteger dfs(int num) {
        if (num <= 3) {
            return dp[num];
        }

        if (dp[num] == null) {
            BigInteger one = dfs(num - 2);
            BigInteger two = dfs(num - 3);
            BigInteger tmpResult = one.add(two);
            dp[num] = tmpResult;
        }

        return dp[num];
    }
}
