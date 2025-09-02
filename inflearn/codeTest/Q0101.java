package inflearn.codeTest;

import java.util.Scanner;

public class Q0101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toLowerCase().toCharArray();
        char[] arr2 = sc.next().toLowerCase().toCharArray();

        int result = 0;

        for (char c : arr) {
            if(c == arr2[0]) {
                result++;
            }
        }

        System.out.println(result);
    }

}
