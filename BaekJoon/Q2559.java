package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int size = Integer.parseInt(st.nextToken().trim());
        int cnt = Integer.parseInt(st.nextToken().trim());

        int[] arr = new int[size];

        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken().trim());
        }

        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += arr[i];     // 초기 구간 합 구하기
        }

        int maxNum = sum;

        int leftCursor = 0;
        int rightCursor = cnt;

        while (rightCursor < size) {
            sum -= arr[leftCursor];   // 왼쪽 값 제거
            sum += arr[rightCursor];  // 오른쪽 새 값 추가

            maxNum = Math.max(maxNum, sum);

            leftCursor++;
            rightCursor++;
        }

        System.out.println(maxNum);
    }
}