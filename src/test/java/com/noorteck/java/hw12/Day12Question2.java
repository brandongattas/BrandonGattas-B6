package com.noorteck.java.hw12;

public class Day12Question2 {
	
	public static void main(String[] args) {
		boolean compResult = comparison(8);
		
		System.out.println(compResult);
	}
	
	public static boolean comparison(int number) {
		boolean result=false;
		
		if(number>=0) {
			if ((number%3)==0 || (number%5)==0) {
				result=true;
			} else {
				result=false;
			}
		} else {
			result=false;
		}
		
		return result;
	}
	

}


/**

2) Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the %
"mod" operator
multipleOf (3) --- true
multipleOf (10) ---  true
multipleOf (8) ---  false



*/