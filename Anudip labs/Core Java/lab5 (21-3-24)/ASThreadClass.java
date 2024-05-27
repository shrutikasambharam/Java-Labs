/*  1. Create two thread.one thread is finding the average of the first 10 numbers 
 * and another thread is printing the square of the number stored in array arr={1,20,50,15,30}
 *  and make sure both threads can execute simultaneously.  */

package com.thursdaylab;

class AverageThread extends Thread    // thread class extends  Thread class
{
	public void run()    // overriding the run method for the thread
	{
		int total=0;
		for(int i=1;i<=10;i++)   // work of child thread 
		{
			total +=i;
		}
		int avarage = total / 10;
		System.out.println("Average of 1 to 10 : "+avarage);
	}	
}
public class ASThreadClass   //  main class
{
	public static void main(String[] args)   // main thread is created
	{
		AverageThread thread1=new AverageThread();   //  creating 
		thread1.start();    // starting the child thread
		int[] arr = {1, 20, 50, 15,30};
		for(int num : arr)   // work of main thread
		{
				System.out.println("Square of "+num+" is : "+(num * num)+" ");  // here printing the square of numbers in array
		}		
	}
}


/*
 ********** OUTPUT ***************

Square of 1 is : 1 
Square of 20 is : 400 
Square of 50 is : 2500 
Square of 15 is : 225 
Square of 30 is : 900 
Average of 1 to 10 : 5

*/
 
