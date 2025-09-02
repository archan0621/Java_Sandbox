package BaekJoon;

import java.util.Scanner;

public class Q2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String[] aTmp, bTmp;

        aTmp = new String[]{String.valueOf(a.charAt(2)), String.valueOf(a.charAt(1)), String.valueOf(a.charAt(0))};
        bTmp = new String[]{String.valueOf(b.charAt(2)), String.valueOf(b.charAt(1)), String.valueOf(b.charAt(0))};

        String reversedA = String.join("", aTmp);
        String reversedB = String.join("", bTmp);

        if (Integer.parseInt(reversedA) > Integer.parseInt(reversedB)) {
            System.out.println(reversedA);
        } else {
            System.out.println(reversedB);
        }
    }
}
