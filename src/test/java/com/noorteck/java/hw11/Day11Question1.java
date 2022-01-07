package com.noorteck.java.hw11;

public class Day11Question1 {
	
	public static void main(String[] args) {
		boolean amisleeping = sleepin(false, false);
		
		System.out.println("Am I sleeping?: " + amisleeping);
		
	}
	
	public static boolean sleepin(boolean isWeekday, boolean isVacation) {
		boolean result=false;
		
		if(isWeekday==false || isVacation==true) {
			result=true;
		}else{
			result=false;
		}
		
		return result;
	}

}

/**

1. Write a method that takes Boolean parameters
Method Name: sleepIn
Method Return Type: boolean
Parameter 1 = boolean isWeekday
Parameter 2 = boolean isVacation
The parameter isWeekday is true if it is a weekday, the parameter isVacation is true if we are on
vacation. We sleep in if it is not a weekday
otherwise return false.

if we are on a vacation. Return true if we sleep in

Then call your function from main method: Create a Boolean variable in your main method and assign
the value what sleepIn method returns
-Variable Name: Boolean amIsleeping;
Example:
if pass false, false value then your method should return true
sleepIn (false, false) -> true

*/