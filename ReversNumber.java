package com.app.InterviewQuestions;

public class ReversNumber {

    public static void main(String[] args) {
        reverseNumber(123);
    }


    static void reverseNumber(int number) {

        int temp = 0;
        int reverse = 0;

        while (number != 0){
            temp = number % 10;
            reverse = reverse *10 + temp;
            number /=10;
        }

        System.out.println(reverse);
    }
}
