package Algorithm;

import Data_Structure.Queue;

import java.util.Hashtable;

public class StockPrice {

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,3};
        int[] resultArr = new int[arr.length];
        int index = 0;

        Queue<Integer> queue = new Queue<>();

        for (int a : arr) {
            queue.enqueue(a);
        }

        while (!queue.isEmpty()) {
            int num = 0;
            Integer data = queue.dequeue();
            Queue<Integer> copyQueue = queue.copy();
            while (!copyQueue.isEmpty()) {
                num++;
                if (data > copyQueue.dequeue()) {
                    break;
                }
            }
            resultArr[index++] = num;
        }


        for (int b : resultArr) {
            System.out.print(b + " ");
        }
    }

}
