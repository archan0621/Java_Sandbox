package inflearn.codeTest;

import java.util.Scanner;

public class Q0305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        int[] arr = new int[cnt];
        int tmp = 1;

        for (int i = 0; i < cnt; i++) {
            arr[i] = tmp;
            tmp++;
        }


        int answer = 0 , lt = 0, sum = 0;

        for (int rt = 0; rt < cnt - 1; rt++) {
            sum += arr[rt];
            if(sum == cnt) answer++;
            while(sum >= cnt) {
                sum -= arr[lt++];
                if(sum==cnt) answer++;
            }
        }

        System.out.println(answer);
    }
}
