package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2675 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();

        ArrayList<Integer> size = new ArrayList<Integer>(line);
        ArrayList<String> ex = new ArrayList<String>(line);

        for (int i = 0 ; i < line ; i++) {
            size.add(sc.nextInt());
            ex.add(sc.next());
        }


        for(int j = 0 ; j < line ; j++) {
            for (int k = 0; k < ex.get(j).length(); k++) {
                for (int l = 0; l < size.get(j); l++) {
                    System.out.print(ex.get(j).charAt(k));
                }
            }
            System.out.print("\n");
        }

    }
}
