package inflearn.codeTest;

import java.util.Scanner;

public class Q0201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int tmpNum = 0;


        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            if(i == 0) {
                System.out.print(num + " ");
                tmpNum = num;
            }

            if (tmpNum < num) {
                System.out.print(num + " ");
            }

            tmpNum = num;
        }
    }
}
