package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q1620 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int exampleSize = Integer.parseInt(st.nextToken());
        int questionSize = Integer.parseInt(st.nextToken());

        Map<Integer, String> map = new HashMap<>(exampleSize);
        Map<String, Integer> map2 = new HashMap<>(exampleSize);

        for(int i = 1 ; i <= exampleSize ; i++) {
            String name = br.readLine();
            map.put(i, name);
            map2.put(name, i);
        }

        int count = 0;

        while(count < questionSize) {
            String tmp = br.readLine();

            if(tmp.chars().allMatch(Character::isAlphabetic)) {
                Integer i = map2.get(tmp);
                sb.append(i).append("\n");
            } else {
                String s = map.get(Integer.parseInt(tmp));
                sb.append(s).append("\n");
            }
            count++;
        }

        System.out.println(sb);

    }

}
