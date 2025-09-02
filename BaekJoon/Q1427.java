package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1427 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        char[] charArray = value.toCharArray();

        Arrays.sort(charArray);

        for (char i : charArray) {
            sb.append(i);
        }

        System.out.println(sb.reverse());

    }
}
