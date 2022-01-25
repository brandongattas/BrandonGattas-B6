package com.noorteck.java.hw22;

public class Day22Question2 {
	
	public static void main(String[] args) {
		
		Day22Question2 obj = new Day22Question2();
		
		System.out.println(obj.isEndWith("java training", "ing"));
		System.out.println(obj.isEndWith("java training", "ng"));
		System.out.println(obj.isEndWith("java training", "java"));
		System.out.println(obj.isEndWith("java training", "train"));
		System.out.println(obj.isEndWith(null, "java"));
		System.out.println(obj.isEndWith(null, null));
		System.out.println(obj.isEndWith("aaabc", "abc"));
		System.out.println(obj.isEndWith("abc", null));
		
	}
	
	boolean isEndWith(String strOne, String strTwo) {
		boolean result=false;
		
		if(strOne!=null && strTwo!=null) {
			result=strOne.endsWith(strTwo);
		}
		
		return result;
	}

}
/**
2. Write a method to check whether a given string ends 
with the contents(Characters) of another string 
Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isEndWith
Parameter1: String strOne
Parameter2: String strTwo
Test Data: 
isEndWith (“java training”, “ing”) ----- TRUE
isEndWith (“java training”, “ng”) ----- TRUE
isEndWith (“java training”, “java”) ----- False
isEndWith (“java training”, “train”) ----- False
isEndWith (null , “java”) ----- False
isEndWith (null , null) ----- False
isEndWith (“aaabc”, “abc”) ----- TRUE
isEndWith (“abc”, null) ----- False
*/