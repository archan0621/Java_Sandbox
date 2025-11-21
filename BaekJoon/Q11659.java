package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int numLength = Integer.parseInt(st.nextToken().trim());
        int parseSize = Integer.parseInt(st.nextToken().trim());

        int[] arr = new int[numLength];

        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < numLength; i++) {
            arr[i] = Integer.parseInt(st.nextToken().trim());
        }

        // prefix sum: ps[i] = arr[0..i-1]의 합 (길이 + 1, 0-based에 적합)
        long[] ps = new long[numLength + 1];
        for (int i = 0; i < numLength; i++) {
            ps[i + 1] = ps[i] + arr[i];
        }

        for (int i = 0; i < parseSize; i++) {
            st = new StringTokenizer(br.readLine().trim());

            int startIndex = Integer.parseInt(st.nextToken().trim()) - 1; // 입력은 1-based라 0-based로
            int endIndex   = Integer.parseInt(st.nextToken().trim()) - 1;

            // 문제는 보통 start <= end로 들어오지만 혹시 대비
            int l = Math.min(startIndex, endIndex);
            int r = Math.max(startIndex, endIndex);

            long sum = ps[r + 1] - ps[l]; // [l, r] 구간 합

            System.out.println(sum);
        }
    }
}