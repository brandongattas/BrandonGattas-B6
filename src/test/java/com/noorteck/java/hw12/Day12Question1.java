package com.noorteck.java.hw12;

public class Day12Question1 {
	
	public static void main(String[] args) {
		boolean result = isTrue(-1, -1, true);
		
		System.out.println(result);
	}
	
	public static boolean isTrue(int valueOne, int valueTwo, boolean valueTrueFalse) {
		boolean result=false;
		
		if(valueOne<0 && valueTwo>=0 && valueTrueFalse==false) {
			result=true;
		} else if (valueOne>=0 && valueTwo<0 && valueTrueFalse==false) {
			result=true;			
		} else if (valueOne<0 && valueTwo<0 && valueTrueFalse==true){
			result=true;
		} else {
			result=false;
		}
		
		return result;
	}

}


/**

1) Given 2 int values and 1 boolean value, return true if one is negative and one is positive and
boolean value is false. Except if the boolean parameter is true, then return true only if both
are negative.
posNeg (1, -1, false) ---  true
posNeg (-1, 1, false) ---  true
posNeg (-4, -5, true) ---  true


*/