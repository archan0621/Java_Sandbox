package BaekJoon;

import java.io.*;
import java.util.*;

public class Q11055 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

        // dp[i] = a[i]로 끝나는 증가 부분 수열의 "최대 합"
        int[] dp = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            dp[i] = a[i]; // 최소한 자기 자신 하나로 시작
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + a[i]);
                }
            }
            ans = Math.max(ans, dp[i]);
        }

        System.out.println(ans);
    }
}
