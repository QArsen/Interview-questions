package com.app.InterviewQuestions;

public class FindMissingNumberInArray {


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,8,9,10};
        findMissingNumberInArray(arr);
    }


    static  void findMissingNumberInArray(int [] arr){


        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }

        int sum1 = 0;
        for (int j = 0; j <= 10; j++) {
            sum1 += j;
        }


        System.out.println("Missing number is : " + (sum1-sum));
    }


}
