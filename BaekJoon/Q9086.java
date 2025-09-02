package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9086 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int allSize = Integer.parseInt(sc.nextLine());

        ArrayList<String> a = new ArrayList<String>(allSize);

        for (int i = 0; i < allSize; i++) {
            a.add(sc.nextLine());
        }

        for (String tmp : a) {

            int size = tmp.length();

            if (size <= 1) {
                System.out.println(tmp + tmp);
            } else {
                System.out.println(String.valueOf(tmp.charAt(0)) + String.valueOf(tmp.charAt(size-1)));
            }

        }

    }

}
