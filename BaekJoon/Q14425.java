package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q14425 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int dataSize = Integer.parseInt(st.nextToken());

        int readSize = Integer.parseInt(st.nextToken());

        Set<String> hashSet = new HashSet<>(dataSize);

        int count = 0;
        int result = 0;

        while(count < dataSize) {
            hashSet.add(br.readLine());
            count++;
        }

        count = 0;

        while (count < readSize) {
            if(hashSet.contains(br.readLine())) {
                result++;
            }
            count++;
        }
        System.out.println(result);
    }

}
