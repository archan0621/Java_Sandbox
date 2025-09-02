package inflearn.codeTest;

import java.util.Scanner;

public class Q0204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();


        int prevValue = 0;
        int presentValue = 1;

        for (int i = 0; i < value ; i++) {

            if(i == 0) {
                System.out.print("1 ");
                continue;
            }

            System.out.print(presentValue + prevValue + " ");

            int tmp = prevValue;
            prevValue = presentValue;
            presentValue = tmp + presentValue;
        }
    }
}
