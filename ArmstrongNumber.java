package com.app.InterviewQuestions;

public class ArmstrongNumber {

    public static void main(String[] args) {
        isNaArmstrongNumber (371);
    }


    static  void isNaArmstrongNumber(int number) {
        int actualNumber = number;
        int temp;
        double result = 0;
        while (actualNumber !=0){
            temp = actualNumber % 10;
            result = result + Math.pow(temp, 3);
            actualNumber = actualNumber /10;

        }

        if (result == number){
            System.out.println( number + " is armstrong number");
        } else {
            System.out.println( number + " is not armstrong number");
        }

    }
}
