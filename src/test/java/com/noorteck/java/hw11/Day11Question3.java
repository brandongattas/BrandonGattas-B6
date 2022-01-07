package com.noorteck.java.hw11;

public class Day11Question3 {
	
	public static void main(String[] args) {
		int myTotal = sumDouble(2,2);
		
		System.out.println(myTotal);
	}
	
	
	public static int sumDouble(int valueOne, int valueTwo) {
		int result = 0;
		
		if(valueOne==valueTwo) {
			result=(valueOne+valueTwo)*2;
		} else {
			result=valueOne+valueTwo;
		}
		
		return result;
	}

}


/**

3. Write a method that takes 2 integer parameters
- Method Name:sumDouble
- Parameter 1: int valueOne
- Parameter 2: int valueTwo
- Method Return Type: int
Given two int values, return their sum. If the two values are the same (Parameter 1 and Parameter 2),
then return double their sum.
Then call your function from main method: Create an int variable in your main method and assign the
value what sumDouble method returns
- Variable Name: int myTotal;

Example:
if pass 1, 2 value then your method should return 3
sumDouble (1,2)-> 3
if pass 3, 2 value then your method should return 5
sumDouble (3,2)-> 5
if pass 2, 2 value then your method should return 8
sumDouble (2,2)-> 8


*/