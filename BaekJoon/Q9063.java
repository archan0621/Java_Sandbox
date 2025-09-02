package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q9063 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        List<Integer> width = new ArrayList<Integer>();
        List<Integer> height = new ArrayList<Integer>();
        int widthMax, widthLow, heightMax, heightLow;

        for (int i = 0; i < size; i++) {
            width.add(sc.nextInt());
            height.add(sc.nextInt());
        }

        widthMax = Collections.max(width);
        widthLow = Collections.min(width);
        heightMax = Collections.max(height);
        heightLow = Collections.min(height);

        int result = (widthMax - widthLow) * (heightMax - heightLow);

        if (result <= 0) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
}
