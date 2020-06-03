package com.app.InterviewQuestions;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(100);
        System.out.println(fib(100));
    }

    static long fibonacci(int num) { //0 1 1 2 3 5 8 13 21 34 55
        long first = 0;
        long second = 1;
        long fibo = 0;
        int count = 1;

        if(num <=1) {
            System.out.println(num);
            return num;
        } else
        while (count < num){
            fibo = first + second;
            first = second;
            second = fibo;
            count ++;
        }

        System.out.println(fibo);
        return fibo;
    }


    static long fib(long n) {
        if (n <= 1)
            return n;
            return fib(n - 1) + fib(n - 2);

        }



}