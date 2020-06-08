package com.app.InterviewQuestions;

public class CompareTwoStringsLexicographically {

    public static void main(String[] args) {
        compareTwoStringsLexicographically("String 1", "String 2");
    }


    static void compareTwoStringsLexicographically(String str1, String str2) {
        int res = str1.compareToIgnoreCase(str2);

        if (res == 0)
            System.out.println("Strings are equals");
        else
            System.out.println("Strings are not equals");
    }
}
