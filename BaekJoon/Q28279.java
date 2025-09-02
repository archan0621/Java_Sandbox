package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < size; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(st.nextToken())) {
                case 1:
                    queue.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    queue.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    sb.append(queue.isEmpty() ? "-1" : queue.pollFirst()).append("\n");
                    break;
                case 4:
                    sb.append(queue.isEmpty() ? "-1" : queue.pollLast()).append("\n");
                    break;
                case 5:
                    sb.append(queue.size()).append("\n");
                    break;
                case 6:
                    sb.append(queue.isEmpty() ? "1" : "0").append("\n");
                    break;
                case 7:
                    sb.append(queue.isEmpty() ? "-1" : queue.peekFirst()).append("\n");
                    break;
                case 8:
                    sb.append(queue.isEmpty() ? "-1" : queue.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}