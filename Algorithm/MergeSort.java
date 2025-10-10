package Algorithm;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 5, 2, 7, 6, 4};
        mergeSort(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        int i = 0;
        while (i < leftSize) {
            leftArr[i] = arr[left + i];
            i++;
        }

        int j = 0;
        while (j < rightSize) {
            rightArr[j] = arr[mid + 1 + j];
            j++;
        }

        // 병합 단계
        int leftIndex = 0;
        int rightIndex = 0;
        int mergedIndex = left;

        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftArr[leftIndex] <= rightArr[rightIndex]) {
                arr[mergedIndex] = leftArr[leftIndex];
                leftIndex++;
            } else {
                arr[mergedIndex] = rightArr[rightIndex];
                rightIndex++;
            }
            mergedIndex++;
        }

        // 남은 왼쪽 요소 복사
        while (leftIndex < leftSize) {
            arr[mergedIndex] = leftArr[leftIndex];
            leftIndex++;
            mergedIndex++;
        }

        // 남은 오른쪽 요소 복사
        while (rightIndex < rightSize) {
            arr[mergedIndex] = rightArr[rightIndex];
            rightIndex++;
            mergedIndex++;
        }
    }

}

