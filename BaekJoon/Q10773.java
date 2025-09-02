package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class Q10773 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int result;

        for (int i = 0; i < size; i++) {
            int tmp = sc.nextInt();

            if(tmp != 0) {
                stack.push(tmp);
            } else {
                stack.pop();
            }
        }

        result = stack.stream().mapToInt(i -> i).sum();

        System.out.println(result);
    }

}
