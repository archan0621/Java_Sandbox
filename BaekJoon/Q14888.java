package BaekJoon;

import java.util.Scanner;

public class Q14888 {

    static int totalCount;
    static int[] numArr;
    static int[] operatorArr = new int[4]; // 0 = +, 1 = -, 2 = *, 3 = /
    static int maxNum = Integer.MIN_VALUE;
    static int minNum = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        totalCount = scanner.nextInt();
        numArr = new int[totalCount];

        for (int i = 0; i < totalCount; i++) {
            numArr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operatorArr[i] = scanner.nextInt();
        }

        dfs(numArr[0], 1);

        System.out.println(maxNum);
        System.out.println(minNum);

    }

    public static void dfs(int num, int index) {

        if (index == totalCount) {
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);

            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operatorArr[i] > 0) {
                operatorArr[i]--;

                switch (i) {
                    case 0:
                        dfs(num + numArr[index], index + 1);
                        break;
                    case 1:
                        dfs(num - numArr[index], index + 1);
                        break;
                    case 2:
                        dfs(num * numArr[index], index + 1);
                        break;
                    case 3:
                        dfs(num / numArr[index], index + 1);
                        break;
                }
                operatorArr[i]++;
            }
        }
    }
}
