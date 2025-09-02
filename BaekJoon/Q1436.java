package BaekJoon;

import java.util.Scanner;

public class Q1436 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tmp = sc.nextInt();

        int size = 0;

        for(int i = 666 ; i <= 1000000000 ; i++) {
            if(String.valueOf(i).contains("666")) {
                size++;
                if (size == tmp) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
