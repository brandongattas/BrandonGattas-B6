package com.noorteck.java.hw24;

public class ArrayExerciseThree {
	
	public static void main(String[] args) {
		
		int n1[] = {6, 1, 2, 3};
		System.out.println(getTotal(n1));
		
		int n2[] = {13, 6, 1, 2, 3};
		System.out.println(getTotal(n2));
		
		int n3[] = {0, 1, 4, 3 ,6};
		System.out.println(getTotal(n3));
		
		int n4[] = {0, 6, 0};
		System.out.println(getTotal(n4));
		
	}
	
	
	public static int getTotal(int[] number) {
		int result=0;
		
		for(int i=0; i<number.length;i++) {
			result+=number[i];
		}
		
		return result;
	}

}

/**
3. Write a method that takes an array of int parameter and return the sum of all the 
elements 
Access Modifier: public
Non-Access Modifier: static
Return Type: int
Method Name: getTotal
Parameter1: int [] number
Test Data: 
getTotal ([6, 1, 2, 3]) ----- 12
getTotal ([13, 6, 1, 2, 3]) ----- 25
getTotal ([0, 1, 4, 3 ,6]) ----- 14
getTotal ([0, 6, 0]) ----- 6

*/