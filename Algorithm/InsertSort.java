package Algorithm;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 5, 2, 7, 9, 8};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j; // j를 for문 밖에서 선언 (마지막 위치 기억용)

            // i-1부터 0까지 감소하면서 key보다 큰 값들을 뒤로 미는 for문
            for (j = i - 1; j >= 0 && arr[j] > key; j--) {
                arr[j + 1] = arr[j];
            }

            // for문이 끝나면 j가 key보다 작은 원소의 위치에 있음
            arr[j + 1] = key;
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
