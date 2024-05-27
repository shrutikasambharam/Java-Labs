/* 2. Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.
[Hint: Use array and loop and try to access the element beyond the last index]
   */
package com.thursdaylab;

public class ExceptionDemo   // created class
{
	public static void main(String[] args)   // main method
	{
		int[] arr = {5, 10, 15, 20, 25, 30};   // declared array of size 6
		for(int i=0; i<= arr.length;i++)    // loop 
		{
			try
			{
				System.out.println("Elememt at index : "+i+" : "+arr[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)   // to handle the ArrayIndexOutOfBoundsException Exception
			{
				System.out.println("Exception : ArrayIndexOutOfBoundsException");
			}	
		}

	}
}

/*
 ********** OUTPUT ***************
 
Elememt at index : 0 : 5
Elememt at index : 1 : 10
Elememt at index : 2 : 15
Elememt at index : 3 : 20
Elememt at index : 4 : 25
Elememt at index : 5 : 30
Exception : ArrayIndexOutOfBoundsException

*/