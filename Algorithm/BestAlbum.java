package Algorithm;

import java.util.*;

public class BestAlbum {

    static class Song {
        final int idx;
        final int plays;
        Song(int idx, int plays) {
            this.idx = idx;
            this.plays = plays;
        }
    }

    public static int[] bestAlbum(String[] genres, int[] plays) {
        // 1) 장르 총 재생수 집계
        Map<String, Integer> genreTotal = new HashMap<>();
        // 2) 장르별 곡 리스트
        Map<String, List<Song>> byGenre = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String g = genres[i];
            int p = plays[i];
            genreTotal.put(g, genreTotal.getOrDefault(g, 0) + p);
            byGenre.computeIfAbsent(g, k -> new ArrayList<>()).add(new Song(i, p));
        }

        // 3) 장르 우선순위: 총 재생수 내림차순
        List<String> orderedGenres = new ArrayList<>(genreTotal.keySet());
        orderedGenres.sort((g1, g2) -> Integer.compare(genreTotal.get(g2), genreTotal.get(g1)));

        // 4) 각 장르 내 정렬: 재생수 DESC, 인덱스 ASC → 앞에서 2개
        List<Integer> result = new ArrayList<>();
        for (String g : orderedGenres) {
            List<Song> songs = byGenre.get(g);
            songs.sort(
                Comparator
                    .comparingInt((Song s) -> s.plays).reversed()
                    .thenComparingInt(s -> s.idx)
            );
            for (int i = 0; i < songs.size() && i < 2; i++) {
                result.add(songs.get(i).idx);
            }
        }

        // 리스트 → 배열
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // 간단한 실행 예시
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] ans = bestAlbum(genres, plays);
        System.out.println(Arrays.toString(ans)); // [4, 1, 3, 0]
    }
}