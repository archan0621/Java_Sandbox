package inflearn.codeTest;

import java.util.Scanner;

public class Q0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] firstArr = new int[count];
        int[] secondArr = new int[count];

        for (int i = 0; i < count; i++) {
            firstArr[i] = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            secondArr[i] = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            if (firstArr[i] == secondArr[i]) {
                System.out.println("D");
            } else if(firstArr[i] == 1 && secondArr[i] == 2) {
                System.out.println("B");
            } else if(firstArr[i] == 1 && secondArr[i] == 3) {
                System.out.println("A");
            } else if(firstArr[i] == 2 && secondArr[i] == 1) {
                System.out.println("A");
            } else if(firstArr[i] == 2 && secondArr[i] == 3) {
                System.out.println("B");
            } else if (firstArr[i] == 3 && secondArr[i] == 1) {
                System.out.println("B");
            } else if (firstArr[i] == 3 && secondArr[i] == 2) {
                System.out.println("A");
            }
        }
    }
}
