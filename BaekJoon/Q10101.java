package BaekJoon;

import java.util.Scanner;

public class Q10101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        if (first + second + third == 180) {
            if(first == 60 && second == 60) {
                System.out.println("Equilateral");
            } else {
                if (first != second && first != third && second != third) {
                    System.out.println("Scalene");
                } else {
                    System.out.println("Isosceles");
                }
            }
        } else {
            System.out.println("Error");
        }
    }
}
