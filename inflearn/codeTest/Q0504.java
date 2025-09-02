package inflearn.codeTest;

import java.util.Scanner;
import java.util.Stack;

public class Q0504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Stack<Integer> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if(Character.isDigit(x)) {
                stack.push(x-48);
            } else if (!stack.isEmpty()){
                int rt = stack.pop();
                int lt = stack.pop();

                switch (x) {
                    case '*' :
                        stack.push(lt * rt);
                        break;
                    case '/' :
                        stack.push(lt / rt);
                        break;
                    case '+' :
                        stack.push(lt + rt);
                        break;
                    case '-' :
                        stack.push(lt - rt);
                        break;
                }
            }
        }

        System.out.println(stack.pop());
    }
}
