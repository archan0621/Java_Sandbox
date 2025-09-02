package inflearn.codeTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q0106 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        char[] arr = value.toCharArray();

        for (char c : arr) {
            if (!seen.contains(c)) {
                result.append(c);
                seen.add(c);
            }
        }

        System.out.println(result.toString());
    }
}

