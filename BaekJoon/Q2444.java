package BaekJoon;

import java.util.Scanner;

public class Q2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num * 2 - 1; i++) {
            int maxStars = i <= num ? i * 2 - 1 : (num * 2 - i) * 2 - 1;
            int spaces = num - (i <= num ? i : num * 2 - i);

            // 공백과 별을 출력합니다.
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < maxStars; j++) {
                System.out.print("*");
            }

            // 다음 줄로 넘어갑니다.
            System.out.println();
        }
    }
}

/*

내가 짯던 코드 참..

*/
//public class Q2444 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//        int tmp = 1;
//        int star = 1;
//        int blank = num;
//
//        for (int i = 0 ; i < num*2-1 ; i++) {
//            if (tmp < num) {
//                for(int k = 1 ; k < blank ; k++){
//                    System.out.print(" ");
//                }
//                for (int j = 0 ; j < star ; j++){
//                    System.out.print("*");
//                }
//                System.out.print("\n");
//                tmp++;
//                star += 2;
//                blank--;
//            } else {
//                for(int k = 1 ; k < blank ; k++){
//                    System.out.print(" ");
//                }
//                for (int j = 0 ; j < star ; j++){
//                    System.out.print("*");
//                }
//                System.out.print("\n");
//                tmp++;
//                star -= 2;
//                blank++;
//            }
//        }
//    }
//}
