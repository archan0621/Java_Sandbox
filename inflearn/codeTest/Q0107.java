package inflearn.codeTest;

import java.util.Scanner;

public class Q0107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine().toLowerCase();

        String reversed = new StringBuilder(value).reverse().toString();

        if (value.equals(reversed)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
