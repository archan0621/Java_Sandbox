package inflearn.codeTest;

import java.util.Scanner;

public class Q0211 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        int[][] arr = new int[cnt+1][6];

        for(int i=1; i<=cnt; i++){
            for(int j=1; j<=5; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int result = 0, max = 0;

        for(int i=1; i<=cnt; i++){
            int tmp=0;
            for(int j=1; j<=cnt; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k]==arr[j][k]){
                        tmp++;
                        break;
                    }
                }
            }
            if(tmp>max){
                max=tmp;
                result=i;
            }
        }

        System.out.println(result);
    }
}
