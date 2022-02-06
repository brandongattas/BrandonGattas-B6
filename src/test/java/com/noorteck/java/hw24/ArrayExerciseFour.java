package com.noorteck.java.hw24;

public class ArrayExerciseFour {
	
	public static void main(String[] args) {
		
		ArrayExerciseFour obj = new ArrayExerciseFour();
		
		int[] n1 = {6, 1, 2, 3};
		int[] resultN1=obj.getFirstLast(n1);
		System.out.println("[ "+resultN1[0]+", "+resultN1[1]+"]");
		
		int[] n2 = {13, 6, 1, 2, 3};
		int[] resultN2=obj.getFirstLast(n2);
		System.out.println("[ "+resultN2[0]+", "+resultN2[1]+"]");
		
		int[] n3 = {0, 1, 4, 3 ,6};
		int[] resultN3=obj.getFirstLast(n3);
		System.out.println("[ "+resultN3[0]+", "+resultN3[1]+"]");
		
		int[] n4 = {0, 6, 0};
		int[] resultN4=obj.getFirstLast(n4);
		System.out.println("[ "+resultN4[0]+", "+resultN4[1]+"]");
		
	}
	
	
	int[] getFirstLast(int[] number){
		int [] result = new int[2];
		
		result[0]=number[0];
		result[1]=number[number.length-1];
		
		return result;
	}

}
/**
4. Write a method that takes an array of int parameter and return a new array of int 
containing the first element and last element from the original array. 
Access Modifier: default
Non-Access Modifier: non-static
Return Type: int []
Method Name: getFirstLast
Parameter1: int [] number
Test Data: 
getFirstLast ([6, 1, 2, 3]) ----- [6,3]
getFirstLast ([13, 6, 1, 2, 3]) ----- [13,3]
getFirstLast ([0, 1, 4, 3 ,6]) ----- [0,6]
getFirstLast ([0, 6, 0]) ----- [0,0]

*/