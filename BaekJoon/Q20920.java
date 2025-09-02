package BaekJoon;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q20920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordFrequency = new HashMap<>();


        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if(word.length() >= M) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(wordFrequency.keySet());

        words.sort((w1, w2) -> {
            int freqCompare = wordFrequency.get(w2).compareTo(wordFrequency.get(w1));
            if (freqCompare != 0) {
                return freqCompare;
            }
            int lengthCompare = Integer.compare(w2.length(), w1.length());
            if (lengthCompare != 0) {
                return lengthCompare;
            }
            return w1.compareTo(w2);
        });


        StringBuilder sb = new StringBuilder();
        words.forEach(i -> sb.append(i).append("\n"));

        System.out.println(sb.toString());

    }
}
