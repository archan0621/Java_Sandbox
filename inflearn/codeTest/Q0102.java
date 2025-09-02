package inflearn.codeTest;

import java.util.Scanner;

public class Q0102 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String value = sc.next();
        char[] charArray = value.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if(Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else {
                charArray[i] = Character.toUpperCase(c);
            }
        }

        System.out.println(String.valueOf(charArray));

    }
}
