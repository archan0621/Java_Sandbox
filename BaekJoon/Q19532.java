package BaekJoon;

import java.util.Scanner;

public class Q19532 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int num1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int num2 = sc.nextInt();

        int determin = (x1*y2) - (x2*y1);

        if (determin == 0) {
            System.out.println("0 0");
            return;
        }

        int x = ((y2*num1) - (y1*num2)) / determin;
        int y = ((x1*num2) - (x2*num1) ) / determin;

        System.out.println(x + " " + y);

    }

}
