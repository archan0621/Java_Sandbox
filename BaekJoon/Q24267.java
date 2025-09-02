package BaekJoon;

import java.util.Scanner;

public class Q24267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long n = sc.nextLong();

        System.out.println((n * (n - 1) * (n - 2) / 6));
        System.out.println(3);
    }
}
