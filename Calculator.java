package com.app.InterviewQuestions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        calculator();
    }


    static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your first number");
        double first = scanner.nextDouble();
        System.out.println("Please, enter your operator : '+' , '-' '*' or '/'");
        char operator = scanner.next().charAt(0);
        System.out.println("Please enter your second number");
        double second = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.println("Please, try correct operator");
                break;
        }
        System.out.println(result);
    }

}
