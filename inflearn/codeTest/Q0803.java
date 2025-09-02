package inflearn.codeTest;

import java.util.Scanner;

public class Q0803 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();

        System.out.println(DFS(val));


    }

    public static int DFS(int N) {
        if (N == 1) {
            return 1;
        } else {
            return N * DFS(N - 1);
        }
    }
}
