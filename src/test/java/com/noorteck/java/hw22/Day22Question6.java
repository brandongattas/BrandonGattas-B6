package com.noorteck.java.hw22;

public class Day22Question6 {
	
	public static void main(String[] args) {
		
		Day22Question6 obj = new Day22Question6();
		
		System.out.println(obj.endsWithNG(null));
		System.out.println(obj.endsWithNG("I like to practice"));
		System.out.println(obj.endsWithNG("Everyone is practicing"));
		System.out.println(obj.endsWithNG("I am studying"));
		
	}
	
		
	public boolean endsWithNG(String strOne) {
		boolean result=false;
		
		if(strOne!=null) {
			result=strOne.endsWith("ng");
		}
		
		return result;
	}

}
/**
6. Write a method that takes a string parameter and return true if the string parameter
ends in "ng"
Access Modifier: public
Non-Access Modifier: non-static
Return Type: boolean
Method Name: endsWithNG
Parameter1: String strOne
Test Data: 
endsWithNG (null) ----- FALSE
endsWithNG (“I like to practice”) ----- FALSE
endsWithNG (“Everyone is practicing”) ----- TRUE
endsWithNG (“I am studying”) ----- TRUE
*/