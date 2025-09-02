package inflearn.codeTest;

import java.util.HashSet;
import java.util.Scanner;

public class Q0605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();

        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            hashSet.add(sc.nextInt());
        }

        System.out.println(hashSet.size() == size ? "U" : "D");

    }
}
