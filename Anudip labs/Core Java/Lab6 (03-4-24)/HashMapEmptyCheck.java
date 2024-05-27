/* 1. Write a Java program to check whether a HashMap contains key-value mappings (empty)
 or not.
*/

import java.util.HashMap;

public class HashMapEmptyCheck {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Checking if the HashMap is empty
        if (hashMap.isEmpty()) {
            System.out.println("HashMap is empty.");
        } else {
            System.out.println("HashMap is not empty.");
        }

        // Adding some key-value pairs
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);

        // Checking again if the HashMap is empty
        if (hashMap.isEmpty()) {
            System.out.println("HashMap is empty.");
        } else {
            System.out.println("HashMap is not empty.");
        }
    }
}


/***********************OUTPUT********************************************
HashMap is empty.
HashMap is not empty.
*/
