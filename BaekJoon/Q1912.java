package BaekJoon;

import java.util.Scanner;

public class Q1912 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cur = arr[0];
        int best = arr[0];

        for (int i = 1; i < n; i++) {
            cur = Math.max(arr[i], cur + arr[i]);
            best = Math.max(best, cur);
        }

        System.out.println(best);
    }
}