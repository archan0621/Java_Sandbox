package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q2565 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine().trim());

        int[][] arr = new int[size][2];

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken().trim());
            arr[i][1] = Integer.parseInt(st.nextToken().trim());
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        int[] dp = new int[size];
        int maxLis = 0;

        for (int i = 0; i < size; i++) {
            dp[i] = 1; // 최소 자기 자신 1개
            for (int j = 0; j < i; j++) {
                if (arr[j][1] < arr[i][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLis = Math.max(maxLis, dp[i]);
        }

        System.out.println(size - maxLis);

    }
}
