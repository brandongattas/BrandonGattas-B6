package com.noorteck.java.hw10;

public class Day10Question2 {
	
	public static void main(String[] args) {
		
		getGender('m');
		
	}
	
	
	public static void getGender(char gender) {
		
		String output = "";
		
		if (gender=='m'||gender=='M') {
			output="Male";
		} else if (gender=='f'||gender=='F') {
			output="Female";
		} else {
			System.out.println("Error: Please provide a valid gender character.");
			return;
		}
		
		System.out.println("Gender " + "(" + gender + ")" + " = " + output);
		
		
	}

}


/**

Write a method that takes 1 char parameter. The method should print the full gender (Female, Male) based on the character passed. If user enters invalid gender character, then it should print error message

Modifier: public static 
Method Name: getGender Method Return Type: void Parameter 1 = char gender

Example:

If you pass (‘m’) in your method

getGender (‘m’);  Console output should be  Male

If you pass (‘F’) in your method

getGender (‘F’);  Console output should be  Female


*/