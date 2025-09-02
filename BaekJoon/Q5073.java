package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q5073 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 1000; i++) {
            int[] numbers = new int[3];

            for (int j = 0; j < 3; j++) {
                numbers[j] = sc.nextInt();
            }

            Arrays.sort(numbers);
            int one = numbers[2];
            int two = numbers[1];
            int three = numbers[0];
            if (one == 0 && two == 0 && three == 0) {
                return;
            }

            System.out.println(cacl(one, two, three));
        }
    }

    public static String cacl(int first, int second, int third) {
        if (first < second + third) {
            if((first + second + third)/first == 3) {
                return "Equilateral";
            } else {
                if (first != second && first != third && second != third) {
                    return "Scalene";
                } else {
                    return "Isosceles";
                }
            }
        } else {
            return "Invalid";
        }
    }
}
