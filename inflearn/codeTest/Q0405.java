package inflearn.codeTest;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Q0405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;

        for (int x : Tset) {
            cnt++;
            if (cnt == k) {
                System.out.println(x);
                return;
            }
        }

        System.out.println("-1");
    }
}
