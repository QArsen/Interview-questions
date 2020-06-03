package com.app.InterviewQuestions;

public class FindSecondLargestNumberInArray {


    static int[] arr = new int[]{100,75,15,-2,1, 2, 4, 60,3,101,250};

    public static void main(String[] args) {
        findSecondLargestNumberInArray(arr);
    }


    static void findSecondLargestNumberInArray(int[] arr) {

        int largest = arr[0];
        int secondLargest = arr[1];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (largest != arr[i] && arr[i] > secondLargest){
                secondLargest = arr[i];

            }
        }

        System.out.println(secondLargest);



    }
}
