package com.noorteck.java.hw16;

public class BrokenCode {
	
public static void main(String[] args) { //main not written properly
		
		double addResult = 2.0; //double variables cannot contain string
		
		System.out.println(addResult);
		
				
		for(int i=0; i<=10; i++){  //for syntax is: "for(initialization; boolean_expression; update){"
			System.out.println("Count " + i); //symbol + to put together a String with the value of a variable
		}
		
		
		System.out.println(whoseFavNumber(2)); //method is expecting one integer only.
		whoseFavNumber(3);	
		whoseFavNumber(1);
				
		String greeting = "John Cena"; //The value must go between "" and no parenthesis.
		
}


public static void myName(String name) { //Cannot be inside another method
	System.out.println("My name is " + name);
}


public static int addTwoNumbers(int numOne, int numTwo) {  //returning a value is not void method

		int result = numOne + numTwo;

		System.out.println(numOne + " + " + numTwo + " = " + result);
		
		return result;
}


public static String whoseFavNumber(int i){
	String result ="";
			
		if ( i == 1) {
			result = "Brook";
		} else if (i == 2 || i == 4 && i == 4) { //boolean expressions
			result = "Dannia"; //String goes between ""
		} else if (i == 3) {
			result = "Helen";
		}  else {
			result = "my favorite number;";
		}
		
	return result;
	
	}
}
