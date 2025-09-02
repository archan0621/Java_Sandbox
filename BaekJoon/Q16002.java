package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q16002 {

    static class Graph {
        private List<List<Integer>> adjacencyList;
        private int numberOfBuildings;

        public Graph(int numberOfBuildings) {
            this.numberOfBuildings = numberOfBuildings;
            adjacencyList = new ArrayList<>();
            for (int i = 0; i <= numberOfBuildings; i++) {
                adjacencyList.add(new ArrayList<>());
            }
        }

        public void addRoad(int from, int to) {
            adjacencyList.get(from).add(to);
        }

        public List<Integer> getSuccessors(int building) {
            return adjacencyList.get(building);
        }
    }

    static class NoiseCalculator {
        private Graph graph;
        private int[] students;
        private long totalNoise;

        public NoiseCalculator(Graph graph, int[] students) {
            this.graph = graph;
            this.students = students;
            this.totalNoise = 0;
        }

        public long calculateMinimumNoise() {
            int n = graph.adjacencyList.size() - 1;
            long[] reachability = new long[n + 1];

            // Calculate reachability from each building
            for (int building = 1; building <= n; building++) {
                reachability[building] = students[building - 1];
                for (int next : graph.getSuccessors(building)) {
                    reachability[building] += reachability[next];
                }
            }

            // Calculate total noise
            for (int building = 1; building <= n; building++) {
                for (int next : graph.getSuccessors(building)) {
                    totalNoise += (reachability[next] * (reachability[building] - reachability[next]));
                }
            }

            return totalNoise;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Graph graph = new Graph(N);

        for (int i = 1; i < N; i++) {
            int from = scanner.nextInt();
            graph.addRoad(from, i + 1);
        }

        int[] students = new int[N];
        for (int i = 0; i < N; i++) {
            students[i] = scanner.nextInt();
        }

        NoiseCalculator calculator = new NoiseCalculator(graph, students);
        System.out.println(calculator.calculateMinimumNoise());
        scanner.close();
    }
}
