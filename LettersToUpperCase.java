package com.app.InterviewQuestions;

public class LettersToUpperCase {

    public static void main(String[] args) {
        toUpperCase("mcdonald");

    }


    static void toUpperCase(String str) {

        String macdonald = str.substring(0, 1).toUpperCase() + str.substring(1, 2) +
                str.substring(2, 3).toUpperCase() + str.substring(3, 8);
        System.out.println(macdonald);
    }

}
