package inflearn.codeTest;

import java.util.Scanner;
import java.util.Stack;

public class Q0502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for (char x : value.toCharArray()) {
            if (stack.isEmpty() && x != '(' && x != ')') {
                sb.append(x);
            }

            if (x == '(') {
                stack.push(x);
            } else if (x == ')') {
                stack.pop();
            }

        }

        System.out.println(sb.toString());

    }
}
