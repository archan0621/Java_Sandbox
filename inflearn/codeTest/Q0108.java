package inflearn.codeTest;

import java.util.Scanner;

public class Q0108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
        String reversed = new StringBuilder(s).reverse().toString();

        if (s.equals(reversed)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
