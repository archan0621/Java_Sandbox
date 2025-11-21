package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Q16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().trim().toCharArray();

        Map<Character, List<Integer>> map = new HashMap<>();

        int index = 0;

        for (char a : arr) {
            if (!map.containsKey(a)) {
                List<Integer> list = new ArrayList<>();
                list.add(index);
                map.put(a, list);
            } else {
                List<Integer> list = map.get(a);
                list.add(index);
            }
            index++;
        }

        int count = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            char character = st.nextToken().toCharArray()[0];

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (!map.containsKey(character)) {
                System.out.println(0);
                continue;
            } else {
                List<Integer> list = map.get(character);
                int tmpResult = 0;

                for (int a : list) {
                    if (a >= start && a <= end) {
                        tmpResult++;
                    }
                }
                System.out.println(tmpResult);
            }

        }

    }
}
