package com.noorteck.java.hw10;

public class Day10Question1 {
	
	public static void main(String[] args) {
		
		calculate(2.0, 4.0, '+');
		
	}
	
	public static void calculate(double numOne, double numTwo, char mathOperationSign) {
		
		double result = 0;
		
		if (mathOperationSign=='+') {
			result = numOne+numTwo;
		} else if (mathOperationSign=='-') {
			result = numOne-numTwo;
		} else if (mathOperationSign=='/') {
			result = numOne/numTwo;
		} else if (mathOperationSign=='*') {
			result = numOne*numTwo;
		} else if (mathOperationSign=='%') {
			result = numOne%numTwo;
		} else {
			System.out.println("Error: Invalid Operation Sign.");
			return;
		}
		
		System.out.println(numOne + " " + mathOperationSign + " " + numTwo + " = " + result);
		
	}

}


/**

Write a method that takes 3 parameters (2 double value and 1 char value). The method should perform calculation (addition, subtraction, multiplication, division and modulus).
Depending the math operation sign character ( + , -. / , *, %) passed to the method it should perform appropriate calculation and should print the result of operation
If user enters invalid math operation sign, then it should print error message.
Method Name: calculate Method Return Type: void Parameter 1 = double numOne Parameter 2 = double numTwo
Parameter 2 = char mathOperationSign

Example:

If you pass (2.0, 4.0, ‘+’) in your method

calculate (2.0, 4.0, ‘+’); - Console output should be 2.0 + 4.0 = 6.0


*/