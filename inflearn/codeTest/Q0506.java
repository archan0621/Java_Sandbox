package inflearn.codeTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q0506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int value = sc.nextInt();
        int cnt = 1;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= size; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            int tmp = queue.poll();

            if (cnt == value) {
                cnt = 1;
                continue;
            } else {
                queue.offer(tmp);
            }

            cnt++;
        }

        System.out.println(queue.poll());
    }
}
