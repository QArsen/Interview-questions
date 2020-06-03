package com.app.InterviewQuestions;

import java.util.Arrays;

public class Test {


    public static void main(String[] args) {

        int [] arr = {4,3,2,1};
        isPalindrome(511115);

       // System.out.println(Arrays.toString(insertionSort(arr)));
    }



    static void isPalindrome (int num) {
       int actualNumber = num;
       int reverse = 0;
       while (num > 0){
           int temp = num % 10;
           reverse = reverse * 10 + temp;
           num /= 10;
       }
       if (reverse == actualNumber){
           System.out.println("Number " + actualNumber + " is palindrome");
       } else {
           System.out.println("Number " + actualNumber + " is  not palindrome");
       }


    }


     static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            arr[j+1] = current;
        }
        return arr;
    }
}
