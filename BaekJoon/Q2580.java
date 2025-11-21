package BaekJoon;

import java.util.Scanner;

public class Q2580 {

    static int[][] board = new int[9][9];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                board[row][col] = sc.nextInt();
            }
        }

        dfs();

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                sb.append(board[r][c]).append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    // 다음 빈칸 찾고 1..9 시도 → 백트래킹
    static boolean dfs() {
        int[] next = findEmpty(); // {row, col} or {-1, -1}
        if (next[0] == -1) {
            return true;
        }
        int r = next[0], c = next[1];

        for (int num = 1; num <= 9; num++) {
            if (isValid(r, c, num)) {
                board[r][c] = num;
                if (dfs()) {
                    return true;   // 해답 찾으면 조기 종료
                }
                board[r][c] = 0;          // 되돌리기
            }
        }
        return false;
    }

    static int[] findEmpty() {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == 0) {
                    return new int[]{r, c};
                }
            }
        }
        return new int[]{-1, -1};
    }

    static boolean isValid(int r, int c, int num) {
         for (int cc = 0; cc < 9; cc++) if (board[r][cc] == num) return false;

         for (int rr = 0; rr < 9; rr++) if (board[rr][c] == num) return false;

        int sr = (r / 3) * 3, sc = (c / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[sr + i][sc + j] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
