package com.app.InterviewQuestions;

import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {
        int [] arr = {2,4,5,8,6,3,7};
        System.out.println(Arrays.toString(arr));
        removeElementFromArray(arr, 8);
        System.out.println(Arrays.toString(arr));
    }


    static int[] removeElementFromArray(int [] arr, int element) {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == element){
                arr [i] = arr[i+1];
            }
        }
        return arr;
    }
}
