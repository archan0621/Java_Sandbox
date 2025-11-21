package BaekJoon;

import java.util.Scanner;

public class Q15652 {

    static int[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int[M];

        dfs(N, M, 0, 1);
    }

    public static void dfs(int N, int M, int depth, int index) {
        if (depth == M) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }

        for (int i = index; i < N + 1; i++) {
            arr[depth] = index;
            dfs(N, M, depth + 1, index++);
        }

    }
}
