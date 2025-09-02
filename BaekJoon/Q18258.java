package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Q18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st;

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    deque.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(deque.isEmpty() ? "-1" : deque.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "front":
                    sb.append(deque.isEmpty() ? "-1" : deque.getLast()).append("\n");
                    break;
                case "back":
                    sb.append(deque.isEmpty() ? "-1" : deque.getFirst()).append("\n");
                    break;

            }
        }

        System.out.println(sb.toString());
    }
}