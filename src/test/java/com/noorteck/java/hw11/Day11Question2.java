package com.noorteck.java.hw11;

public class Day11Question2 {
	
	public static void main(String[] args) {
		boolean areWeInTrouble = monkeyTrouble(true, false);
		
		System.out.println("Are we in Trouble?: " + areWeInTrouble);
	}
	
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		boolean result=false;
		
		if (aSmile==true && bSmile==true) {
			result=true;
		} else if (aSmile==false && bSmile==false) {
			result=true;
		} else {
			result=false;
		}
		
		return result;
	}

}

/**

2. Write a method that takes two Boolean parameters
-Method Name: monkeyTrouble
-Method Return Type: Boolean
-Parameter 1: Boolean aSmile
-Parameter 2: Boolean bSmile
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We
orif neither of them is smiling. Return true if we are in trouble

otherwise return false

Then call your function from main method: Create a Boolean variable in your main method and assign
the value what monkeyTrouble method returns
-Variable Name : Boolean areWeInTrouble;
Example:
if pass true, true value then your method should return true
monkeyTrouble (true, true) -> true
if pass true, false value then your method should return false
monkeyTrouble (true, false)-> false
if pass false, false value then your method should return true
monkeyTrouble (false, false) ->true

*/