package BaekJoon;

import java.io.*;
import java.util.*;

public class Q11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

        int[] lis = new int[n]; // i에서 끝나는 증가 부분수열 길이
        int[] lds = new int[n]; // i에서 시작하는 감소 부분수열 길이
        Arrays.fill(lis, 1);
        Arrays.fill(lds, 1);

        // LIS: 왼쪽 -> i
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        // LDS: i -> 오른쪽 (감소 수열)
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (a[j] < a[i]) {
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, lis[i] + lds[i] - 1);
        }
        System.out.println(ans);
    }
}