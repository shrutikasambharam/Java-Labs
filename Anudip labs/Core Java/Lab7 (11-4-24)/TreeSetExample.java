/* Write a program using TreeSet insert Integer values and print them. */
// Package declaration
package com.collectionexample;    
// Importing the TreeSet class from java.util package
import java.util.TreeSet; 

public class TreeSetExample   // declare class
{
    public static void main(String[] args) // Main method
    {
        // Create a TreeSet to store integer values
        TreeSet<Integer> ts = new TreeSet<>(); 
		
        // Inserting integer values
        ts.add(10); 
        ts.add(30); 
        ts.add(80); 
        ts.add(50); 
        ts.add(40); 

        // Printing the TreeSet
        System.out.println("TreeSet values: " + ts); // Printing the values in the TreeSet
    }
}

/*

OUTPUT:

TreeSet values: [10, 30, 40, 50, 80]

*/