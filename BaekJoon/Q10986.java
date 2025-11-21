package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] arr = new long[M];
        arr[0] = 1;
        int sum = 0;
        long answer = 0;

        st = new StringTokenizer(br.readLine().trim());

        for (int i = 0; i < N; i++) {
            sum = (sum + Integer.parseInt(st.nextToken())) % M;
            arr[sum]++;
        }

        for (int j = 0; j < M; j++) {
            long c = arr[j];
            if (c >= 2) {
                answer += c * (c-1) / 2;
            }
        }

        System.out.println(answer);
    }
}
