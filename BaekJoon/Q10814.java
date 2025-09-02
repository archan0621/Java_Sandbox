package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Account implements Comparable<Account> {
    public int age;
    public String id;

    public Account(int age, String id) {
        this.age = age;
        this.id = id;
    }

    @Override
    public int compareTo(Account o) {

        if (o.age == this.age) {
            return 0;
        }
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return age + " " +id;
    }
}

public class Q10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        Account[] ac = new Account[size];

        for (int i = 0; i < size; i++) {
            String[] s = br.readLine().split(" ");
            Account inst = new Account(Integer.parseInt(s[0]), s[1]);
            ac[i] = inst;
        }

        Arrays.sort(ac);

        for (Account a : ac) {
            System.out.println(a.toString());
        }
    }
}
