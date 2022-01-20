package com.noorteck.java.hw19;

public class Day19Question9 {
	
	public static void main(String[] args) {
		
		Day19Question9 obj = new Day19Question9();
		
		System.out.println(obj.isThere("java training", "ini"));
		System.out.println(obj.isThere("java training", "ava"));
		System.out.println(obj.isThere("java training", "AVA"));
		System.out.println(obj.isThere("java training", "Java"));
		
	}
	
	
	private boolean isThere(String strOne, String value) {
		boolean result = false;
		
		if(strOne.contains(value)) {
			result=true;
		}
		
		return result;
	}
}



/**
9. Write a method that takes two String parameters and the method checks if a given 
String contains the specified sequence of character values. Return true if it contains the 
value otherwise false
Access Modifier: private
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isThere
Parameter1: String strOne
Parameter2: String value
Test Data: 
isThere (“java training”, “ini”) ----- TRUE
isThere (“java training”, “ava”) ----- TRUE
isThere (“java training”, “AVA”) ----- False
isThere (“java training”, “Java”) ----- False
*/
