package com.noorteck.java.hw19;

public class Day19Question2 {
	
	
	public static void main(String[] args) {
		
		Day19Question2 obj = new Day19Question2();
		
		System.out.println(obj.isThreeEqual("day", "DAY", "DaY"));
		System.out.println(obj.isThreeEqual("week", "weekend", "monday"));
		System.out.println(obj.isThreeEqual("java", "JAVa", "jaVa"));
		System.out.println(obj.isThreeEqual("javaProgramming", "java Programming", "Programming in Java"));
		
	}
	
	
	protected boolean isThreeEqual(String strOne, String strTwo, String strThree) {
		boolean result=false;
		
		if(strOne.equalsIgnoreCase(strTwo)&&strTwo.equalsIgnoreCase(strThree)) {
			result=true;
		}
		
		return result;
	}
	
}


/**

2. Write a method that takes three String parameter and checks if the three strings are 
equal or not ignore the case sensitive. If they are equal return true, otherwise return 
false; 
Access Modifier: protected
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isThreeEqual
Parameter1: String strOne
Parameter2: String strTwo
Parameter3: String strThree
Test Data: 
isThreeEqual (“day”, “DAY”, “DaY”) ----- TRUE
isThreeEqual (“week”, “weekend”, “monday”) ----- FALSE
isThreeEqual (“java”, “JAVa”, “jaVa”) ----- TRUE
isThreeEqual (“javaProgramming”, “java Programming”, “Programming in Java”) ---FALSE


*/