package BaekJoon;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q1157 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String upperCase = str.toUpperCase();

        // 문자 배열을 리스트로 변환하고 각 문자의 등장 횟수를 세기
        Map<Character, Long> charCount = upperCase.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // 등장 횟수가 가장 많은 값 찾기
        long maxCount = charCount.values().stream().max(Long::compare).orElse(0L);

        // 등장 횟수가 가장 많은 문자들 찾기
        String mostFrequentChars = charCount.entrySet().stream()
                .filter(entry -> entry.getValue() == maxCount)
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println((mostFrequentChars.length() > 1 ? "?" : mostFrequentChars));
    }
}

