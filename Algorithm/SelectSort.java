package Algorithm;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {3,6,1,5,2,7,9,8,8};

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
