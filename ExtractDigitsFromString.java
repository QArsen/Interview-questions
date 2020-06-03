package com.app.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ExtractDigitsFromString {
    public static void main(String[] args) {
        extractDigitsFromString("asdfg12345f6t78yh");
    }


    static void extractDigitsFromString(String str) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                sb.append(str.charAt(i));
            }
        }

        int result = 0;
        int factor = 1;

        for (int i = sb.length()-1; i >=0; i--) {
            result += (sb.charAt(i) - '0') * factor;
            factor *= 10;
        }

        System.out.println(result);

    }
}
