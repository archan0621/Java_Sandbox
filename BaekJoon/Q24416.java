package BaekJoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q24416 {

    static Map<Integer, Integer> cache = new HashMap<>();
    static int count = 0;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int fibo = fibo(size);
        System.out.print(fibo + " ");
        System.out.println(count);

    }

    public static int fibo(int n) {
        if (n <= 2) {
            return 1;
        }

        if (cache.get(n) != null) {
            return cache.get(n);
        } else {
            int result = fibo(n - 1) + fibo(n - 2);
            cache.put(n, result);
            count++;
            return result;
        }
    }
}
