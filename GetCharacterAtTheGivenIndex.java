package com.app.InterviewQuestions;

public class GetCharacterAtTheGivenIndex {

    public static void main(String[] args) {
        getCharacterAtTheGivenIndex("getCharacterAtTheGivenIndex", 0);
    }

    static  void getCharacterAtTheGivenIndex(String input, int index ){

        char[] str = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            if (i == index){
                System.out.println(str[i] + " is on " + i + " position" );
            }
        }
    }
}
