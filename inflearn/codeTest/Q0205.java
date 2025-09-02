package inflearn.codeTest;

import java.util.Scanner;

public class Q0205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int answer = 0;
        int[] ch = new int[value + 1];

        for (int i = 2; i <= value; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= value; j = j + i) {
                    ch[j] = 1;
                }
            }
        }

        System.out.println(answer);
    }
}
