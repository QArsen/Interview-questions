package com.app.InterviewQuestions;

import java.util.Arrays;

public class SortArray {

    static int[] arr = {100, 12, 5, 6, 1, 3, 4, 13, 2, -70, 5, 0};

    public static void main(String[] args) {

        System.out.println("Array before sort : " + Arrays.toString(arr));
        System.out.println("Array before sort : " + Arrays.toString(sortArray(arr)));
    }


    static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
