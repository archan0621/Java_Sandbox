package inflearn.codeTest;

import java.util.Scanner;

public class Q0109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();

        for (char c : arr) {
            if(Character.isDigit(c)) {
                sb.append(c);
            }
        }

        System.out.println(Integer.valueOf(sb.toString()));
    }
}
