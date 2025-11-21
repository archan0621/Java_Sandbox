package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11053_T2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine().trim());

        int[] arr = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken().trim());
        }

        // 틀리게 풀엇음

        int maxResult = Integer.MIN_VALUE;

        for (int i = 0; i < size ; i++) {
            int tmpResult = 0;
            for (int j = i; j < size - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    tmpResult++;
                }
            }
            maxResult = Math.max(tmpResult, maxResult);
        }

        System.out.println(maxResult);

    }
}
