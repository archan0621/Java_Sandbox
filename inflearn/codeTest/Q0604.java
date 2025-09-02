package inflearn.codeTest;

import java.util.Scanner;

public class Q0604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int value = sc.nextInt();

        int[] arr = new int[value];

        for (int i = 0; i < value; i++) {
            arr[i] = sc.nextInt();
        }

        int[] cache = new int[size];

        for(int x : arr) {
            int pos = -1;

            for (int i = 0; i < size; i++) {
                if(x==cache[i]) {
                    pos = i;
                }
            }

            if(pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;

        }

        for (int N : cache) {
            System.out.print(N + " ");
        }



    }
}
