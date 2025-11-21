package Algorithm;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BFS1 {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2, 3, 4));
        graph.put(2, Arrays.asList(1, 5));
        graph.put(3, Arrays.asList(2, 6, 7));
        graph.put(4, Arrays.asList(1, 8));
        graph.put(5, Arrays.asList(2, 9));
        graph.put(6, Arrays.asList(3, 10));
        graph.put(7, Arrays.asList(3));
        graph.put(8, Arrays.asList(4));
        graph.put(9, Arrays.asList(5));
        graph.put(10, Arrays.asList(6));

        boolean[] visted = new boolean[graph.size() + 1];

        bfs(graph, 1, visted);
    }

    public static void bfs(Map<Integer, List<Integer>> graph, int current, boolean[] visted) {
        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(current);
        System.out.println(current);
        visted[current] = true;

        while (!queue.isEmpty()) {
            Integer index = queue.poll();

            List<Integer> integers = graph.get(index);

            for (int a : integers) {
                if (visted[a]) {
                    continue;
                }
                queue.offer(a);
                System.out.println(a);
                visted[a] = true;
            }
        }

    }
}
