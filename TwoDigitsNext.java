package com.app.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class TwoDigitsNext {

    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5,6,7,7,8,9,10};
        twoDigitsNext(arr);
    }


    static void twoDigitsNext(int [] arr){
        for (int i = 0; i < arr.length -1  ; i++) {
            for (int j = i+1; j < arr.length -1 ; j++) {
                if (arr[i] == (arr[j])) {
                    System.out.println("Two digits next is : " + arr[i]);
                }
            }
        }
    }
}
