package BaekJoon;

import java.util.Scanner;

public class Q2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        int total = sc.nextInt();

        boolean[][] arr = new boolean[101][101];  //도화지
        
        for (int i = 0; i < total; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            //(x,y)부터 (x+9, y+9)까지의 영역을 하나씩 체크한 후 총 넓이에 더해준다
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}
