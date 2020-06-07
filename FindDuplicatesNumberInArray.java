package com.app.InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesNumberInArray {

    public static void main(String[] args) {

        int[] arr = {10, 1, 2, 5, 5, 6, 6, 10, 7, 2,};
        findDuplicates(arr);
        findDuplicatesWithSet(arr);
    }

    static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " + arr[j]);
                }
            }
        }
    }

    static void findDuplicatesWithSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int value : arr) {
            if (!set.add(value))
                System.out.println("Duplicates in array are :" + value);
        }
    }
}
