package com.app.InterviewQuestions;


public class ArrayAverageValue {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 5};

        System.out.println(countAverageValue(arr));
    }


    static double countAverageValue(int[] arr) {
        double sum = 0;
        double average = 0;
        for (int value : arr) {
            sum += value;
            average = sum / arr.length;
        }
        return average;
    }
}
