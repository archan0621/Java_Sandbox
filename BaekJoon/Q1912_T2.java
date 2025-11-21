package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1912_T2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[size];
        int[] dp = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken().trim());
        }

        dp[0] = arr[0];
        int answer = dp[0];

        for (int i = 1; i < size; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            answer = Math.max(dp[i], answer);
        }

        System.out.println(answer);

    }
}
