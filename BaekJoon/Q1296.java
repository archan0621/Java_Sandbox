package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q1296 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer initNum = new StringTokenizer(br.readLine(), " ");
        int size = Integer.parseInt(initNum.nextToken());
        int size2 = Integer.parseInt(initNum.nextToken());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int result = 0;

        while (st.hasMoreElements()) {
            set1.add(Integer.parseInt(st.nextToken()));
        }

        while (st2.hasMoreElements()) {
            set2.add(Integer.parseInt(st2.nextToken()));
        }

            for (Integer i : set2) {
                if (!set1.contains(i)) {
                    result++;
                }
            }

            for (Integer i : set1) {
                if (!set2.contains(i)) {
                    result++;
                }
            }

        System.out.println(result);


    }
}
