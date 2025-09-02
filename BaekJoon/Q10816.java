package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q10816 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int exampleSize = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Map<Integer, Integer> map = new HashMap<>(exampleSize);

        while(st.hasMoreElements()) {
            int tmp = Integer.parseInt(st.nextToken());
            if(map.containsKey(tmp)) {
                Integer i = map.get(tmp);
                i++;
                map.replace(tmp, i);
            } else {
                map.put(tmp, 1);
            }
        }

        int questionSize = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        while(st2.hasMoreElements()) {
            sb.append(map.getOrDefault(Integer.parseInt(st2.nextToken()), 0)).append(" ");
        }

        System.out.println(sb);

    }
}
