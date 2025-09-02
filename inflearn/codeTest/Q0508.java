package inflearn.codeTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
        int id;
        int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Q0508 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int answer = 1;
        int[] arr = new int[N];
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            queue.add(new Person(i, arr[i]));
        }

        while (!queue.isEmpty()) {
            Person tmp = queue.poll();

            for (Person x : queue) {
                if (x.priority > tmp.priority) {
                    queue.add(tmp);
                    tmp = null;
                    break;
                }
            }

            if (tmp != null) {
                if(tmp.id==M) System.out.println(answer);
                else answer++;
            }
        }


    }
}
