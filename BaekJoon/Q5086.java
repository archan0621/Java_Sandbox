package BaekJoon;

import java.util.Scanner;

public class Q5086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < 100; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0) {
                return;
            } else {

                if (a < b) {
                    if(b%a != 0) {
                        System.out.println("neither");
                    } else {
                        System.out.println("factor");
                    }
                } else {
                    if(a%b != 0) {
                        System.out.println("neither");
                    } else {
                        System.out.println("multiple");
                    }
                }
            }
        }
    }
}
