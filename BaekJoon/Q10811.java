package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q10811 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int allSize = sc.nextInt();
        int dummy = sc.nextInt();
        int cnt = 1;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < allSize; i++) {
            arr.add(cnt);
            cnt++;
        }

        for (int i = 0; i < dummy; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            // Check if num1 and num2 are within the valid range
            if (num1 >= 1 && num2 <= allSize && num1 <= num2) {
                // Reverse the sublist from num1 to num2 (inclusive)
                Collections.reverse(arr.subList(num1 - 1, num2));
            } else {
                System.out.println("Invalid input for num1 and num2");
            }

        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
