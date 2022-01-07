package com.noorteck.java.hw11;

public class Day11Question4 {
	
	public static void main(String[] args) {
		int diffTotal = difference21(21);
		
		System.out.println("Total: " + diffTotal);
	}
	
	public static int difference21 (int number) {
		int result=0;
		
		if(number<=21) {
			result=number-21;
		} else {
			result=(number-21)*2;
		}
		
		return result;
	}

}



/**

4. Write a method that takes 1 parameter
- Method Name: difference21
- Parameter 1: int number
- Method Return Type: int
Given an int number, return the difference between variable number and 21 (number-21), except
return double the difference if n is over 21.
Then call your function from main method: Create an int variable in your main method and assign the
value what difference21method returns
- Variable Name: int diffTotal;

Example:
if pass 19 value then your method should return -2
difference21(19)-> -2
if pass 10 value then your method should return -11
difference21(10)-> -11
if pass 30 value then your method should return 22
difference21(30) -> 22
if pass 21 value then your method should return 0
difference21(21) -> 0


*/