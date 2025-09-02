package SandBox;

import java.util.Scanner;

public class NameCouple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력해주세요!");
        String name1 = sc.nextLine();

        System.out.println("이름을 또 입력해주세요!");
        String name2 = sc.nextLine();

        System.out.println(name1);
        System.out.println(name2);
    }



}