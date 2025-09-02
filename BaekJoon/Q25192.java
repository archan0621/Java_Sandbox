package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Q25192 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean started = false;
        int size = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < size; i++) {
            String input = br.readLine();
            if (input.equals("ENTER")) {
                if (started) {
                    cnt += set.size();
                    set.clear();
                }
                started = true;
            } else {
                set.add(input);
            }
        }

        // 마지막 그룹의 크기를 추가
        cnt += set.size();

        System.out.println(cnt);
    }
}
