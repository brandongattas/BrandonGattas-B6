package com.noorteck.java.hw22;

public class Day22Question5 {
	
	public static void main(String[] args) {
		
		System.out.println(removeSpace(null));
		System.out.println(removeSpace(" Java Training "));
		System.out.println(removeSpace(" I like to practice "));
		
	}
	
	public static String removeSpace(String strOne) {
		String result="";
		
		if(strOne!=null) {
			result=strOne.trim();
		} else {
			result="null";
		}
		
		return result;
	}

}
/**
5. Write a method to trim any leading or trailing whitespace from a given string
Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeSpace
Parameter1: String strOne
Test Data: 
removeSpace (null”) ----- null
removeSpace (“ Java Training ”) ----- java Training
removeSpace (“ I like to practice ”) ----- I like to practice
*/