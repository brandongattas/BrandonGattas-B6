package com.noorteck.java.hw24;

public class Day24Question6 {
	
	public static void main(String[] args) {
		int[] n1 = {6, 1, 2, 3};
		System.out.println(checkNum(n1));
		
		int[] n2 = {13, 2, 3,4, 6, 1, 2, 3};
		System.out.println(checkNum(n2));
		
		int[] n3 = {3, 3,0, 1, 4, 3 ,6};
		System.out.println(checkNum(n3));
		
		int[] n4 = {2, 6, 2};
		System.out.println(checkNum(n4));
	}
	
	protected static boolean checkNum (int[] number) {
		boolean result=false;
		int twoCount=0;
		int fiveCount=0;
		
		for(int i=0; i<number.length; i++) {
			if(number[i]==2) {
				twoCount++;
			} else if (number[i]==5){
				fiveCount++;
			}
		}
		
		if(twoCount>1 || fiveCount>1) {
			result=true;
		}
		
		return result;
	}

}

/*
6. Write a method that takes an array of int parameter and return true if the array 
contains value 2 twice, or value 5 twice.
Access Modifier: protected
Non-Access Modifier: static
Return Type: boolean
Method Name: checkNum
Parameter1: int [] number
Test Data: 
checkNum ([6, 1, 2, 3]) ----- FALSE
checkNum ([13, 2, 3,4, 6, 1, 2, 3]) ----- TRUE
checkNum ([3, 3,0, 1, 4, 3 ,6]) ----- FALSE
checkNum [2, 6, 2]) ----- TRUE
*/