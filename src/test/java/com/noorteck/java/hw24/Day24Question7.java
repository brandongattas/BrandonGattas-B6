package com.noorteck.java.hw24;

public class Day24Question7 {
	
	public static void main(String[] args) {
		int[] n1 = {88,22,6,1,2,3,88,22,44,33};
		System.out.println(getIndexNumber(n1, 3));
		
		int[] n2 = {1, 2, 3,22,44,33};
		System.out.println(getIndexNumber(n2, 12));
		
		int[] n3 = {88,22,6, 1,8,0};
		System.out.println(getIndexNumber(n3, 22));
		
		int[] n4 = {2, 3, 88,22,44};
		System.out.println(getIndexNumber(n4, 44));
		
	}

	public static int getIndexNumber (int[] number, int elementValue) {
		int result=0;
		
		for(int i=0; i<number.length; i++) {
			if(number[i]==elementValue) {
				result=i;
				break;
			} else {
				result=-1;
			}
		}
		
		return result;
	}
}

/**
7. Write a method that takes 2 parameters. An array of int parameter and integer 
parameter. Find the index number of an array element. Check if an array has the 
element value passed as 2nd parameter. If it contains return the index number of that 
element otherwise return -1. 
Access Modifier: public
Non-Access Modifier: static
Return Type: int 
Method Name: getIndexNumber
Parameter1: int [] number
Parameter1: int elementValue
Test Data: 
getIndexNumber ([88,22,6, 1, 2, 3, 88,22,44,33], 3) ----- 5
getIndexNumber ([1, 2, 3,22,44,33], 12) ----- -1
getIndexNumber ([88,22,6, 1,8,0], 22) ----- 1
getIndexNumber ([2, 3, 88,22,44], 44) ----- 4
*/