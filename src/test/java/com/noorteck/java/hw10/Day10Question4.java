package com.noorteck.java.hw10;

public class Day10Question4 {
	
	public static void main(String[] args) {
		
		getDoWhileLoopResult(3,8);
		
	}
	
	public static void getDoWhileLoopResult(int minNum, int maxNum) {
		
		do {
			System.out.println(minNum);
			minNum++;
		} while (minNum<=maxNum);

	}

}


/**

Write a method that takes 2 parameters. In the method write the following logic.
Using do -while loop, loop through the numbers provided in the parameter. Loop should start from minNum and stop at maxNum. Print each number

Modifier: public static
Method Name: getDoWhileLoopResult
Method Return Type: void Param  1 = int minNum 
Param 2 = int maxNum


*/