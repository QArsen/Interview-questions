package com.app.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesNamesInString {

    public static void main(String[] args) {
        String[] arr = {"Java", "JavaScript", "C", "Ruby", "Python", "C++", "Java", "C#", "JavaScript"};

        String string = "Java JavaScript C Ruby Python C Java C JavaScript";
        // findDuplicatesInString(arr);
        findDuplicatesInStringUsingMap(string);
    }


    static void findDuplicatesInString(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    System.out.println("Duplicate word is : " + arr[i]);
                }
            }

        }

    }


    static void findDuplicatesInStringUsingMap(String str) {
        String [] words = str.split(" ");
        Map <String, Integer> duplicates = new HashMap<>();
        for (String word : words) {
            if (duplicates.containsKey(word)){
                duplicates.put(word, duplicates.get(word) +1);
            } else {
                duplicates.put(word, 1);
            }
        }

        Set<String> set = duplicates.keySet();
        for (String word : set) {
            if (duplicates.get(word) > 1){
                System.out.println("Word " + "'" + word + "'"+ " duplicates " + duplicates.get(word) + " times");
            }
        }

    }


}
