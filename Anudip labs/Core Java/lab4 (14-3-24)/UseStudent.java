/*  3. Create a class Student and implement array and display details of student.  */
class Student // declared class 
{
	// Instance Variables
    String name;
    int age;
    String grade;
	public Student(String name, int age, String grade)      // Constructor
	{
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void displayDetails()       // Method to display student details
	{
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
class UseStudent   // Main class
{
    public static void main(String[] args) // Main Method
	{
        Student[] students = new Student[3];        // Create an array of Student objects
        
        students[0] = new Student("Revanth", 18, "A");        // Initialize student objects and add them to the array
        students[1] = new Student("Ram", 17, "B");       // Initialize student objects and add them to the array
        students[2] = new Student("Aarti", 19, "C");         // Initialize student objects and add them to the array
        
        for (int i = 0; i < students.length; i++)       // Display details of all students in the array
		{
            System.out.println("Student " + " details:");
            students[i].displayDetails();   // calling the method
            System.out.println();
        }
    }
}

/*
************|| OUTPUT ||******************

D:\anudeep>javac UseStudent.java
D:\anudeep>java UseStudent

Student  details:
Name: Revanth
Age: 18
Grade: A

Student  details:
Name: Ram
Age: 17
Grade: B

Student  details:
Name: Aarti
Age: 19
Grade: C

*/