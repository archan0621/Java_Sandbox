package BaekJoon;

import java.util.Scanner;

public class Q10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String str_rev = new StringBuilder(str).reverse().toString();

        if(str.equals(str_rev)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
