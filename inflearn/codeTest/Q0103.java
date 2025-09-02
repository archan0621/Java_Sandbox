package inflearn.codeTest;

import java.util.Scanner;

public class Q0103 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        String[] s = next.split(" ");
        int maxValue = 0;
        int index = 0;

        for (int i = 0 ; i < s.length ; i++) {
            String string = s[i];
            int length = string.length();
            if(length > maxValue) {
                maxValue = length;
                index = i;
            }
        }

        System.out.println(s[index]);

    }
}
