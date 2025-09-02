package BaekJoon;

import java.util.Scanner;

public class Q2720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println(transfer(sc.nextInt()));
        }
    }

    public static String transfer(int a) {

        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        for(int i = 0 ; i < 25 ; i++) {
            if(a < 25) {
                break;
            }
            a-=25;
            quarter++;
        }

        for(int i = 0 ; i < 3 ; i++) {
            if(a < 10) {
                break;
            }
            a-=10;
            dime++;
        }

        for(int i = 0 ; i < 3 ; i++) {
            if(a < 5) {
                break;
            }
            a-=5;
            nickel++;
        }

        for(int i = 0 ; i < 5 ; i++) {
            if(a == 0) {
                break;
            }
            a--;
            penny++;
        }

        return quarter + " " + dime + " " + nickel + " " + penny;
    }

}
