package Algorithm;

import Data_Structure.Stack;

public class Tower {
    public static void main(String[] args) {

        int[] arr = {6,9,5,7,4};
        int[] resultArr = new int[arr.length];
        int index = resultArr.length - 1;

        Stack<Integer> stack = new Stack<>();

        for (int a : arr) {
            stack.push(a);
        }

        while (stack.peek() != null) {
            int data = stack.pop();
            int result = 0;
            Stack<Integer> copyStack = stack.copy();
            while (copyStack.peek() != null) {
                result++;
                if (copyStack.pop() > data) {
                    break;
                }
            }
            if (index == result) {
                resultArr[index] = 0;
            } else {
                resultArr[index] = index + 1 - result;
            }
            index--;
        }

        for (int b : resultArr) {
            System.out.print(b + " ");
        }

    }
}
