/* Write a program using Vector to store the list of students details and print the details. */

// Package declaration
//package com.collectionexample;   
// Importing the Vector class from java.util package
import java.util.Vector; 

class Student    // Declaring  class
{
	// Declaring  variables
    public int id;          
    public String name;     
    public String email;    
    public String contact;  

    // Constructor to initialize student details
    public Student(int id, String name, String email, String contact) 
    {
         // Assigning  parameters to the following variable
		this.id = id;          
        this.name = name;      
        this.email = email;     
        this.contact = contact; 
    }
}

public class VectorExample  // Main class
{
    public static void main(String[] args)     // main method
    {
        Vector<Student> students = new Vector<>();           // Creating a new Vector to store Student objects

       // Adding students details by using  add() method
        students.add(new Student(1, "Shree", "shree@gmail.com", "9827637366"));    
        students.add(new Student(2, "Riya", "riya@gmail.com", "3678652764")); 
        students.add(new Student(3, "Omkar", "omkar@gamil.com", "3245367783")); 
        students.add(new Student(4, "Sachin", "sachin@gamil.com", "4567889333"));  

        // Printing student details
        for (Student student : students) 
        {
            System.out.println("ID: " + student.id);           
            System.out.println("Name: " + student.name);       
            System.out.println("Email: " + student.email);     
            System.out.println("Contact: " + student.contact); 
            System.out.println(); 
        }
    }
}
   

/**************************************OUTPUT********************************
 

ID: 1
Name: Shree
Email: shree@gmail.com
Contact: 9827637366

ID: 2
Name: Riya
Email: riya@gmail.com
Contact: 3678652764

ID: 3
Name: Omkar
Email: omkar@gamil.com
Contact: 3245367783

ID: 4
Name: Sachin
Email: sachin@gamil.com
Contact: 4567889333

*/
