package inflearn.codeTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q0507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String essential = sc.nextLine();
        String value = sc.nextLine();

        Queue<Character> esQueue = new LinkedList<>();
        Queue<Character> valQueue = new LinkedList<>();

        for (char x : essential.toCharArray()) {
            esQueue.offer(x);
        }

        for (char x : value.toCharArray()) {
            valQueue.offer(x);
        }

        for (int i = 0; i < value.length(); i++) {
            Character tmp = valQueue.poll();

            if (esQueue.contains(tmp)) {
                Character esPeek = esQueue.peek();
                if (esPeek == tmp) {
                    esQueue.poll();
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if(esQueue.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
