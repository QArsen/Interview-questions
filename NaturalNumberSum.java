package com.app.InterviewQuestions;

public class NaturalNumberSum {

    public static void main(String[] args) {

        sumNumber(5); // 1,2,3,4,5
    }

    static void sumNumber (int number) {
        int sum = 0;

        for (int i = 0; i <= number ; i++) {
            sum = sum +i;
        }
        System.out.println(sum);
    }
}
