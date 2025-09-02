package inflearn.codeTest;

import java.util.Scanner;

public class Q0208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();

        int[] arr = new int[value];
        int[] answer = new int[value];

        for (int i = 0; i < value; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < value; i++) {
            int cnt = 1;
            for (int j = 0; j < value; j++) {
                if(arr[j] > arr[i]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }


    }
}
