package com.noorteck.java.hw20;

public class Day20Question13 {
	
	public static void main(String[] args) {
		
		Day20Question13 obj = new Day20Question13();
		
		System.out.println(obj.isStartWith("java training", "ing"));
		System.out.println(obj.isStartWith("java training", "ja"));
		System.out.println(obj.isStartWith("java training", "java"));
		System.out.println(obj.isStartWith("java training", "train"));
			
	}
	
	boolean isStartWith(String strOne, String strTwo) {
		boolean result=false;
		
		if(strOne.startsWith(strTwo)) {
			result=true;
		}
		
		return result;
	}

}

/**
13. Write a method to check whether a given string starts with the contents(Characters) of 
another string
Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isStartWith
Parameter1: String strOne
Parameter2: String strTwo
Test Data: 
isStartWith (“java training”, “ing”) ----- False
isStartWith (“java training”, “ja”) ----- TRUE
isStartWith (“java training”, “java”) ----- TRUE
isStartWith (“java training”, “train”) ----- False
*/