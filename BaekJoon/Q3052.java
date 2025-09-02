package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (!arr.contains(num % 42)) {
                arr.add(num % 42);
            }
        }

        System.out.println(arr.size());
    }

}
