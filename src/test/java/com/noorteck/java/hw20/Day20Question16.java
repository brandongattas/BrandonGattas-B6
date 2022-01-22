package com.noorteck.java.hw20;

public class Day20Question16 {
	
	public static void main(String[] args) {
		
		Day20Question16 obj = new Day20Question16();
		
		System.out.println(obj.concatString("Java", "awesome"));
		System.out.println(obj.concatString("food", "door"));
		System.out.println(obj.concatString("java", "training"));
		System.out.println(obj.concatString("Pro", "ogress"));
		
	}
	
	String concatString(String strOne, String strTwo) {
		String result="";
		
		char lastChar = strOne.charAt(strOne.length()-1);
		char firstChar = strTwo.charAt(0);
		
		if(lastChar==firstChar) {
			result=strOne.concat(strTwo.substring(1));
		} else {
			result=strOne.concat(strTwo);
		}
		
		return result;
	}

}

/**
16. Write a method to concatenate two given strings such that, if the concatenation creates 
a double characters then removes one of the characters.
a. For example strOne = “food”; strTwo =”door”. After concatenating two 
strings it will give us “fooddoor”(dd is double character, remove one of the 
d) then the string after concatenation are: “foodoor”
Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: concatString
Parameter1: String strOne
Parameter2: String strTwo
Test Data: 
concatString (“Java”, “awesome”) ----- javawesome
concatString (“food”, “door”) ----- foodoor
concatString (“java”, “training”) ----- javatraining
concatString (“Pro”, “ogress”) ----- Progress
*/