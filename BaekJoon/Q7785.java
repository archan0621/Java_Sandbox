package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Q7785 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());

        Set<String> set = new TreeSet<>(Comparator.reverseOrder());

        int count = 0;

        while(count < size) {

            String[] input = br.readLine().split(" ");

            if(input[1].equals("enter")) {
                set.add(input[0]);
            } else {
                set.remove(input[0]);
            }
            count++;
        }

        set.forEach(i -> sb.append(i).append("\n"));
        System.out.println(sb);

    }
}