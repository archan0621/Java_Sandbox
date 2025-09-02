package BaekJoon;

import java.util.Scanner;

public class Q10870 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(pivo(N, 0L,1L));
    }

    public static Long pivo(int N, Long a, Long b) {
        if (N == 0) {
            return a;
        }
        if (N == 1) {
            return b;
        }
        return pivo(N - 1, b, a + b);
    }
}
