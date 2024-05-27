/* 1.Define a class Address representing an address with attributes such as street, city, state, and zip code.
 Provide constructors to initialize these attributes. */
class Address     // define class
{
	// Instance variables or attributes
	String street;
	String city;
	String state;
	String zipcode;
	public Address()    // No-argumented constructor
	{
		this.street="I Group Vidi Gharkul";
		this.city="Solapur";
		this.state="Maharashtra";
		this.zipcode="413005";
		System.out.println("No arguments constructor .......");
		System.out.println("Street is : "+this.street+" City is : "+this.city+" State is : "+this.state+" Zip code is : "+this.zipcode);
		
	}
	public Address(String street,String city,String state,String zipcode)     // parameterised constructor
	{	
		this.street=street;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
		System.out.println("Parameterized constructor .......");
		System.out.println("Address is : "+this.street+" , "+this.city+" , "+this.state+" , "+this.zipcode);    
		
	}	
}
class UseAddress     // main class
{
	public static void main(String args[]) // main method
	{
		Address s=new Address();   //creating new object no-argumented constructor
		Address s1=new Address("DajiPeth","Solapur","Maharashtra","413006"); //creating new object with parameterised constructor		
	}
}

/*
************|| OUTPUT ||******************
D:\anudeep>javac UseAddress.java
D:\anudeep>java UseAddress 

No arguments constructor....................
Street is : I Group Vidi Gharkul City is : Solapur State is : Maharashtra Zip code is : 413005 

Parameterized constructor...........
Address is : DajiPeth , Solapur , Maharashtra , 413006

*/