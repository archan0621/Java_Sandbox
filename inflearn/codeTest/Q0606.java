package inflearn.codeTest;

import java.util.Arrays;
import java.util.Scanner;

public class Q0606 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int[] arr = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }

        int[] clone = arr.clone();

        Arrays.sort(clone);

        for (int i = 0; i < count; i++) {
            if (arr[i] != clone[i]) {
                System.out.print(i+1 + " ");
            }
        }
    }
}
