package BaekJoon;

import java.util.Scanner;

public class Q2738 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] aArr = new int[row][col];
        int[][] bArr = new int[row][col];
        int[][] result = new int[row][col];

        for(int i = 0 ; i < 2 ; i++) {
            if (i == 0) {
                for (int j = 0; j < row; j++) {
                    for (int k = 0; k < col; k++) {
                        aArr[j][k] = sc.nextInt();
                    }
                }
            } else {
                for (int j = 0; j < row; j++) {
                    for (int k = 0; k < col; k++) {
                        bArr[j][k] = sc.nextInt();
                    }
                }
            }
        }

        for (int j = 0; j < row; j++) {
            for (int k = 0; k < col; k++) {
                result[j][k] = aArr[j][k] + bArr[j][k];
            }
        }

        printArray(result);

    }

    public static void printArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

}
