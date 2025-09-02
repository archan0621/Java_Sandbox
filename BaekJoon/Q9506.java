package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0 ; i < 100000 ; i++) {

            int val = sc.nextInt();
            int result = 0;

            if(val == -1) {
                break;
            }

            List<Integer> list = new ArrayList<>();

            for(int j = 1 ; j < val ; j++) {
            if(val%j==0) {
                list.add(j);
                }
            }

            for(int k : list) {
                result += k;
            }

            if (val == result) {
                System.out.print(val + " = ");
                for(int l = 0 ; l < list.size() ; l++) {
                    if (l == list.size()-1) {
                        System.out.print(list.get(l));
                        System.out.println();
                    } else {
                        System.out.print(list.get(l) + " + ");
                    }
                }
            } else {
                System.out.println(val + " is NOT perfect.");
            }
    }
    }
}
