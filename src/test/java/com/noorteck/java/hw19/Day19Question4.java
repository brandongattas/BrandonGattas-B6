package com.noorteck.java.hw19;

public class Day19Question4 {
	
	public static void main(String[] args) {
		
		Day19Question4 obj = new Day19Question4();
		
		System.out.println(obj.toUpper("Pro"));
		System.out.println(obj.toUpper("java"));
		System.out.println(obj.toUpper("java training"));
		
	}
	
	
	String toUpper(String strOne) {
		String result=strOne.toUpperCase();
		
		return result;
	}

}


/**
4. Write a method that takes one String parameter and the method converts the 
parameter to uppercase and return the new String value
Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne
Test Data: 
toUpper (“Pro”) ----- PRO
toUpper (“java”) ----- LEARNING
toUpper (“java training”) ----- JAVA TRAINING
*/