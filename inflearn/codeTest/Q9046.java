package inflearn.codeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q9046 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < size; i++) {
            char[] array = scanner.nextLine().toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            int bigValue = 0;
            char bigKey = '?';
            for (char c : array) {
                if (c == ' ') continue;
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > bigValue) {
                    bigValue = entry.getValue();
                    bigKey = entry.getKey();
                } else if (entry.getValue() == bigValue) {
                        bigKey = '?';
                }
            }
            System.out.println(bigKey);
        }

    }
}
