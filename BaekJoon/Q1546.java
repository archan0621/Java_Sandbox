package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q1546 {

    private static Double maxScore;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> arr = new ArrayList<Double>();
        ArrayList<Double> newArr = new ArrayList<Double>();
        int allSize = sc.nextInt();

        for (int i = 0; i < allSize; i++) {
            arr.add(sc.nextDouble());
        }

       maxScore = Collections.max(arr);

        for (int j = 0 ; j < allSize ; j++) {
            newArr.add(newScore(arr.get(j)));
        }

        double v = newArr.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

        System.out.println(v);
    }

    public static double newScore(double a) {
        return a / maxScore * 100;
    }
}
