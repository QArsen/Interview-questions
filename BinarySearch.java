package com.app.InterviewQuestions;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,-1,12,7,15,40,24,-5,17,3};

        System.out.println(Arrays.toString(sortArray(arr)));
        System.out.println(binarySearch(arr, 12));
    }


    static int binarySearch(int[] arr, int elementToSearch) {
        int firstElement = 0;
        int lastElement = arr.length - 1;
        while (firstElement <= lastElement) {
            int middleElement = firstElement + (lastElement - firstElement) / 2;
            if (arr[middleElement] == elementToSearch) {
                return middleElement;
            } else if (elementToSearch < arr[middleElement]) {
                lastElement = middleElement - 1;
            } else if (elementToSearch > arr[middleElement]) {
                firstElement = middleElement + 1;
            }
        }
        return -1;
    }


    static  int []  sortArray(int [] arr){
        if (arr.length <=1){
            return arr;
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        return arr;
    }

}
