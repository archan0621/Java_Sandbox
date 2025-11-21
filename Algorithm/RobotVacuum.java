package Algorithm;

import java.util.*;

public class RobotVacuum {

    // 방향: 0=북, 1=동, 2=남, 3=서
    // 북,동,남,서 순서의 델타
    static final int[] DR = {-1, 0, 1, 0};
    static final int[] DC = {0, 1, 0, -1};

    // 왼쪽으로 회전
    static int left(int d) {
        return (d + 3) % 4;
    }

    // 뒤쪽(후진) 방향
    static int back(int d) {
        return (d + 2) % 4;
    }

    // roomMap: 0=빈칸, 1=벽
    // (r, c): 시작 좌표, d: 시작 방향
    public static int cleanCount(int[][] roomMap, int r, int c, int d) {
        int n = roomMap.length;
        int m = roomMap[0].length;
        boolean[][] cleaned = new boolean[n][m];

        int count = 0;

        while (true) {
            // 1) 현재 위치 청소 (처음 방문 시 1회만 카운트)
            if (!cleaned[r][c]) {
                cleaned[r][c] = true;
                count++;
            }

            // 2) 왼쪽부터 4방향 탐색
            boolean moved = false;
            int nd = d;
            for (int i = 0; i < 4; i++) {
                nd = left(nd); // 매번 왼쪽으로 회전
                int nr = r + DR[nd];
                int nc = c + DC[nd];

                // 범위 & 벽 & 미청소 체크
                if (nr >= 0 && nr < n && nc >= 0 && nc < m
                        && roomMap[nr][nc] == 0 && !cleaned[nr][nc]) {
                    // 그 방향으로 회전한 상태에서 전진
                    r = nr;
                    c = nc;
                    d = nd; // 바라보는 방향 업데이트 중요!
                    moved = true;
                    break; // 1번부터 다시
                }
                // 왼쪽에 청소할 공간이 없으면, 회전만 하고 계속 다음 왼쪽 확인
                // (즉, 여기서는 아무 것도 안 하고 for문 반복)
            }

            if (moved) continue;

            // 3) 네 방향 모두 불가 → 후진 시도
            int bd = back(d);
            int br = r + DR[bd];
            int bc = c + DC[bd];

            // 뒤가 벽이면 종료
            if (br < 0 || br >= n || bc < 0 || bc >= m || roomMap[br][bc] == 1) {
                break;
            }

            // 후진은 방향 유지한 채 좌표만 이동
            r = br;
            c = bc;
        }

        return count;
    }

    // 실행 예시
    public static void main(String[] args) {
        int[][] roomMap = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 1, 1, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        int r = 7, c = 4, d = 0; // 시작 위치/방향 (0=북)
        System.out.println(cleanCount(roomMap, r, c, d));
    }
}