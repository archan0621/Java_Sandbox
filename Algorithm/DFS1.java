package Algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class DFS1 {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2, 5, 9));
        graph.put(2, Arrays.asList(1, 3));
        graph.put(3, Arrays.asList(2, 4));
        graph.put(4, Arrays.asList(3));
        graph.put(5, Arrays.asList(1, 6, 8));
        graph.put(6, Arrays.asList(5, 7));
        graph.put(7, Arrays.asList(6));
        graph.put(8, Arrays.asList(5));
        graph.put(9, Arrays.asList(1,10));
        graph.put(10, Arrays.asList(9));

        boolean[] visted = new boolean[graph.size() + 1];

//        dfs(graph, 1, visted);
        dfsStack(graph, 1, visted);

    }

    public static void dfs(Map<Integer, List<Integer>> graph, int startFrom, boolean[] visted) {
        if (visted[startFrom]) {
            return;
        }

        System.out.println(startFrom);
        visted[startFrom] = true;
        List<Integer> integers = graph.get(startFrom);

        for (int a : integers) {
            dfs(graph, a, visted);
        }
    }

    public static void dfsStack(Map<Integer, List<Integer>> graph, int start, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);  // 시작 노드 넣기

        while (!stack.isEmpty()) {
            int node = stack.pop(); // 스택의 맨 위에서 하나 꺼내기

            if (visited[node]) continue; // 이미 방문했다면 무시
            visited[node] = true;
            System.out.println(node); // 방문 출력

            // 인접 노드들을 스택에 넣기 (역순으로 넣으면 재귀 DFS와 방문 순서가 같아짐)
            List<Integer> neighbors = graph.get(node);
            if (neighbors != null) {
                for (int i = 0; i <  neighbors.size(); i++) {
                    int next = neighbors.get(i);
                    if (!visited[next]) {
                        stack.push(next);
                    }
                }
            }
        }
    }


}
