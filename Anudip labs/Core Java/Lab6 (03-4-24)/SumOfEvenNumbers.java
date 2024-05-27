/* 3. Write a Java program that calculates the sum of all even numbers present in an
ArrayList of integers.

Sample Input: 2,5,8,10,15

Expected Output :sum of even number is 20
*/

package com.ArrayList;
import java.util.ArrayList;
public class SumOfEvenNumbers
{
	    public static void main(String[] args)
	    {
	        // Sample Input: ArrayList of integers
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(2);
	        numbers.add(5);
	        numbers.add(8);
	        numbers.add(10);
	        numbers.add(15);

	        // Calculate the sum of even numbers
	        int sum = 0;
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                sum += num;
	            }
	        }

	        // Print the sum of even numbers
	        System.out.println("Sum of even numbers is " + sum + " in java");
	    }
}

/***********************OUTPUT********************************************

Sum of even numbers is 20 in java

*/
