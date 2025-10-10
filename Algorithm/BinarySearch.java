package Algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int target = 14;

        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {   // ✅ 조건은 범위가 겹칠 때까지만
            int index = (startIndex + endIndex) / 2;

            if (arr[index] == target) {
                System.out.println("찾은 인덱스: " + index);
                return;
            }

            if (arr[index] > target) {
                endIndex = index - 1;   // ✅ target은 왼쪽에 있음
            } else {
                startIndex = index + 1; // ✅ target은 오른쪽에 있음
            }
        }

        System.out.println("찾는 값 없음");
    }
}