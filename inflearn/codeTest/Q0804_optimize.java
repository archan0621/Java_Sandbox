package inflearn.codeTest;

import java.util.Scanner;

public class Q0804_optimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        for (int i = 1; i <= value; i++) {
            System.out.print(DFS(i) + " ");
        }
    }

    public static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return DFS(n - 2) + DFS(n - 1);
        }
    }
}
