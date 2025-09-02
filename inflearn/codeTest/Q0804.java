package inflearn.codeTest;

import java.util.Scanner;

public class Q0804 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        DFS(count, 1, 0, 1);

    }

    public static void DFS(int count, int tmp, int i, int j) {

        if (count == tmp) {
            return;
        } else {
            int sum = i + j;
            System.out.print(sum + " ");
            DFS(count, tmp + 1, j, sum);
        }

    }
}
