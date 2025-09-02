package inflearn.codeTest;

import java.util.Scanner;

public class Q0209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int[][] arr = new int[cnt][cnt];
        int answer = 0;
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum1, sum2;

        for (int i = 0; i < cnt; i++) {
            sum1=sum2=0;

            for (int j = 0; j < cnt; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);

        }

        sum1=sum2=0;

        for (int i = 0; i < cnt; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][cnt - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        System.out.println(answer);

    }
}
