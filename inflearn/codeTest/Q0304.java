package inflearn.codeTest;

import java.util.Scanner;

public class Q0304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int value = sc.nextInt();

        int[] arr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }

        int lt = 0, sum = 0, answer = 0;

        for (int rt = 0; rt < cnt; rt++) {
            sum += arr[rt];
            if(sum == value) answer++;
            while(sum >= value) {
                sum -= arr[lt++];
                if(sum==value) answer++;
            }
        }

        System.out.println(answer);

    }
}
