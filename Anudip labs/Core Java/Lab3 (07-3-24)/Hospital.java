/*2. Create a program in java to implement multilevel inheritance and hierarchical inheritance .
Take classes like: Doctor Surgeon and Nurse 
Create methods and show method overriding.         */

class Doctor      // Parent class
{
    void treatPatient() {
		System.out.println("Doctor class.");
        System.out.println("Doctor is treating the patient.");
    }
}
// Subclass inheriting from Doctor
class Surgeon extends Doctor    
{
    void treatPatient()    // method overriding
	{
		System.out.println("Surgeon class.");
        System.out.println("Surgeon is doing surgery.");
    }
	void operation()      //another method
	{
        System.out.println("Surgeon is operating.");
    }
}
// Another subclass inheriting from Doctor
class Nurse extends Doctor 
{
    void treatPatient()      // method overriding
	{
		System.out.println("Nurse class.");
        System.out.println("Nurse is providing care to the patient.");
    }
	void assistance()    // another method 
	{
        System.out.println("Nurse is assisting the doctor.");
    }
}
class Hospital // main class
{
    public static void main(String[] args)     // main method
	{
		Doctor d = new Doctor();    // created doctor class object
        d.treatPatient(); // Declared Method 
		System.out.println();
		// Multilevel inheritance
        Surgeon s = new Surgeon(); 
        s.treatPatient(); // Method overridden
        s.operation(); // Method specific to Surgeon
		System.out.println();
		// Hierarchical inheritance
        Nurse n = new Nurse();
        n.treatPatient(); // Method overridden
        n.assistance(); // Method specific to Nurse
    }
}

/*
************|| OUTPUT ||******************
D:\anudeep>javac Hospital.java
D:\anudeep>java Hospital

Doctor class.
Doctor is treating the patient.

Surgeon class.
Surgeon is doing surgery.
Surgeon is operating.

Nurse class.
Nurse is providing care to the patient. 
Nurse is assisting the doctor.

*/

