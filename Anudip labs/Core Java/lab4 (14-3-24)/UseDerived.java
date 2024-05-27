/*  4. Create a base class with constructor and inherit it in the derived class and
 call the base class constructor in derived class.  */

class BaseClass         // Base class
{
    int num1;    // instance variable
	public BaseClass(int num1)   // Constructor for Base class
	{
        this.num1 = num1;
        System.out.println("Base class constructor called with num1 Value: " + num1);
    }
}
class DerivedClass extends BaseClass  // Derived class inheriting from Base class
{
    int num2;
    public DerivedClass(int num1, int num2)     // Constructor for Derived class
	{
        super(num1);       // Call to base class constructor
        this.num2 = num2;
        System.out.println("Derived class constructor called with num2 Value: " + num2);
    }
}
public class UseDerived     // Main class
{
    public static void main(String[] args)
	{
		DerivedClass dObj = new DerivedClass(10, 20);     // Create an object of Derived class
    }
}

/*
************|| OUTPUT ||******************

D:\anudeep>javac UseDerived.java
D:\anudeep>java UseDerived

Base class constructor called with num1 Value: 10
Derived class constructor called with num2 Value: 20

D:\anudeep>
*/