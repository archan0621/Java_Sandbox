package inflearn.codeTest;

import java.util.Scanner;

public class Q0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();

        char[] s = value.toCharArray();
        int lt = 0;
        int rt = s.length - 1;

        while(lt<rt) {
            if(!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        System.out.println(String.valueOf(s));


    }
}
