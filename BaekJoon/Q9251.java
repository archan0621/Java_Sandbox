package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] a = br.readLine().toCharArray(); // 첫 번째 문자열
        char[] b = br.readLine().toCharArray(); // 두 번째 문자열

        int[][] dp = new int[a.length + 1][b.length + 1];
        // 기억표: a와 b의 글자들을 비교해서 결과를 쌓아둘 곳

        for (int i = 1; i <= a.length; i++) { // a의 각 글자를 하나씩 본다
            for (int j = 1; j <= b.length; j++) { // b의 각 글자도 하나씩 본다
                if (a[i - 1] == b[j - 1]) {
                    // 두 글자가 같으면 “좋아! 공통 글자 하나 더 찾았다!”
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // 다르면 “이전까지 제일 길었던 거 유지하자”
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[a.length][b.length]);
    }
}
