package inflearn.codeTest;

import java.util.Scanner;
import java.util.Stack;

public class Q0505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;

        String value = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (value.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
