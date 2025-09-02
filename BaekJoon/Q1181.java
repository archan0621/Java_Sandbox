package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Q1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        Set<String> set = new LinkedHashSet<>();

        for (int i = 0; i < size; i++) {
            set.add(br.readLine());
        }

        String[] arr = set.toArray(new String[0]); // Convert set to array

        Arrays.sort(arr, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });

        for (String a : arr) {
            System.out.println(a);
        }
    }
}
