package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2839 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();
        int size = 0;

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0 ; i < 2000 ; i++) {
            for(int j = 0 ; j < 2000 ; j++) {
                if((i*5) + (j*3) == weight) {
                    numbers.add(i+j);
                }
            }
        }

        if(numbers.isEmpty()) {
            System.out.println(-1);
        } else{
            System.out.println(Collections.min(numbers));
        }

    }
}
