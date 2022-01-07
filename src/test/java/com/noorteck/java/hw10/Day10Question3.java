package com.noorteck.java.hw10;

public class Day10Question3 {
	
	public static void main(String[] args) {
		
		oddEven(21);
		
	}
	
	public static void oddEven(int number) {
		
		if (number%2==0) {
			System.out.println(number + " = " + "The number is an even number.");
		} else {
			System.out.println(number + " = " + "The number is an odd number.");
		}
		
	}

}

/**

Write a method that takes 1 parameter. In the method write the following logic.
If the parameter is even, then print the number is an even number
If the parameter is odd, then print the number is an odd number

Modifier: public static
Method Name: oddEven Method Return Type:void 
Parameter 1 = int number


*/