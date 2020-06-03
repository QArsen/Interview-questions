package com.app.InterviewQuestions;

public class PrimeNumberInRange {

    public static void main(String[] args) {
        primeNUmberInRange(20, 50);
    }


    static void primeNUmberInRange(int low, int high) {

        while (low < high) {
            boolean flag = false;
            for (int i = 2; i <= low / 2; i++) {
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(low + "");
            }

            low++;
        }
    }
}
