package BaekJoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Q9184 {

    static Map<NumberKey, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == -1 && b == -1 && c == -1) {
                return;
            }

            String result = String.format("w(%d, %d, %d) = %d", a, b, c, w(a, b, c));
            System.out.println(result);
        }
    }

    public static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        } else if (a > 20 || b > 20 || c > 20) {
            NumberKey key = new NumberKey(20, 20, 20);
            int result;
            if (cache.get(key) == null) {
                result = w(20, 20, 20);
                cache.put(key, result);
            } else {
                result = cache.get(key);
            }
            return result;
        } else if (a < b && b < c) {
            int result1;
            int result2;
            int result3;

            NumberKey key1 = new NumberKey(a, b, c - 1);
            NumberKey key2 = new NumberKey(a, b - 1, c - 1);
            NumberKey key3 = new NumberKey(a, b - 1, c);

            if (cache.get(key1) == null) {
                result1 = w(a, b, c - 1);
                cache.put(key1, result1);
            } else {
                result1 = cache.get(key1);
            }

            if (cache.get(key2) == null) {
                result2 = w(a, b - 1, c - 1);
                cache.put(key2, result2);
            } else {
                result2 = cache.get(key2);
            }

            if (cache.get(key3) == null) {
                result3 = w(a, b - 1, c);
                cache.put(key3, result3);
            } else {
                result3 = cache.get(key3);
            }
            return result1 + result2 - result3;
        } else {

            int result1;
            int result2;
            int result3;
            int result4;

            NumberKey key1 = new NumberKey(a - 1, b, c);
            NumberKey key2 = new NumberKey(a - 1, b - 1, c);
            NumberKey key3 = new NumberKey(a - 1, b, c - 1);
            NumberKey key4 = new NumberKey(a - 1, b - 1, c - 1);

            if (cache.get(key1) == null) {
                result1 = w(a - 1, b, c);
                cache.put(key1, result1);
            } else {
                result1 = cache.get(key1);
            }

            if (cache.get(key2) == null) {
                result2 = w(a - 1, b - 1, c);
                cache.put(key2, result2);
            } else {
                result2 = cache.get(key2);
            }

            if (cache.get(key3) == null) {
                result3 = w(a - 1, b, c - 1);
                cache.put(key3, result3);
            } else {
                result3 = cache.get(key3);
            }

            if (cache.get(key4) == null) {
                result4 = w(a - 1, b - 1, c - 1);
                cache.put(key4, result4);
            } else {
                result4 = cache.get(key4);
            }
            return result1 + result2 + result3 - result4;
        }
    }

    public static class NumberKey {

        private final int a;
        private final int b;
        private final int c;

        public NumberKey(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            NumberKey numberKey = (NumberKey) o;
            return a == numberKey.a && b == numberKey.b && c == numberKey.c;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b, c);
        }

    }
}
