package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11720 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int allSize = Integer.parseInt(sc.nextLine());
        String ex = sc.nextLine();
        int sum = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>(allSize);

        for (int i = 0; i < allSize; i++) {
            arr.add(Integer.parseInt(String.valueOf(ex.charAt(i))));
        }

        for(int i : arr) {
            sum += i;
        }

        System.out.println(sum);

    }

}
