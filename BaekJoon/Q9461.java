package BaekJoon;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q9461 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] inputArr = new int[100];

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < size; i++) {
            int tmp = sc.nextInt();
            inputArr[i] = tmp;
            heap.offer(tmp);
        }

        Integer maxSize = heap.peek();

        if (maxSize == null) {
            return;
        }

        long[] arr = new long[maxSize + 1];

        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;

        for (int i = 4; i <= maxSize; i++) {
            arr[i] = arr[i - 3] + arr[i - 2];
        }

        for (int a : inputArr) {
            if(a == 0) {
                continue;
            }
            System.out.println(arr[a]);
        }


    }
}
