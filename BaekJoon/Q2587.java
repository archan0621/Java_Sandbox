package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2587 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0 ; i < 5 ; i++) {
            arr.add(sc.nextInt());
        }

        for (int i = 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println(sum/5);
        System.out.println(arr.get(2));

    }
}