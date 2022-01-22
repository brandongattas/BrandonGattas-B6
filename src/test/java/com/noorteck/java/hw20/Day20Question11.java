package com.noorteck.java.hw20;

public class Day20Question11 {
	
	public static void main(String[] args) {
		
		Day20Question11 obj = new Day20Question11();
		
		System.out.println(obj.threeEqual("Java Pro", 'P', 'B'));
		System.out.println(obj.threeEqual("Lazy mode", 'm', 'C'));
		System.out.println(obj.threeEqual("Training", 'T', ' '));
		
	}
	
	protected String threeEqual(String str, char oldChar, char newChar) {
		String result="";
		
		result=str.replace(oldChar, newChar);
		
		return result;
	}

}

/**
11. Write a method that takes three parameters. One String parameter, 2 character 
parameters. The method replaces old character (parameter 2) from String parameter 
with new character (parameter 3) and returns the new string
Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: threeEqual
Parameter1: String str
Parameter2: char oldChar
Parameter3: char newChar
Test Data: 
threeEqual (“Java Pro”, ’P’, ‘B‘) ----- Java Bro
threeEqual (“Lazy mode”, ‘m‘, ‘C‘) ----- Lazy Cod
threeEqual (“Training”, ‘T’, ‘ ‘) ----- raining
*/