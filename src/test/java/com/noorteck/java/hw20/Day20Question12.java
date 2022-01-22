package com.noorteck.java.hw20;

public class Day20Question12 {
	
	public static void main(String[] args) {
		
		Day20Question12.replaceStr("I cannot do it", "cannot", "can");
		Day20Question12.replaceStr("Tomorrow is my day", "Tomorrow", "Today");

	}
	
	public static void replaceStr(String strOne, String oldStr, String newStr) {
		System.out.println(strOne.replace(oldStr, newStr));
	}

}

/**
12. Write a method to replace each substring of a given string that matches the given 
regular expression with the given replacement. The method takes 3 String parameters 
and replaces oldStr (parameter 2 ) from strOne (parameter1) with newStr(parameter 
3) and prints the new value
Access Modifier: public
Non-Access Modifier: static
Return Type: void
Method Name: replaceStr
Parameter1: String strOne
Parameter2: String oldStr
Parameter2: String newStr
Test Data: 
replaceStr (“I cannot do it”, “cannot”, “can” ) ----- I can do it
replaceStr (“Tomorrow is my day”, “Tomorrow”, “Today” ) ----- Today is my day
*/