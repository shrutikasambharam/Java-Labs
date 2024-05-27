/* 4.Write a program to declare stack.Store 10 elements into it.Remove 4 elements from
stack and display it.

*/

package com.ArrayList;

import java.util.Stack;

public class StackPractical {

	public static void main(String[] args) 
	{
		Stack<Integer> s=new Stack<Integer>();
		boolean res=s.empty();
		s.push(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(100);
		System.out.println("Stack elemnts :"+s);
		int i1=s.pop();
		System.out.println("poped element :"+i1);
		int i2=s.pop();
		System.out.println("poped element :"+i2);
		int i3=s.pop();
		System.out.println("poped element :"+i3);

		int i4=s.pop();
		System.out.println("poped element :"+i4);


		System.out.println("Poped elements :"+s);
		System.out.println("Stack is empty or not :"+res);
		
	}

}


/***********************OUTPUT********************************************
Stack elemnts :[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
poped element :100
poped element :90
poped element :80
poped element :70
Poped elements :[10, 20, 30, 40, 50, 60]
Stack is empty or not :true
*/