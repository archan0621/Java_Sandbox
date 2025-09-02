package inflearn.codeTest;

import java.util.Arrays;
import java.util.Scanner;

public class Q0110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.next();
        String reverseString = new StringBuilder(string).reverse().toString();
        char value = sc.next().toCharArray()[0];

        char[] orignalArr = string.toCharArray();
        char[] reverseArr = reverseString.toCharArray();

        int[] orginalNum = new int[orignalArr.length];
        int[] reverseNum = new int[reverseArr.length];
        int[] resultArr = new int[orignalArr.length];

        int tmp = 100;

        for (int i = 0; i < orignalArr.length; i++) {
            if(orignalArr[i] == value) {
                tmp = 0;
                orginalNum[i] = tmp;
            } else {
                tmp++;
                orginalNum[i] = tmp;
            }
        }

        tmp = 100;

        for (int i = 0; i < reverseArr.length; i++) {
            if(reverseArr[i] == value) {
                tmp = 0;
                reverseNum[i] = tmp;
            } else {
                tmp++;
                reverseNum[i] = tmp;
            }
        }

        reverseArray(reverseNum);

        for(int i = 0 ; i < reverseNum.length ; i++) {
            if(orginalNum[i] > reverseNum[i]) {
                resultArr[i] = reverseNum[i];
            } else if (orginalNum[i] < reverseNum[i]) {
                resultArr[i] = orginalNum[i];
            } else {
                resultArr[i] = orginalNum[i];
            }
        }

        for (int i : resultArr) {
            System.out.print(i + " ");
        }

    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
