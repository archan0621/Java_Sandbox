package inflearn.codeTest;

import java.util.Scanner;

public class Q0206 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        sc.nextLine();
        String[] strings = sc.nextLine().split(" ");
        int[] arr = new int[value];


        for (int i = 0; i < value; i++) {
            String s = strings[i];
            String reversed = new StringBuilder(s).reverse().toString();
            int num =  Integer.parseInt(reversed);
            arr[i] = num;
        }

        for (int i : arr) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}
