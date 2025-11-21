package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10844 {
    // 결과가 너무 커지지 않도록 문제에서 요구한 값으로 나눠줌
    static final int MOD = 1_000_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim()); // 자리 수 입력

        // dp[len][d] = 길이가 len이고, 마지막 숫자가 d인 계단수의 개수
        long[][] dp = new long[N + 1][10];

        // 길이 1일 때: 0으로 시작은 불가능, 1~9는 각각 1개씩
        for (int d = 1; d <= 9; d++) {
            dp[1][d] = 1;
        }

        // 길이 2부터 N까지 채우기
        for (int len = 2; len <= N; len++) {
            // 마지막 숫자가 0이면 그 전 숫자는 1밖에 못 옴 (… → 1 → 0)
            dp[len][0] = dp[len - 1][1] % MOD;

            // 마지막 숫자가 1~8이면, 바로 이전 숫자는 (d-1) 또는 (d+1)
            for (int d = 1; d <= 8; d++) {
                dp[len][d] = (dp[len - 1][d - 1] + dp[len - 1][d + 1]) % MOD;
            }

            // 마지막 숫자가 9이면 그 전 숫자는 8밖에 못 옴 (… → 8 → 9)
            dp[len][9] = dp[len - 1][8] % MOD;
        }

        // 길이 N에서 끝자리가 0~9인 모든 경우를 더함
        long answer = 0;
        for (int d = 0; d <= 9; d++) {
            answer = (answer + dp[N][d]) % MOD;
        }

        System.out.println(answer);
    }
}
