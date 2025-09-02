package inflearn.codeTest;

import java.util.Scanner;

public class Q0104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {

            String tmp = sc.next();

            String result = new StringBuilder(tmp).reverse().toString();
            System.out.println(result);

        }
    }
}
