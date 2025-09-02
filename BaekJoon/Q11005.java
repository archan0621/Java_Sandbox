package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
* 이거 진법 변환 문제인데 너가 푼거 아니니까 나중에 꼭 똑똑해지면 복습해라 이거 이해 못하고 넘어가는거니까
*/

public class Q11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        List<Character> list = new ArrayList<>();
        while (n > 0) {
            if (n % b < 10) {
                list.add((char) (n % b + '0'));
            }
            else{
                list.add((char) (n % b - 10 + 'A'));
            }
            n /= b;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }

    }
}
