package Algorithm;

import java.util.ArrayDeque;
import java.util.Deque;

public class Bracket {

    public static void main(String[] args) {

        String input = "()()()()";
        Deque<Character> queue = new ArrayDeque<>();
        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '(') {
                queue.offer('(');
            } else if (arr[i] == ')') {
                Character polled = queue.poll();
                if (polled == null || polled != '(') {
                    System.out.println("false");
                    return;
                }
            }
        }

        if (queue.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
