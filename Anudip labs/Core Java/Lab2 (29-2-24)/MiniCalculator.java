/*  1.  wap for creating the mini calculator. 
you have to perform an operation on che basis of user choice until 
the user press yes to continue(add, mul, sub,div) in java */

import java.util.Scanner;   // imported Scanner
public class MiniCalculator    //class created
{
    public static void main(String[] args)    //Define the main method
	{
		Scanner scanner = new Scanner(System.in);   // created scanner object
        char choice;    //instance variable
		do
		{
			System.out.println("***************||  Simple Calculator  ||***************");   // heading 
			// printing the list of all operations
			System.out.println("1. Add");
			System.out.println("2. Subtract");
			System.out.println("3. Multiply");
			System.out.println("4. Divide");
			System.out.print("Enter your choice (1-4): ");   //get the choice of which operation user want perform
			int operation = scanner.nextInt();
			System.out.print("Enter first number: ");   // getting user input
			double num1 = scanner.nextDouble();
			System.out.print("Enter second number: ");    // getting user input
			double num2 = scanner.nextDouble();
			switch (operation) 
			{
				case 1:
					System.out.println("Result: "+ (num1 + num2) );     // Performing the addition Operation
					break;
				case 2:
					System.out.println("Result: " + (num1 - num2));      // Performing the subtraction Operation
					break;
				case 3:
					System.out.println("Result: " + (num1 * num2));      // Performing Multiplication the Operation
					break;
				case 4:
					if (num2 != 0) // checking the number two is not  equal to zero
					{
						System.out.println("Result: " + (num1 / num2));       // Performing Division the Operation
					} 
					else  // if num two is zero then print else block
					{
						System.out.println("Error: Cannot divide by zero");
					}
					break;
				default:
					System.out.println("Invalid operation");
		    }
		    System.out.print("Do you want to continue (y/n)? ");           
            choice = scanner.next().charAt(0);    
		}
		while (choice == 'y' || choice == 'Y');      // check the user choice
		System.out.println("Calculator closed.");    
        scanner.close(); 
	}      
}

/*|| OutPut ||
D:\anudeep>javac MiniCalculator.java
D:\anudeep>java MiniCalculator

**********||  Simple Calculator ||*******
1. Add
2. Subtract
3. Multiply
4. Divide

Enter first number: 5
Enter second number: 5
Result: 10.0

Do you want to continue (y/n)? y 
**********||  Simple Calculator ||*******
1. Add
2. Subtract
3. Multiply
4. Divide
Enter your choice (1-4): 2

Enter first number: 5
Enter second number: 0
Result: 5.0

Do you want to continue (y/n)? y 
**********||  Simple Calculator ||*******
1. Add
2. Subtract
3. Multiply
4. Divide
Enter your choice (1-4): 3

Enter first number: 5
Enter second number: 5
Result: 25.0

Do you want to continue (y/n)? y 
**********||  Simple Calculator ||*******
1. Add
2. Subtract
3. Multiply
4. Divide
Enter your choice (1-4): 4

Enter first number: 5
Enter second number: 5
Result: 1.0

Do you want to continue (y/n)? n
Calulator closed.
*/


