package inflearn.codeTest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q0503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int answer = 0;
        Stack<Integer> tmpStack = new Stack<>();

        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        ArrayList<Stack<Integer>> list = new ArrayList<>();

        for (int j = 0; j < size; j++) {
            Stack<Integer> stack = new Stack<>();
            for (int i = size - 1; i >= 0; i--) {  // 아래에서부터 위로 스택을 채웁니다.
                if(arr[i][j] != 0) {
                    stack.push(arr[i][j]);
                }
            }
            list.add(stack);
        }

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int move = sc.nextInt() - 1;
            if (!list.get(move).isEmpty()) {
                int x = list.get(move).pop();

                if (!tmpStack.isEmpty() && tmpStack.peek() == x) {
                    tmpStack.pop();
                    answer += 2;  // 두 개의 인형이 터집니다.
                } else {
                    tmpStack.push(x);
                }
            }
        }

        System.out.println(answer);
    }
}