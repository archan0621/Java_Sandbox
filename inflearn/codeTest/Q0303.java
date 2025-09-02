package inflearn.codeTest;

import java.util.Scanner;

public class Q0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 총 일수
        int K = sc.nextInt(); // 연속된 일수
        int[] sales = new int[N];

        for (int i = 0; i < N; i++) {
            sales[i] = sc.nextInt();
        }

        int maxSales = 0;
        int currentSum = 0;

        // 초기 K일간의 매출 합을 계산합니다.
        for (int i = 0; i < K; i++) {
            currentSum += sales[i];
        }
        maxSales = currentSum;

        // 슬라이딩 윈도우를 이용해 최대 매출을 계산합니다.
        for (int i = K; i < N; i++) {
            currentSum = currentSum + sales[i] - sales[i - K];
            maxSales = Math.max(maxSales, currentSum);
        }

        System.out.println(maxSales);

        sc.close(); // 자원을 해제하기 위해 Scanner 종료
    }
}
