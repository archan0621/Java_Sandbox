package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q12789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> waitLine = new Stack<>();
        Stack<Integer> mainLine = new Stack<>();
        int currentNumber = 1;

        for (int i = 0; i < size; i++) {
            int tmp = Integer.parseInt(st.nextToken());

            // If the number is the next in the main line
            if (tmp == currentNumber) {
                mainLine.push(tmp);
                currentNumber++;
            } else {
                waitLine.push(tmp);
            }

            // Check if the top of the waiting line can be moved to the main line
            while (!waitLine.isEmpty() && waitLine.peek() == currentNumber) {
                mainLine.push(waitLine.pop());
                currentNumber++;
            }
        }

        // If the main line contains all numbers in order, print "Nice"
        if (mainLine.size() == size) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}