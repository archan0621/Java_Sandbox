package Algorithm;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {3,6,1,5,2,7,9,8,8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
