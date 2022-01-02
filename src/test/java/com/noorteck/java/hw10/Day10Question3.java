package com.noorteck.java.hw10;

public class Day10Question3 {
	
	public static void main(String[] args) {
		
		oddEven(21);
		
	}
	
	public static void oddEven(int number) {
		
		if (number%2==0) {
			System.out.println(number + " = " + "The number is an even number.");
		} else {
			System.out.println(number + " = " + "The number is an odd number.");
		}
		
	}

}
