package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q14215 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int[] numbers = new int[3];

            for (int j = 0; j < 3; j++) {
                numbers[j] = sc.nextInt();
            }
            Arrays.sort(numbers);
            int one = numbers[2];
            int two = numbers[1];
            int three = numbers[0];


        if (one >= two + three) {
            System.out.println((two + three - 1) + two + three);
        } else {
            System.out.println(one + two + three);
        }
    }
}
