/* WAP to create a simple calculator program that takes user input for two numbers and an operator (+, -, *, /) 
and performs the corresponding arithmetic operation using conditional statements. */
import java.util.Scanner;   // imported Scanner
public class SimpleCalculator    //class created
{
    public static void main(String[] args)   //Define the main method
    {
        int result;  //instance variable
		//getting the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
		System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
        String operation = sc.next();
        //Declare the condition to perform the Operations using  if-else
        if (operation.equals("+"))  //check the condition is true or false
		{	//if true then perform the following operation else perform the else operations
            result = number1 + number2;  // Perform the Operation
			System.out.println("Your answer is: " + result);   //print the ouput
        }
        else if (operation.equals("-")) 
		{
            result = number1 - number2;   // Performing the Operation
			System.out.println("Your answer is: " + result);
        }
        else if (operation.equals("*")) 
		{
            result = number1 * number2;    // Performing the Operation
			System.out.println("Your answer is: " + result);
        }
        else if (operation.equals("%")) 
		{
            result = number1 % number2;   // Performing the Operation
			System.out.println("Your answer is: " + result);
        }
        else if (operation.equals("/")) 
		{
            result = number1 / number2;   // Performing the Operation
			System.out.println("Your answer is: " + result);
        }
        else 
		{
            System.out.println("Invalid operation");
        }
        
    }
    

}