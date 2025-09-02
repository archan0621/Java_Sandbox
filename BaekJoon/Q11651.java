package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Point2 implements Comparable<Point2> {

    public int x;
    public int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point2 other) {
        if (this.y == other.y) {
            return this.x - other.x;
        }
        return this.y - other.y;
    }
}

public class Q11651 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Point2[] points = new Point2[N];

        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            points[i] = new Point2(x, y);
        }

        Arrays.sort(points);

        for (Point2 p : points) {
            sb.append(p.x).append(" ").append(p.y).append("\n");
        }

        System.out.println(sb.toString());
        br.close();
    }
}
