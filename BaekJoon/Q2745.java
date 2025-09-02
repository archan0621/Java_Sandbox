package BaekJoon;

import java.util.Scanner;

/*
 * 이거 진법 변환 문제인데 너가 푼거 아니니까 나중에 꼭 똑똑해지면 복습해라 이거 이해 못하고 넘어가는거니까
 */

public class Q2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();

        int result = 0;
        for (int i = 0; i < N.length(); i++) {
            int convertN; // 각각 변환된 숫자

            if (Character.isDigit(N.charAt(N.length() - i - 1))) {
                // i번째 문자가 숫자면
                convertN = (int) (N.charAt(N.length() - i - 1) - '0');
            } else {
                // i번째 문자가 숫자가 아니면
                convertN = N.charAt(N.length() - i - 1) - 'A' + 10;
            }
            // result에 각각 변환한 숫자 더해주기
            result += (convertN * (Math.pow(B, i)));
        }
        System.out.println(result);
    }
}