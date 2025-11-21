package Algorithm;

public class Coupon {

    public static void main(String[] args) {

        int[] price = {30000, 2000, 1500000};
        int[] coupon = {20, 40};

        int priceIndex = 0;
        int result = 0;

        mergeSort(price, 0, price.length - 1);
        mergeSort(coupon, 0, coupon.length - 1);

        for (int i = 0; i < coupon.length; i++) {
            int tmpPrice = price[priceIndex];
            int tmpCoupon = coupon[i];

            result += tmpPrice * (100 - tmpCoupon) / 100;
            priceIndex++;
        }

        if (price.length > priceIndex) {
            for (int i = priceIndex; i < price.length; i++) {
                result += price[i];
            }
        }

        System.out.println(result);


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

        // 병합 단계 (내림차순으로 변경)
        int leftIndex = 0;
        int rightIndex = 0;
        int mergedIndex = left;

        while (leftIndex < leftSize && rightIndex < rightSize) {
            // 🔽 여기 비교 조건만 반대로 바뀜!
            if (leftArr[leftIndex] >= rightArr[rightIndex]) {
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
