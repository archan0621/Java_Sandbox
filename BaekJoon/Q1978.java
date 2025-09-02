package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1978 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int count = 0;

        for (int i = 0; i < size; i++) {
            int tmp = sc.nextInt();

            List<Integer> list = new ArrayList<>();

            for(int k = 1 ; k < tmp ; k++) {
                if(tmp%k==0) {
                    list.add(k);
                }
            }

            if(list.size() == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

}
