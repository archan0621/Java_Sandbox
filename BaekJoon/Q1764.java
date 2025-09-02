package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1764 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        List<String> arr = new ArrayList<>();
        int count = 0;
        int result = 0;

        while(count < N+M) {
            String tmp = br.readLine();
            if(set.contains(tmp)) {
                result++;
                arr.add(tmp);
            } else {
                set.add(tmp);
            }
            count++;
        }

        Collections.sort(arr);

        System.out.println(result);
        arr.forEach(System.out::println);

    }

}
