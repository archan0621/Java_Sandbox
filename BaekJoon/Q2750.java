package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2750 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int size = sc.nextInt();

        for(int i = 0 ; i < size ; i++) {
            arr.add(sc.nextInt());
        }

        for(int j = 0 ; j < arr.size()-1 ; j ++) {
            for (int i = 0; i < arr.size() - 1; i++) {
                if (arr.get(i) > arr.get(i+1)) {
                    int tmp = arr.get(i+1);
                    arr.set(i+1, arr.get(i));
                    arr.set(i, tmp);
                }
            }
        }

        arr.forEach(System.out::println);
    }
}
