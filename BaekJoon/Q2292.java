package BaekJoon;

import java.util.Scanner;

public class Q2292 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();

        int multiple = 1;
        int tmp = 1;

        for(int i = 1 ; i < 1000000001 ; i++) {

            if(val == i) {
                break;
            }

            if(multiple == 1) {
                multiple = 6;
                tmp +=6;
            } else if(tmp == i) {
                multiple+=6;
                tmp +=multiple;
            }

        }

        System.out.println((multiple/6) + 1);
    }

}
