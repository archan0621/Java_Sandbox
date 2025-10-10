package Algorithm;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] result = new int[arr1.length + arr2.length];

        int arr1Index = 0;
        int arr2Index = 0;

        for (int i = 0; i < result.length; i++) {

            if (arr1Index >= arr1.length) {
                result[i] = arr2[arr2Index];
                arr2Index++;
            } else if (arr2Index >= arr2.length) {
                result[i] = arr1[arr1Index];
                arr1Index++;
            }
            else if (arr1[arr1Index] <= arr2[arr2Index]) {
                result[i] = arr1[arr1Index];
                arr1Index++;
            } else {
                result[i] = arr2[arr2Index];
                arr2Index++;
            }
        }


        for (int a : result) {
            System.out.print(a + " ");
        }

    }
}
