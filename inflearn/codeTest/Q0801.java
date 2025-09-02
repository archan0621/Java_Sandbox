package inflearn.codeTest;

import java.util.Scanner;

public class Q0801 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        func(value);
    }

    public static void func(int N) {
        if(N == 0) {
            return;
        } else {
            func(N - 1);
            System.out.print(N + " ");
        }
    }
}
