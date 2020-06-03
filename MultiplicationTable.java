package com.app.InterviewQuestions;

public class MultiplicationTable {

    public static void main(String[] args) {
        multiTable(4, 10);
    }


    static void multiTable(int num, int size) {
        for (int i = 0; i <=size ; i++) {
            System.out.println(num + " * " + i + " equals to " + num * i);
        }
    }
}
