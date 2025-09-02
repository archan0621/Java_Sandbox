package inflearn.codeTest;

import java.util.Scanner;

public class Q0111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.nextLine().toCharArray();
        int tmp = 1;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                sb.append(arr[i]);
                if(tmp != 1) {
                    sb.append(tmp);
                }
                tmp = 1;
                break;
            }

            if(arr[i] == arr[i+1]) {
                tmp++;
            } else {
                sb.append(arr[i]);
                if(tmp != 1) {
                    sb.append(tmp);
                }
                tmp = 1;
            }
        }

        System.out.println(sb.toString());
    }
}
