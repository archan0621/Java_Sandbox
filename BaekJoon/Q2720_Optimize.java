package BaekJoon;

import java.util.Scanner;

public class Q2720_Optimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println(transfer(sc.nextInt()));
        }
    }

    public static String transfer(int amount) {
        int[] coins = {25, 10, 5, 1};
        int[] coinCounts = new int[coins.length];

        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                coinCounts[i]++;
            }
        }

        return coinCounts[0] + " " + coinCounts[1] + " " + coinCounts[2] + " " + coinCounts[3];
    }
}
