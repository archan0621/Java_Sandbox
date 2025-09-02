package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2581 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();

        List<Integer> primes = getPrimes(min, max);

        if (primes.isEmpty()) {
            System.out.println("-1");
        } else {
            int sum = primes.stream().mapToInt(Integer::intValue).sum();
            int minPrime = Collections.min(primes);

            System.out.println(sum);
            System.out.println(minPrime);
        }
    }

    public static List<Integer> getPrimes(int min, int max) {
        boolean[] isPrime = new boolean[max + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = Math.max(2, min); i <= max; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

}
