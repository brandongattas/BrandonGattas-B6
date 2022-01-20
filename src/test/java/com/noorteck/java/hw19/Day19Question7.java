package com.noorteck.java.hw19;

public class Day19Question7 {
	
	public static void main(String[] args) {
		
		Day19Question7 obj = new Day19Question7();
		
		System.out.println(obj.helloTo("Denis"));
		System.out.println(obj.helloTo("Malek"));
		System.out.println(obj.helloTo("Sara"));
		
	}
	
	String helloTo(String strOne) {
		String result = "Hello ".concat(strOne);
		
		return result;
	}

}


/**
7. Write a method that takes one String parameter (name) and the method returns new 
String value appending “Hello” to name parameter 
Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: helloTo
Parameter1: String strOne
Test Data: 
helloTo (“Denis”) ----- Hello Denis
helloTo (“Malek”) ----- Hello Malek
helloTo (“Sara”) ----- Hello Sara
*/