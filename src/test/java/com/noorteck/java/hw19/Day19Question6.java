package com.noorteck.java.hw19;

public class Day19Question6 {
	
	
	public static void main(String[] args) {
		System.out.println(combineStr("day", "ONE", "work", "HOURS"));
		System.out.println(combineStr("week", "weekend", "monday", "Tuesday"));
		System.out.println(combineStr("restoN", "vA", "baltiMORE", "MD"));
		System.out.println(combineStr("java", "is", "fun", "LEARNING"));
	}
	
	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
		String result = ( (strOne.toUpperCase()).concat(strTwo.toLowerCase()).concat(strThree.toUpperCase()).concat(strFour.toLowerCase()) );
				
		return result;
	}
}


/**
6. Write a method that takes four String parameters, the method
a. converts parameter 1 and parameter 3 to uppercase, 
b. converts parameter 2 and parameter 4 to lower case 
c. Then the method concatenates all four parameters and return the new String 
value. 
Access Modifier: protected
Non-Access Modifier: static
Return Type: String
Method Name: combineStr
Parameter1: String strOne
Parameter2: String strTwo
Parameter3: String strThree
Parameter3: String strFour
Test Data: 
combineStr (“day”, “ONE”, “work”,”HOURS”) ----- DAYoneWORKhours
combineStr (“week”, “weekend”, “monday”,”Tuesday”) - WEEKweekendMONDAYtuesday
combineStr (“restoN”, “vA”, “baltiMORE”, “MD”) ----- RESTONvaBALTIMOREmd
combineStr (“java”, “is”, “fun”,”LEARNING”) --- JAVAisFUNlearning
*/