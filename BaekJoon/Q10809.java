package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q10809 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int[] firstOccurrence = new int[26]; // 알파벳 소문자 개수만큼 배열 초기화

        // 배열을 -1로 초기화
        Arrays.fill(firstOccurrence, -1);

        // 각 알파벳의 처음 등장 위치 찾기
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            int index = currentChar - 'a';

            // 처음 등장한 경우에만 위치 저장
            if (firstOccurrence[index] == -1) {
                firstOccurrence[index] = i;
            }
        }

        // 결과 출력
        for (int position : firstOccurrence) {
            System.out.print(position + " ");
        }
    }

}
