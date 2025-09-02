package BaekJoon;

import java.util.Scanner;

public class Q2903 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();

        int dot = 3;

        int init = 1;

        for (int i = 1; i < val; i++) {
               init*=2;
                dot+=init;
        }

        System.out.println(dot*dot);
    }
}
