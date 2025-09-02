package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4779 {

    static int n;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while((str = br.readLine()) != null ) {
            n = Integer.parseInt(str);
            int len = (int) Math.pow(3, n);

            sb = new StringBuilder();

            for (int i = 0; i < len; i++) {
                sb.append("-");
            }

            divide(0, len);
            System.out.println(sb.toString());
        }

    }

    public static void divide(int start, int size) {
        if(size == 1) { return; }

        int newSize = size / 3;

        for(int i = start + newSize ; i < start + 2 * newSize ; i++ ) {
            sb.setCharAt(i, ' ');
        }

        divide(start, newSize);
        divide(start + 2 * newSize, newSize);
    }
}