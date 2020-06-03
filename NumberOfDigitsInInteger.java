package com.app.InterviewQuestions;

public class NumberOfDigitsInInteger {

    public static void main(String[] args) {
        numberOfDigits(5555);
    }


    static void numberOfDigits(int number){
        int count = 0;

        while (number != 0){
            number = number/10;
             count++;
        }
        System.out.println("Number of digits in integer is : " + count);
    }
}
