/* 3. Write a class with the name Perimeter using function overload that computes the perimeter of a square,
 a rectangle and a circle.
Formula:
1.Perimeter of a square = 4*s
2.Perimeter of a rectangle = 2* (1 + b)
3.Perimeter of a circle = 2* (22/7) *r        */
import java.util.Scanner;
class Perimeter 
{
    // Method to calculate perimeter of a square
    public double calculatePerimeter(int side) 
	{
        return 4 * side;
    }
	// Method to calculate perimeter of a rectangle
    public double calculatePerimeter(double length, double breadth)     // mehtod overloading
	{
        return 2 * (length + breadth);
    }
	// Method to calculate perimeter of a circle
    public double calculatePerimeter(double radius)         // mehtod overloading
	{
        return 2 * (22.0 / 7.0) * radius;
    }
}
class UsePerimeter     // main class
{
    public static void main(String[] args)  //  main method
    {
        Perimeter pc = new Perimeter();     // created object of perimeter class
		Scanner scanner = new Scanner(System.in);
		char choice;
		do
		{
			System.out.print("Select choice to Find Perimeter (1. square, 2. rectangle, 3. circle): ");   // select the option to find perimeter
			int operation = scanner.nextInt();
			switch (operation)   
			{
				case 1:
					System.out.print("Enter sides of square :  " );   // getting user input
					int side = scanner.nextInt();
					System.out.println("Result: "+ pc.calculatePerimeter(side) );    // calling method
					break;
				case 2:
					System.out.print("Enter length of rectangle : " );   // getting user input
					double length = scanner.nextDouble();
					System.out.print("Enter breadth of rectangle : " );   // getting user input
					double breadth = scanner.nextDouble();
					System.out.println("Result: " + pc.calculatePerimeter(length, breadth));  // calling method 
					break;
				case 3:
					System.out.print("Enter radius of circle : " );   // getting user input
					double radius = scanner.nextDouble();
					System.out.println("Result: " +pc.calculatePerimeter(radius));     // calling method
					break;
				default:
					System.out.println("Invalid operation");
			}
			System.out.print("Do you want to continue (y/n)? ");           
            choice = scanner.next().charAt(0);  
		}
		while (choice == 'y' || choice == 'Y');      // check the user choice
		System.out.println("End.");    
        scanner.close(); 
    }
}

/*
************|| OUTPUT ||******************

D:\anudeep>javac UsePerimeter.java
D:\anudeep>java UsePerimeter

Select choice to Find Perimeter (1. square, 2. rectangle, 3. circle): 1

Enter sides of square : 3
Result: 12.0
Do you want to continue (y/n)? y

Select choice to Find Perimeter (1. square, 2. rectangle, 3. circle): 2

Enter length of rectangle : 5
Enter breadth of rectangle : 5 
Result: 20.0
Do you want to continue (y/n)? y

Select choice to Find Perimeter (1. square, 2. rectangle, 3. circle): 3

Enter radius of circle : 4
Result: 25.142857142857142
Do you want to continue (y/n)? n 

End.




*/







