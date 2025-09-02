package BaekJoon;

import java.util.HashMap;
import java.util.Scanner;

public class Q25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float cnt = 0.00F;
        float majorCnt = 0.00F;

        HashMap<String, Float> m = new HashMap<String, Float>();
        m.put("A+", 4.5F);
        m.put("A0", 4.0F);
        m.put("B+", 3.5F);
        m.put("B0", 3.0F);
        m.put("C+", 2.5F);
        m.put("C0", 2.0F);
        m.put("D+", 1.5F);
        m.put("D0", 1.0F);
        m.put("F", 0.0F);

        for (int i = 0 ; i < 20 ; i++) {
            String major = sc.next();
            float score = sc.nextFloat();
            String grade = sc.next();

            if(!grade.equals("P")) {
                majorCnt += score;
                Float v = m.get(grade);
                cnt += score*v;
            }
        }

        System.out.printf("%6f", cnt/majorCnt);
    }
}
