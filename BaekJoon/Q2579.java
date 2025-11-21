package BaekJoon;

import java.util.Scanner;

public class Q2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 계단 개수 입력
        int n = sc.nextInt();

        // 각 계단의 사탕 점수 저장 (1번부터 시작할 거라 n+1 크기로!)
        int[] candy = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            candy[i] = sc.nextInt();
        }

        // 계단이 하나밖에 없는 경우 -> 첫 계단 사탕만 얻고 끝!
        if (n == 1) {
            System.out.println(candy[1]);
            return;
        }

        // dp[i] = i번째 계단까지 올라올 때 얻을 수 있는 사탕의 최대 개수
        int[] dp = new int[n + 1];

        // 1번 계단까지는 그냥 밟기
        dp[1] = candy[1];

        // 2번 계단은 두 칸 연속 밟아도 괜찮음 → 1번 + 2번이 최대
        dp[2] = candy[1] + candy[2];

        // 이제 3번 계단부터는 세 칸 연속 밟으면 안 되므로 규칙 적용!
        for (int i = 3; i <= n; i++) {
            // 방법 1️⃣ : 한 칸 건너뛰고 오기 (i-2 → i)
            int case1 = dp[i - 2] + candy[i];

            // 방법 2️⃣ : 두 칸 연속 밟기 (i-3 → i-1 → i)
            int case2 = dp[i - 3] + candy[i - 1] + candy[i];

            // 둘 중 더 큰 값을 선택!
            dp[i] = Math.max(case1, case2);
        }

        // 마지막 계단(무조건 밟아야 함)의 최대 사탕 개수 출력!
        System.out.println(dp[n]);
    }
}
