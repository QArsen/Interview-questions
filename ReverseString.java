package com.app.InterviewQuestions;

public class ReverseString {

    public static void main(String[] args) {
        //stringBuffer("Selenium");
        simpleReverse("Something");
    }


    static void stringBuffer(String str) {
        StringBuffer sb = new StringBuffer();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }

    static void simpleReverse(String str){
        int length = str.length();
        String reverse = "";

        str.replaceAll("", "");

        for (int i = length -1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
}
