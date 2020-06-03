package com.app.InterviewQuestions;

public class Factors {


    public static void main(String[] args) {
        factors(15); //10 divides on 1,2,5,10
                          // 15 divides on 1,3,5,15

    }


    static void factors(int num) {

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");
            }
        }
    }

}
