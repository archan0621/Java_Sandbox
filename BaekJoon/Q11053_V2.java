package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11053_V2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

        int[] tails = new int[n];
        int len = 0; // 현재까지의 수열 길이

        for (int x : a) {
            int pos = Arrays.binarySearch(tails, 0, len, x);
            if (pos < 0) pos = -(pos + 1); // lower bound 위치 찾기
            tails[pos] = x; // 그 자리에 교체
            if (pos == len) len++; // 맨 뒤에 추가된 경우
        }

        System.out.println(len);
    }
}
