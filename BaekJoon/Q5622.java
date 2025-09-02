package BaekJoon;

import java.util.Scanner;

public class Q5622 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();
        int[] arr = new int[tmp.length()];
        for (int i = 0; i < tmp.length(); i++) {
            arr[i] = toNum(tmp.charAt(i));
        }

        int result = 0;

        for (int j = 0; j < tmp.length(); j++) {
            result += arr[j] + 1;
        }

        System.out.println(result);
    }

    public static int toNum(char a) {
        switch (Character.toUpperCase(a)) {
            case 'A', 'B', 'C' : return 2;
            case 'D', 'E', 'F' : return 3;
            case 'G', 'H', 'I' : return 4;
            case 'J', 'K', 'L' : return 5;
            case 'M', 'N', 'O' : return 6;
            case 'P', 'Q', 'R', 'S' : return 7;
            case 'T', 'U', 'V' : return 8;
            case 'W', 'X', 'Y', 'Z' : return  9;
            default : return 1;
        }
    }
}
