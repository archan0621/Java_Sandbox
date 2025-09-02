package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1316 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine();
        int cnt = 0;

        for (int i = 0; i < size; i++) {
            String tmp = sc.nextLine();
            if (check(tmp)) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
    public static boolean check(String a) {
        char[] charArray = a.toCharArray();
        char tmp = 'a';

        for (int j = 0; j < a.length(); j++) {
            if (j == 0) {
                tmp = charArray[j];
            } else {
                if (charArray[j] != tmp) {
                    char[] chars = Arrays.copyOfRange(charArray, 0, j - 1);
                    if(containsValue(chars, charArray[j])) {
                        return false;
                    }
                    tmp = charArray[j];
                }
            }

        }
        return true;
    }

    private static boolean containsValue(char[] array, char value) {
        for (char c : array) {
            if (c == value) {
                return true; // 값이 발견되면 true 반환
            }
        }
        return false; // 값이 발견되지 않으면 false 반환
    }
}
