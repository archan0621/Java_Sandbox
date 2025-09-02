package BaekJoon;

import java.util.Scanner;

public class Q27433 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();

        System.out.println(factorial(N));

    }

    public static Long factorial(int N) {
        if(N == 0) {
            return 1L;
        }
        return factorial(N-1) * N;
    }
}
