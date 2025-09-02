package inflearn.codeTest;

import java.util.Arrays;
import java.util.Scanner;

public class Q0609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int value = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt+rt) / 2;

            if (count(arr, mid) <= value) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }

        }

        System.out.println(answer);


    }

    public static int count(int[] arr, int capacity) {

        int cnt = 1, sum = 0;

        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum+=x;
            }
        }

        return cnt;
    }
}
