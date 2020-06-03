package com.app.InterviewQuestions;



public class PowerConcept {

    public static void main(String[] args) {

       powerConcept(2,6);
    }


    static void powerConcept(int num, int exponent) {
        long res = 1;

        while (exponent != 0) {
            res *= num;
            exponent--;
        }
        System.out.println("Result is : " + res);
    }
}
