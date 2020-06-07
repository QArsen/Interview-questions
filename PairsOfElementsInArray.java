package com.app.InterviewQuestions;

public class PairsOfElementsInArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        pairsOfElementsInArray(arr, 3);
    }



    static void pairsOfElementsInArray(int [] arr, int number){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] + arr[j] == number){
                    System.out.println(number + " is the sum of " + arr[i] + " " + arr [j]);
                }
            }
        }
    }
}
