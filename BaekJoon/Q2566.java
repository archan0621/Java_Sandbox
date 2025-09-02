package BaekJoon;

import java.util.Scanner;

public class Q2566 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int tmp = 0;
        String loc = "1 1";

        int[][] arr = new int[8][8];

        for (int i = 0 ; i < 9 ; i++) {
            for (int j = 0 ; j < 9 ; j++) {
                tmp = sc.nextInt();
                if(tmp > max) {
                    max = tmp;
                    loc = (i+1) + " " + (j+1);
                }
            }
        }

        System.out.println(max);
        System.out.println(loc);
    }
}
