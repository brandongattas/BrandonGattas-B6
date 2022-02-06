package com.noorteck.java.hw24;

public class Day24Question5 {

	public static void main(String[] args) {
		Day24Question5 obj = new Day24Question5();
		
		int[] n1 = { 6, 1, 2, 3 };
		int[] resultN1 = obj.getDouble(n1);
		for(int i=0; i<resultN1.length;i++) { 
			System.out.println(resultN1[i]); 
		}
		

	}

	private int[] getDouble(int[] number) {
		
		//creating result array and assigning how many elements.
		int[] result = new int[number.length * 2];
		
		//putting value 7 inside the element number 5
		result[5]=7;
		
		result[result.length - 1] = number[number.length - 1];

		return result;
	}
}

/**
 * 5. Write a method that takes an array of int parameter and return a new array
 * with double the size/length, where its last element value is the same as the
 * original array last element, and all the other element values are 0. Access
 * Modifier: private Non-Access Modifier: non-static Return Type: int [] Method
 * Name: getDouble Parameter1: int [] number 
 * Test Data: 
 * getDouble ([6, 1, 2, 3]) * ----- [0,0,0,0,0,0,0,3] 
 * getDouble ([13, 3]) ----- [0,0,0, 3] 
 * getDouble ([0, 1, 4]) ----- [0,0,0,0,0,4] 
 * getDouble ([ 6]) ----- [0,6]
 * 
 */