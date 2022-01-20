package com.noorteck.java.hw19;

public class Day19Question5 {
	
	public static void main(String[] args) {
		
		Day19Question5 obj = new Day19Question5();
		
		System.out.println(obj.toLower("espn"));
		System.out.println(obj.toLower("SOCCER"));
		System.out.println(obj.toLower("STRING CLASS"));
		
	}
	
	
	protected String toLower(String strOne) {
		String result = strOne.toLowerCase();
		
		return result;
	}

}


/**
5. Write a method that takes one String parameter and the method converts the 
parameter to lowercase and return the new String value
Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: toLower
Parameter1: String strOne
Test Data: 
toLower (“espn”) ----- espn
toLower (“SOCCER”) ----- soccer
toLower (“STRING CLASS”) ----- string class
*/