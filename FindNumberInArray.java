package com.app.InterviewQuestions;

public class FindNumberInArray {

    public static void main(String[] args) {
        int [] arr = {3,5,4,8,9,11,0,36,15};
        findNumberInArray(arr, 3);
    }

    static void  findNumberInArray(int [] arr, int number){

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == number){
                System.out.println("Searching number " + number + " is at index " + i);
                break;
            }
        }
    }
}
