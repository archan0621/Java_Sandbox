package BaekJoon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Q11866 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Deque<Integer> queue = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        sb.append("<");

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while(queue.size()>1) {
            if(count == K-1) {
                sb.append(queue.pop()).append(", ");
                count = 0;
            } else {
                queue.add(queue.pop());
                count++;
            }

        }

        sb.append(queue.pop()).append(">");

        System.out.println(sb.toString());
    }
}