package com.app.InterviewQuestions;

public class SwapTwoIntegersWithoutUsingTemp {

    public static void main(String[] args) {
        //swapTwoIntegersWithoutUsingTemp(5, 10);
        swapTwoStrings("Hello", "World");
    }


    static void swapTwoIntegersWithoutUsingTemp(int x, int y) {

//        x = x + y;
//        y = x - y;
//        x = x - y;

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("First = " + x + "\nSecond = " + y);

    }


    static  void swapTwoStrings( String a, String b) {

        a = a + b;
        b = a.substring(0, a.length()- b.length());
        a = a.substring(b.length());
        System.out.println(a);
        System.out.println(b);
    }
}
