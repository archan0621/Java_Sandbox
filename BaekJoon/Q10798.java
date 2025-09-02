package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10798 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][15];

        // 배열을 공백으로 초기화
        for (char[] row : arr) {
            Arrays.fill(row, ' '); // 공백 문자로 초기화
        }

        for(int i = 0 ; i < 5 ; i++) {
            String tmp = sc.nextLine();
            for (int k = 0; k < tmp.length(); k++) {
                arr[i][k] = tmp.charAt(k);
            }
        }

        for(int i = 0 ; i < 15 ; i++) {
            for(int k = 0 ; k < 5 ; k++){
                if(arr[k][i] != ' ') {
                    System.out.print(arr[k][i]);
                }
            }
        }
    }
}
