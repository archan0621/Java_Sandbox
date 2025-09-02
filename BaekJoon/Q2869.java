package BaekJoon;

import java.util.Scanner;

public class Q2869 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int up = sc.nextInt();
        int down = sc.nextInt();
        int height = sc.nextInt();

//            for(int i = 1 ; i < 1000000001 ; i++) {
//                height-=up;
//                if(height <= 0) {
//                    System.out.println(i);
//                    break;
//                }
//                height += down;
//            }
        int days = (int) Math.ceil((double) (height - up) / (up - down)) + 1;
        System.out.println(days);
    }

}
