package BaekJoon;

import java.util.Scanner;

public class Q1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Height
        int M = sc.nextInt(); // Width

        char[][] board = new char[N][M];
        sc.nextLine(); // Move scanner to next line after integers
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int minRepaint = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minRepaint = Math.min(minRepaint, countRepaints(board, i, j));
            }
        }

        System.out.println(minRepaint);
    }

    private static int countRepaints(char[][] board, int startX, int startY) {
        int repaintsBW = 0; // Start with 'B' at (startX, startY)
        int repaintsWB = 0; // Start with 'W' at (startX, startY)

        char expectedBW = 'B'; // Expected color if it starts with 'B'
        char expectedWB = 'W'; // Expected color if it starts with 'W'

        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                if (board[i][j] != expectedBW) {
                    repaintsBW++;
                }
                if (board[i][j] != expectedWB) {
                    repaintsWB++;
                }
                // Toggle expected colors for next square
                expectedBW = toggleColor(expectedBW);
                expectedWB = toggleColor(expectedWB);
            }
            // For each new row, toggle the starting color
            expectedBW = toggleColor(expectedBW);
            expectedWB = toggleColor(expectedWB);
        }

        return Math.min(repaintsBW, repaintsWB);
    }

    private static char toggleColor(char color) {
        return (color == 'B') ? 'W' : 'B';
    }
}
