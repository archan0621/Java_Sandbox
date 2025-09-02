package BaekJoon;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2108 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        System.out.println(calAvg(arr, size));
        System.out.println(centerVal(arr));
        System.out.println(mostVal(arr));
        System.out.println(rangeVal(arr));
    }

    private static Integer calAvg(List<Integer> arr, int N) {
        int all = arr.stream().mapToInt(i -> i).sum();
        return Math.round((float) all / N);
    }

    private static Integer centerVal(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size() / 2);
    }

    private static Integer mostVal(List<Integer> arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        arr.forEach(i -> {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        });

        List<Map.Entry<Integer, Integer>> frequencyList = new ArrayList<>(frequencyMap.entrySet());
        frequencyList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        int highestFrequency = frequencyList.get(0).getValue();
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyList) {
            if (entry.getValue() == highestFrequency) {
                modes.add(entry.getKey());
            } else {
                break;
            }
        }

        if (modes.size() > 1) {
            Collections.sort(modes);
            return modes.get(1);
        } else {
            return modes.get(0);
        }
    }

    private static Integer rangeVal(List<Integer> arr) {
        Collections.sort(arr);

        TreeSet<Integer> set = new TreeSet<>(arr);

        return set.last() - set.first();
    }

}
