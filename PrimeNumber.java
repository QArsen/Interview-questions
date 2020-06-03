package com.app.InterviewQuestions;


import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {
        int [] arr = new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        isPrimeNumber(11);

        //findPrimeNumberInArray(arr);
    }



    static void isPrimeNumber(int number){

        boolean flag = false;
        for (double i = 2; i <=number / 2 ; i++) {
            if (number % i == 0){
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println(number + " is  a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }


    static void findPrimeNumberInArray(int [] arr){


        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] % 2 !=0){
                System.out.println(arr[i]);
            }
        }

    }
}
