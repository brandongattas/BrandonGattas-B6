package com.noorteck.java.hw20;

public class Day20Question14 {
	
	public static void main(String[] args) {
		
		System.out.println(Day20Question14.getSubStr("java training", 2, 6));
		System.out.println(Day20Question14.getSubStr("Software Development Engineer in TEST", 11, 23));
		System.out.println(Day20Question14.getSubStr("Software Development Engineer in TEST", 21, 29));
			
	}
	
	public static String getSubStr(String str, int startingIndex, int endingIndex) {
		String result="";
		
		result=str.substring(startingIndex, endingIndex);
		
		return result;
	}

}


/**
14. Write a method to get a substring of a given string between two specified positions. 
Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: getSubStr
Parameter1: String str
Parameter2: Int startingIndex
Parameter2: Int endingIndex
Test Data: 
getSubStr (“java training”, 2 ,6) ----- v at
getSubStr (“Software Development Engineer in TEST”, 11, 23) ----- velopment En
getSubStr (“Software Development Engineer in TEST”, 21, 29) ----- Engineer
*/