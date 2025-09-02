package BaekJoon;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Q2164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= num; i++) {
            queue.offer(i);
        }

        while (queue.size() > 1) {
            queue.poll(); // 첫 번째 카드를 버린다.
            queue.offer(queue.poll()); // 다음 카드를 맨 뒤로 옮긴다.
        }

        System.out.println(queue.peek());
    }
}