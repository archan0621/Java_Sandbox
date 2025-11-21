package Algorithm;

import java.util.Collections;
import java.util.PriorityQueue;

public class Ramen {
    public static void main(String[] args) {
        int stock = 4;
        int[] dates = {4, 10, 15};
        int[] supplies = {20, 5, 10};
        int k = 30;

        int ans = minImports(stock, dates, supplies, k);
        System.out.println(ans); // 기대값: 2
    }

    public static int minImports(int stock, int[] dates, int[] supplies, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int i = 0;      // 아직 힙에 넣지 않은 다음 공급 인덱스
        int count = 0;  // 해외 수입 횟수

        // 재고가 원공장 복구일 k에 도달하거나 넘어설 때까지 반복
        while (stock < k) {
            // 현재 재고로 '도달 가능한 날짜'에 있는 모든 공급 후보를 힙에 넣는다
            // (0일 시작 기준: stock 톤이면 stock일까지 버팀 → dates[i] <= stock 이면 오늘 이전/오늘 도착분 수령 가능)
            while (i < dates.length && dates[i] <= stock) {
                maxHeap.offer(supplies[i]);
                i++;
            }

            // 후보가 없다면 더 이상 버틸 수 없음(문제 조건상 보통은 발생하지 않지만 안전장치)
            if (maxHeap.isEmpty()) {
                throw new IllegalStateException("주어진 공급 일정으로는 k일까지 버틸 수 없습니다.");
            }

            // 가장 큰 공급을 한 번만 받아서(횟수 최소화) 재고를 늘린다
            stock += maxHeap.poll();
            count++;
        }
        return count;
    }
}
