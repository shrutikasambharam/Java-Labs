/* Create a class named Book with attributes title, author, ISBN, and price. 
Include methods to get and set the attributes. */

import java.util.Scanner;   // imported Scanner
class Book  //class created
{   //Declared all instance variables
	String title;
	String author;
	String isbn;
	int price ;
	void get()   //declare method to get user input
	{	
		//getting the input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter title:");
		this.title=sc.next();
		System.out.println("Enter Name Author:");
		this.author=sc.next();
		System.out.println("Enter ISBN:");
		this.isbn=sc.next();
		System.out.println("Enter Price:");
		this.price=sc.nextInt();
	}
	void set()    //create the function to display the output
	{
		System.out.println("Title= "+this.title+", Author Name= "+this.author+", ISBN= "+this.isbn+", Price= "+this.price);
	}
}
class BookDemo    //create main class
{
	public static void main(String args[])   //Define the main method
	{	
		Book b1=new Book();       //Created the employee class object 
		b1.get();                 // call the get method 
		b1.set();                 // call the set method 
		                       
		Book b2=new Book();     //Created another employee class object
		b2.get();           // call the get method
		b2.set();           // call the set method 
	 }
}