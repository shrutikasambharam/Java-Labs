/*  Write a program using ArrayDeque to add book names and add,delete the values from both ends of que. */
// Package declaration
package com.collectionexample;   
// Importing the ArrayDeque class from java.util package
import java.util.ArrayDeque; 

public class BookQueueExample 
{
    public static void main(String[] args)  // Main method
    {
        // Create a new ArrayDeque to store book names
        ArrayDeque<String> bookQueue = new ArrayDeque<>(); 

        // Adding books to the deque
        bookQueue.add("HTML"); 
        bookQueue.add("CSS"); 
        bookQueue.add("JS"); 

        // Printing the initial queue
        System.out.println("Initial Queue: " + bookQueue); // Printing the initial queue

        // Adding a book at the front of the queue
        String newBookFront = "JAVA"; 
        bookQueue.addFirst(newBookFront);   // Adding SQL front of the queue
        System.out.println("After adding '" + newBookFront + "' at the front: " + bookQueue); 

        // Adding a book at the end of the queue
        String newBookEnd = "SQL"; 
        bookQueue.addLast(newBookEnd); // Adding SQL at the end
        System.out.println("After adding '" + newBookEnd + "' at the end: " + bookQueue); 

        // Removing a book from the front of the queue
        String removedFromFront = bookQueue.removeFirst(); // Removing JAVA from the front
        System.out.println("Removed from the front: " + removedFromFront); 
        System.out.println("After removing from the front: " + bookQueue); 

        // Removing a book from the end of the queue
        String removedFromEnd = bookQueue.removeLast(); // Removing SQL from the end
        System.out.println("Removed from the end: " + removedFromEnd); 
        System.out.println("After removing from the end: " + bookQueue); 
    }
}

/*
OUTPUT:

Initial Queue: [HTML, CSS, JS]
After adding 'JAVA' at the front: [JAVA, HTML, CSS, JS]
After adding 'SQL' at the end: [JAVA, HTML, CSS, JS, SQL]
Removed from the front: JAVA
After removing from the front: [HTML, CSS, JS, SQL]
Removed from the end: SQL
After removing from the end: [HTML, CSS, JS]

*/