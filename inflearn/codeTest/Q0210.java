package inflearn.codeTest;

import java.util.Scanner;

public class Q0210 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        int[][] arr = new int[cnt + 2][cnt + 2];
        int result = 0;

        for (int i = 0; i < cnt + 2; i++) {
            for (int j = 0; j < cnt + 2; j++) {
                if(i == 0 || j == 0 || i == cnt+1 || j == cnt+1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = sc.nextInt();
                }
            }
        }

        for (int i = 1; i < cnt + 2; i++) {
            for (int j = 1; j < cnt + 2; j++) {
                int value = arr[i][j];

                if(value > arr[i-1][j] && value > arr[i+1][j] && value > arr[i][j-1] && value > arr[i][j+1]) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
