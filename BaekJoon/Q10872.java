package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10872 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        System.out.println(fact(N));
    }

    public static int fact(int n) {
        if (n == 0 ) {
            return 1;
        } else if (n <= 1) {
            return n;
        } else {
            return n * fact(n-1);
        }
    }

}