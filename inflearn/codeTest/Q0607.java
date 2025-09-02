package inflearn.codeTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {

        Point p = (Point) o;

        if(this.x > p.x) {
            return 1;
        } else if(this.x == p.x) {
            if(this.y > p.y) {
                return 1;
            } else if(this.y == p.y) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}

public class Q0607 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            list.add(new Point(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(list);

        for (Point point : list) {
            System.out.println(point.x + " " + point.y);
        }
    }

}
