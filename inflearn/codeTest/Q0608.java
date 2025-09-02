package inflearn.codeTest;

import java.util.Arrays;
import java.util.Scanner;

public class Q0608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int value = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int lt = 0, rt = size - 1;

        Arrays.sort(arr);

        while (lt<=rt) {
            int mid = (rt + lt) / 2;

            if (arr[mid] == value) {
                System.out.println(mid + 1);
                return;
            } else {
                if (arr[mid] > value) {
                    rt = mid - 1;
                } else {
                    lt = mid + 1;
                }
            }

        }

    }
}
