package inflearn.codeTest;

import java.util.Scanner;

public class Q0112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String value = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            String tmp = value.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            sb.append((char) num);
            value = value.substring(7);
        }

        System.out.println(sb.toString());

    }

}
