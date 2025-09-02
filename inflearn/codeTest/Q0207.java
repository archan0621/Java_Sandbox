package inflearn.codeTest;

import java.util.Scanner;

public class Q0207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int prevValue = 0;
        int result = 0;

        for (int i = 0; i < value; i++) {
            int num = sc.nextInt();
            if(num == 1) {
                if(prevValue == 0) {
                    result += 1;
                    prevValue++;
                } else {
                    prevValue++;
                    result += prevValue;
                }
            } else {
                prevValue = 0;
            }
        }

        System.out.println(result);
    }
}
