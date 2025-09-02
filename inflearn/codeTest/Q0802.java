package inflearn.codeTest;

import java.util.Scanner;

public class Q0802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();

        DFS(val);
    }

    public static void DFS(int n) {

        if (n == 0) {
            return;
        } else {
            DFS(n / 2);
            System.out.print(n%2);
        }

    }
}
