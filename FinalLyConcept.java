package com.app.InterviewQuestions;

public class FinalLyConcept {
    public static void main(String[] args) {

        divideByZero();
    }


    static void divideByZero() {

        int sum = 0;
        try {
            System.out.println(sum = 5 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
                System.out.println(sum = 0 / 5);
        }
    }
}
