/*  2.  Write a program to demonstrate static block take two static variables name and id and print them.     */
public class StaticBlock   // define class
{
	// defined the  static variables 
    static String name;   
    static int id;
    static     // created the static block to initialize the static variables
	{
        name = "Priya";     // Initialize static variables in the static block
        id = 110011;
		// Print the initialized static variables	
		//System.out.println("Name: " + name);
        //System.out.println("ID: " + id);
    }
    public static void main(String[] args)       // main method
	{
        //able to print this static variables here also
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

/*
************|| OUTPUT ||******************

D:\anudeep>javac StaticBlock.java
D:\anudeep>java StaticBlock

Name: Priya
ID: 110011

*/