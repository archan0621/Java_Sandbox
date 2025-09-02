package inflearn.codeTest;

import java.util.Arrays;
import java.util.Scanner;

public class Q0610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int value = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[size - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= value) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        System.out.println(answer);
    }

    private static int count(int[] arr, int mid) {

        int cnt = 1;
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= mid) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;

    }
}
