package BaekJoon;

import java.util.Scanner;

public class Q15651 {

    static StringBuilder out = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        dfs(N, M, 0, new StringBuilder()); // 경로 전용 path 추가

        System.out.print(out.toString());
    }

    public static void dfs(int N, int M, int depth, StringBuilder path) {
        if (depth == M) {
            int len = path.length();
            path.setCharAt(len - 1, '\n');
            out.append(path);
            path.setCharAt(len - 1, ' ');
            return;
        }

        for (int i = 0; i < N; i++) {
            int before = path.length();
            path.append(i + 1).append(' ');
            dfs(N, M, depth + 1, path);
            path.setLength(before); // 경로만 되돌림(출력(out)은 유지)
        }
    }
}