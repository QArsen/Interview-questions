package com.app.InterviewQuestions;

public class ReplaceCharacter {

    public static void main(String[] args) {
        replaceCharacter("!@#$%^&asdfg123456");
    }


    static void replaceCharacter (String str){

        StringBuffer sb = new StringBuffer();
        for (int i = 0;  i <=str.length()-1; i++) {
            if (! Character.isDigit(str.charAt(i)) && (! Character.isAlphabetic(str.charAt(i)))) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
