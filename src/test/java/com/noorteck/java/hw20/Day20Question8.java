package com.noorteck.java.hw20;

public class Day20Question8 {
	
	public static void main(String[] args) {

		System.out.println(Day20Question8.getCharacter("java training", 2));
		System.out.println(Day20Question8.getCharacter("java training", 5));
		System.out.println(Day20Question8.getCharacter("java training", 8));
		System.out.println(Day20Question8.getCharacter("java training", 22));
				
	}
	
	public static char getCharacter (String strOne, int indexNum) {
		char result = ' ';
		
		if(indexNum < strOne.length()) {
			result=strOne.charAt(indexNum);
		} else {
			result = '?';
		}
		
		return result;
	}

}


/**
8. Write a method that takes two parameters, one String parameter and one integer 
parameter. The method should return the character at the given index within the String. 
If the indexNum more than the length of String then return ‘?’ mark
Access Modifier: public
Non-Access Modifier: static
Return Type: char
Method Name: getCharacter
Parameter1: String strOne
Parameter2: Int indexNum
Test Data: 
getCharacter (“java training”, 2) ----- v
getCharacter (“java training”, 5) ----- t
getCharacter (“java training”, 8) ----- i
getCharacter (“java training”, 22) ----- ?

*/