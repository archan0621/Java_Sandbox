package BaekJoon;

import java.util.Scanner;

import java.util.Scanner;

public class Q1152 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ex = sc.nextLine();

        int count = countWords(ex);

        System.out.println(count);
    }

    private static int countWords(String input) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isWhitespace(currentChar)) {
                // If we were in a word, increase the count
                if (inWord) {
                    count++;
                    inWord = false;
                }
            } else {
                // We are in a word
                inWord = true;
            }
        }

        // Check for the last word
        if (inWord) {
            count++;
        }

        return count;
    }
}


