package inflearn.codeTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q0302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstCnt = sc.nextInt();

        ArrayList<Integer> firstArr = new ArrayList<>();

        for (int i = 0; i < firstCnt; i++) {
            firstArr.add(sc.nextInt());
        }

        int secondCnt = sc.nextInt();

        ArrayList<Integer> secondArr = new ArrayList<>();

        for (int i = 0; i < secondCnt; i++) {
            secondArr.add(sc.nextInt());
        }

        int p1 = 0, p2 = 0;
        ArrayList<Integer> answer = new ArrayList<>();

        Collections.sort(firstArr);
        Collections.sort(secondArr);

        while (p1 < firstCnt && p2 < secondCnt) {
            if(firstArr.get(p1) < secondArr.get(p2)) {
                p1++;
            } else if (firstArr.get(p1) > secondArr.get(p2)) {
                p2++;
            } else {
                answer.add(firstArr.get(p1));
                p1++;
                p2++;
            }
        }

        Collections.sort(answer);

        for (Integer i : answer) {
            System.out.print(i + " ");
        }
    }
}
