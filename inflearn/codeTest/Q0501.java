package inflearn.codeTest;

import java.util.Scanner;
import java.util.Stack;

public class Q0501 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] arr = sc.nextLine().toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char c : arr) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
