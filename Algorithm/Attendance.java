package Algorithm;

import Data_Structure.HashTable;

public class Attendance {
    public static void main(String[] args) {

        HashTable<String, String> hashTable = new HashTable<>();

        String[] inputArr = {"나연", "정연", "모모", "사나", "지효", "미나", "다현", "채영", "쯔위"};
        String[] resultArr = {"나연", "정연", "모모"};
        int result = 0;

        for (String tmp : resultArr) {
            hashTable.put(tmp, tmp);
        }

        for (String tmp : inputArr) {
            if (hashTable.get(tmp) == null) {
                result++;
            }
        }

        System.out.println(result);
    }


}
