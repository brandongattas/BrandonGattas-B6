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
