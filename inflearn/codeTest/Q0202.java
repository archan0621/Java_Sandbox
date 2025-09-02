package inflearn.codeTest;

import java.util.Scanner;

public class Q0202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int max = 0;
        int result = 0;

        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();

            if(max < num) {
                result++;
                max = num;
            }

        }

        System.out.println(result);
    }
}
