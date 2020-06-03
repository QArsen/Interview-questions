package com.app.InterviewQuestions;

public class CharacterIsAlphabet {
    public static void main(String[] args) {

        isAlphabet("Helloword2$streetexam");
    }



    static void isAlphabet(String words) {

        StringBuffer sb = new StringBuffer();
      char [] ch = words.toCharArray();

        for (char letter : ch) {
            if (Character.isAlphabetic(letter)){
                sb.append(letter);
            }
        }
        System.out.println(sb);
    }
}
