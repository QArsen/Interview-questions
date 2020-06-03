package com.app.InterviewQuestions;

import java.util.Arrays;

public class SmallestAndLargestNumber {

    public static void main(String[] args) {
        int[] arr = {-98,1, 2, 3, 4, 5, 6, 7, 8, 9587};
        findSmallestAndLargestNumber(arr);
    }


    static void findSmallestAndLargestNumber(int[] arr) {
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Array is " + Arrays.toString(arr) +
                " \n Largest number is : " + largest + " \n And smallest number is : " + smallest);
    }
}
