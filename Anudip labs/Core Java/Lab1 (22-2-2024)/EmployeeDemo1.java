/*create a class named Employee with attributes name, employeeid, 
designation and salary. include a method calculateBonus() 
that returns 5% of the salary as bonus.*/
import java.util.Scanner;   // imported Scanner
class Employee   //class created
{	//Declared all instance variables
	String name;
	double salary;
	String designation;
	int id ;
	double bouns;
	void getData()   //declare method to get user input
	{
	    //getting the input from the user
	    Scanner sc=new Scanner(System.in);
	    System.out.println("\nEnter Name of Employee:");
	    this.name=sc.next();
	    System.out.println("Enter Employee Id:");
	    this.id=sc.nextInt();
	    System.out.println("Enter Designation:");
	    this.designation=sc.next();
		System.out.println("Enter Salary of Employee:");
	    this.salary=sc.nextDouble();
	}
	void CalculateBonus()   //create a function to calculate the bonus
	{
		this.bouns=0.05*this.salary;	
	}
	void setData()      //create the function to display the output
	{
		System.out.println("Name= "+this.name+"Designation= "+this.designation+" Salary= "+this.salary+" Id= "+this.id );
		System.out.println("Bonus= "+bouns);
	}
}
class EmployeeDemo1                          //create main class
{
	public static void main(String args[])   //Define the main method
	{	
		Employee e1=new Employee();          //Created the employee class object 
		e1.getData();                         // call the get method 
		e1.CalculateBonus();                 // call the CalculateBonus method 
		e1.setData();                        // call the set method 
		
		Employee e2=new Employee();          //Created another employee class object 
		e2.getData();                         // call the get method 
		e2.CalculateBonus();                 // call the CalculateBonus method 
		e2.setData();                        // call the set method 
	 }
}