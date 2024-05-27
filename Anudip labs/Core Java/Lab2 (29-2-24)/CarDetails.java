/*Create a class named Car with attributes make, model, year, and color.
 Include a method start() that prints "Car started" and a method stop() that prints "Car stopped".*/
 class Car      //class created
{
	String make;       //Instance variables
	String model;
	int year;
	String color;
	Car(String make1, String model1, int year1, String color1)        //parameterized constructor
	{
		this.make=make1;
		this.model=model1;
		this.year= year1;
		this.color=color1;
	}
	void showDetails()      //to display dtails of car
	{
        System.out.println("Car Details =  Make : "+this.make+" Model : "+this.model+" Year : "+this.year+" Color : "+this.color);
    }
	void start()        //method that prints "Car started"
	{
		System.out.println("Car started..............");
	}
	void stop()       //method that prints "Car stopped"
	{
		System.out.println("Car stopped...??");
	}
}
class CarDetails        //created main class
{
	public static void main(String args[])  //main method
	{
		Car c=new Car("Honda","Escape",1996,"Black");      //created object of car class
		c.start();                 //calling  start method
		c.showDetails();            //calling  details method
		c.stop();                  //calling  stop method
	}
}

/*|| OutPut ||

D:\anudeep>javac CarDetails.java
D:\anudeep>java CarDetails

Car started.........
Car Details =  Make: Honda Model : Escape Year : 1996 Color : Black
Car stopped...??

*/