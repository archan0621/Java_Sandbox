package inflearn.codeTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Q0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstCnt = sc.nextInt();
        int[] firstArr = new int[firstCnt];

        for (int i = 0; i < firstCnt; i++) {
            firstArr[i] = sc.nextInt();
        }

        int secondCnt = sc.nextInt();
        int[] secondArr = new int[secondCnt];

        for (int i = 0; i < secondCnt; i++) {
            secondArr[i] = sc.nextInt();
        }

        int p1 = 0, p2 = 0;

        ArrayList<Integer> answer = new ArrayList<>();


        while (p1 < firstCnt && p2 < secondCnt) {
            if(firstArr[p1] < secondArr[p2]) {
                answer.add(firstArr[p1++]);
            } else {
                answer.add(secondArr[p2++]);
            }
        }

        while (p1 < firstCnt) {
            answer.add(firstArr[p1++]);
        }

        while (p2 < secondCnt) {
            answer.add(secondArr[p2++]);
        }

        for (Integer i : answer) {
            System.out.print(i + " ");
        }

    }
}
