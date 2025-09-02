package inflearn.codeTest;

import java.util.Scanner;

public class Q0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentCnt = sc.nextInt();
        int examCnt = sc.nextInt();
        int answer = 0;

        int[][] arr = new int[examCnt][studentCnt];

        for (int i = 0; i < examCnt; i++) {
            for (int j = 0; j < studentCnt; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i<=studentCnt; i++){
            for(int j=1; j<=studentCnt; j++){
                int cnt=0;
                for(int k=0; k<examCnt; k++){
                    int pi=0, pj=0;
                    for(int s=0; s<studentCnt; s++){
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==examCnt){
                    answer++;
                    //System.out.println(i+" "+j);
                }
            }
        }

        System.out.println(answer);
    }
}
