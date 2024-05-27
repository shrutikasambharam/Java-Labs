/*  1. Define interfaces 'Flyable' and 'Swimmable' with methods fly() and swim() respectively. 
Implement these interfaces in a class 'Bird' to demonstrate multiple interface implementation. In java     */

// Define the Flyable interface
interface Flyable 
{
    void fly();
}
// Define the Swimmable interface
interface Swimmable 
{
    void swim();
}
// Implementing multiple interfaces in the Bird class
class Bird implements Flyable, Swimmable 
{
    public void fly()    //  override
	{
        System.out.println("The bird is flying.");          
    }
    public void swim()    //  override
	{
        System.out.println("The bird is swimming.");
    }
}
public class UseBird       // Main class 
{
    public static void main(String[] args)     // main method
	{
        Bird b = new Bird();    // created the object of bird calss
        b.fly();     //  calling method   
        b.swim();    //  calling method
    }
}

/*
************|| OUTPUT ||******************

D:\anudeep>javac UseBird.java
D:\anudeep>java UseBird

The bird is flying.
The bird is swimming.

*/