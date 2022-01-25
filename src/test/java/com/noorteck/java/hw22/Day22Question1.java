package com.noorteck.java.hw22;

public class Day22Question1 {
	
	public static void main(String[] args) {
		
		Day22Question1 obj = new Day22Question1();
		
		System.out.println(obj.toUpper("Pro"));
		System.out.println(obj.toUpper("java"));
		System.out.println(obj.toUpper(null));
		
	}

	String toUpper(String strOne) {
		String result="";
		
		if(strOne != null) {
			result=strOne.toUpperCase();
		} else {
			result="null";
		}
		
		return result;
	}
	
}
/**
1. Write a method that takes one String parameter and the method converts the 
parameter to uppercase and return the new String value
Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne
Test Data: 
toUpper (“Pro”) ----- PRO
toUpper (“java”) ----- LEARNING
toUpper (null) ----- null
*/