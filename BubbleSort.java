package com.app.InterviewQuestions;

import java.util.Arrays;

public class BubbleSort {

    static int [] arr = new int [] {74,68,59,135,100,12,8,1,166,2,40,51,63,75,89,113,148,3};
    //static int[] arr = new int[]{27};

    public static void main(String[] args) {
        //bubbleSort(arr);
        bubble_sort(arr);
        // autoSort(arr);


    }


    static void bubbleSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
            printArray(arr);
        }
    }


    static int[] bubble_sort(int[] arr) {
        if (arr.length == 1) {
            System.out.println("Array is sorted");
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        printArray(arr);

        return arr;
    }



    static void autoSort(int [] arr){
        Arrays.sort(arr);
        printArray(arr);

    }



    static void printArray(int[] arr) {
        for (int print : arr) {
            System.out.print(print + " ");

        }
        System.out.println(" ");
    }
}
