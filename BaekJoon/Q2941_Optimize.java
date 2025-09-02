package BaekJoon;

import java.util.Scanner;

public class Q2941_Optimize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String val = sc.nextLine();

        int cnt = 0;

        for (int i = 0; i < val.length(); i++) {
            char c = val.charAt(i);

            switch (c) {
                case 'c':
                    if (i < val.length() - 1 && (val.charAt(i + 1) == '=' || val.charAt(i + 1) == '-')) {
                        i++;
                    }
                    break;
                case 'd':
                    if (i < val.length() - 2 && val.charAt(i + 1) == 'z' && val.charAt(i + 2) == '=') {
                        i += 2;
                    } else if (i < val.length() - 1 && val.charAt(i + 1) == '-') {
                        i++;
                    }
                    break;
                case 'l':
                case 'n':
                    if (i < val.length() - 1 && val.charAt(i + 1) == 'j') {
                        i++;
                    }
                    break;
                case 's':
                case 'z':
                    if (i < val.length() - 1 && val.charAt(i + 1) == '=') {
                        i++;
                    }
                    break;
            }

            cnt++;
        }

        System.out.println(cnt);
    }

}
