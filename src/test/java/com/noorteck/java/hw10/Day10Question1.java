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
