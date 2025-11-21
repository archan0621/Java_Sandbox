package BaekJoon;

import java.util.Scanner;

public class Q14889 {

    static int result = Integer.MAX_VALUE;
    static int[][] arr;
    static int[] team;          // 1 = 스타트팀, 0 = 링크팀
    static int oneTeamSize;
    static int size;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        team = new int[size];
        oneTeamSize = size / 2;
        arr = new int[size][size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // 조합 뽑기 시작
        dfs(0, 0);

        System.out.println(result);
    }

    // idx: 다음에 고려할 사람 인덱스, teamSize: 현재 스타트팀에 뽑은 인원 수
    public static void dfs(int idx, int teamSize) {
        if (teamSize == oneTeamSize) {
            result = Math.min(result, diff());
            return;
        }
        if (idx == size) return;

        // 조합: idx부터 순서대로 뽑는다
        for (int i = idx; i < size; i++) {
            if (team[i] == 1) continue;
            team[i] = 1;
            dfs(i + 1, teamSize + 1);
            team[i] = 0;
        }
    }

    // 현재 team[] 상태에서 두 팀 능력치 차이 계산
    static int diff() {
        int start = 0, link = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (team[i] == 1 && team[j] == 1) {
                    start += arr[i][j] + arr[j][i];
                } else if (team[i] == 0 && team[j] == 0) {
                    link += arr[i][j] + arr[j][i];
                }
            }
        }
        return Math.abs(start - link);
    }
}