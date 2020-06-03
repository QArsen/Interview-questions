package com.app.InterviewQuestions;

public class Abecedarian {

    public static void main(String[] args) {

        System.out.println(isAbecedarian("abrcde"));
    }


    public static boolean isAbecedarian(String s) {
        int index = s.length() - 1;

        for (int i = 0; i < index; i++) {

            if (s.charAt(i) <= s.charAt(i + 1)) {
            } else {
                return false;
            }
        }
        return true;
    }
}
