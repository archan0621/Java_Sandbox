package inflearn.codeTest;

import java.util.HashMap;
import java.util.Scanner;

public class Q0402 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] firstArr = sc.nextLine().toCharArray();
        char[] secondArr = sc.nextLine().toCharArray();

        HashMap<Character, Integer> firstMap = new HashMap<>();
        HashMap<Character, Integer> secondMap = new HashMap<>();

        boolean result = true;

        for (char c : firstArr) {
            firstMap.put(c, firstMap.getOrDefault(c, 0) + 1);
        }

        for (char c : secondArr) {
            secondMap.put(c, secondMap.getOrDefault(c, 0) + 1);
        }

        for (Character c : firstMap.keySet()) {
            Integer i = firstMap.get(c);
            Integer i1 = secondMap.get(c);

            if (i1 == null || !i.equals(i1) ) {
                result = false;
            }
        }

        System.out.println(result ? "YES" : "NO");

    }
}
