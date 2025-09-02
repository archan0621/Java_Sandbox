package inflearn.codeTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q0401 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        sc.nextLine();
        String value = sc.nextLine();
        char[] arr = value.toCharArray();
        char maxKey = '\0';
        int maxValue = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < cnt; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int entryValue = entry.getValue();

            if (entryValue > maxValue) {
                maxValue = entryValue;
                maxKey = key;
            }
        }

        System.out.println(maxKey);

    }
}
