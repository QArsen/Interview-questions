package com.app.InterviewQuestions;

public class NumberIsPalindrome {

    public static void main(String[] args) {

        isPalindrome(1221);
    }



    static void isPalindrome(int num) {
        int temp = 0;
        int reversed = 0;
        int actual = num;

        while (num !=0){
            temp = num % 10;
            reversed = reversed * 10 + temp;
            num = num /10;
        }

        if (actual == reversed){
            System.out.println("Number "  + reversed + " is Palindrome");
        } else {
            System.out.println("Number "  + reversed + " is not Palindrome");
        }

    }
}
