/*A program that calculates Body Mass Index (BMI) based on user input of weight and height, 
and Chen categorizes the BMI into underweight, normal, overweight, or obese categories using if else statements */
import java.util.Scanner;    // imported Scanner
class BMI       //class created
{
	float bmi,height,weight;       // instance variables
	// getting user input
	void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Height in m: "); 
		height=sc.nextFloat();
		System.out.print("Enter Weight in Kg: "); 
		weight=sc.nextFloat();
	}
	// Display the details 
	void showDetails()
	{
        System.out.println("Height is: "+height+" Weight is: "+weight);
    }
	// calculating Body Mass Index
	void bmiCalculate()
	{
	    bmi=weight/(height*height); //formula for calculating BMI
		System.out.println("Body Mass Index= "+bmi);
		if (bmi < 18.5) 
			System.out.print("underweight"); 
		else if (bmi >= 18.5 && bmi < 24.9) 
			System.out.print("Normal"); 
		else if (bmi >= 24.9 && bmi < 30) 
			System.out.print("overweight"); 
		else if (bmi >= 30) 
			System.out.print("Obese");	
	}	
}
class BmiCalculate             //created main class
{
	public static void main(String args[])      //Define the main method
	{
		BMI b=new BMI();     //creating object of class	
		b.getDetails();         //calling method
		b.showDetails();         //calling method
		b.bmiCalculate();	 //calling method
	}
}

/*|| OutPut ||

D:\anudeep>javac BmiCalculate.java
D:\anudeep>java BmiCalculate

Enter Height in m: 11.2
Enter Weight in Kg: 39
Height is: 11.2 Weight is: 39.0 
Body Mass Index= 0.31090564
underweight

*/