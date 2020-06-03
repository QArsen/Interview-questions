package com.app.InterviewQuestions;

public class SortString {

    static String[] str = {"Java", "Tatiana", "Dog", "Evelina", "Alina", "Bob"};

    public static void main(String[] args) {

        for (String s : sortWordInString(str)) {
            System.out.println(s);
        }

    }


    static String[] sortWordInString(String[] str) {
        String temp = "";
        if (str.length == 0) {
            return str;

        } else {
            for (int i = 0; i < str.length; i++) {
                for (int j = i + 1; j < str.length; j++) {
                    if (str[i].compareTo(str[j]) > 0) {
                        temp = str[i];
                        str[i] = str[j];
                        str[j] = temp;
                    }
                }
            }
        }
        return str;
    }

}

