package BaekJoon;

import java.util.Scanner;

public class Q15650 {

    static int[] arr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        arr = new int[M];
        dfs(N, M, 0, 1);
    }

    static void dfs(int N, int M, int depth, int start) {
        if (depth == M) {
            for (int v : arr) System.out.print(v + " ");
            System.out.println();
            return;
        }

        for (int num = start; num <= N; num++) {
            arr[depth] = num;
            dfs(N, M, depth + 1, num + 1);
        }
    }
}
