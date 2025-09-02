package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2501 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();
        int loc = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 1 ; i < val ; i++) {
            if(val%i==0) {
                list.add(i);
            }
        }

        list.add(val);

        try {
            System.out.println(list.get(loc - 1));
        }catch (IndexOutOfBoundsException e) {
            System.out.println("0");
        }
    }
}
