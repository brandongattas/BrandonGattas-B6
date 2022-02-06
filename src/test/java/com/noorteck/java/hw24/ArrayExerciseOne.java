package com.noorteck.java.hw24;

public class ArrayExerciseOne {
	
	public static void main(String[] args) {
		
		int[] myArray = {6,1,2,3};
		System.out.println(isFirstLast(myArray));		//TRUE  [6,1,2,3]
		
		int[] myArray2 = {13,6,1,2,3};
		System.out.println(isFirstLast(myArray2));	//FALSE [13,6,1,2,3]
		
		int[] myArray3 = {0,1,4,3,6};
		System.out.println(isFirstLast(myArray3));	//TRUE [0,1,4,3,6]

		int[] myArray4 = {0,6,0};
		System.out.println(isFirstLast(myArray4));		//FALSE [0,6,0]
		
	}
	
	
	static boolean isFirstLast(int[] number) {
		boolean result=false;
		
		if(number[0]==6 || (number[number.length-1])==6) {
			result=true;
		}
		
		return result;
	}

}

/**
1. Write a method that takes an array of int parameter and return true if 6 appears as 
either the first element or last element in the array, otherwise return false
Access Modifier: Default
Non-Access Modifier: static
Return Type: boolean
Method Name: isFirstLast
Parameter1: int [] number
Test Data: 
isFirstLast ([6, 1, 2, 3]) ----- TRUE
isFirstLast ([13, 6, 1, 2, 3]) ----- FALSE
isFirstLast ([0, 1, 4, 3 ,6]) ----- TRUE
isFirstLast [0, 6, 0]) ----- FALSE
*/