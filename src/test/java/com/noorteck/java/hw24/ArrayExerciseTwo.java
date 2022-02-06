package com.noorteck.java.hw24;

public class ArrayExerciseTwo {

	public static void main(String[] args) {

		ArrayExerciseTwo obj = new ArrayExerciseTwo();

		char[] c1 = { 'a', 'b', 'x', 'd', 'a', 'd', 'e', 'q', 'a' };
		System.out.println(obj.sameFirstLast(c1));

		char[] c2 = { 'x', 'd', 'a', 'd', 'e', 'q', 'a' };
		System.out.println(obj.sameFirstLast(c2));

		char[] c3 = { 'e', 'd', 'a', 'd', 'e', 'q', 'a', 'e' };
		System.out.println(obj.sameFirstLast(c3));

		char[] c4 = { 'a' };
		System.out.println(obj.sameFirstLast(c4));

	}

	protected boolean sameFirstLast(char[] c) {
		boolean result = false;

		if (c.length > 1 && (c[0] == c[c.length - 1])) {
			result = true;
		}

		return result;
	}

}
/**
 * 2. Write a method that takes an array of char parameter and return true if
 * the array size/length is more than 1 and the first element and the last
 * element in the array are equal, otherwise return false Access Modifier:
 * protected Non-Access Modifier: non-static Return Type: boolean Method Name:
 * sameFirstLast Parameter1: char [] c Test Data: sameFirstLast
 * ([‘a’,’b’,’x’,’d’,’a’,d’,’e’,’q’,’a’]) ----- TRUE sameFirstLast
 * ([’x’,’d’,’a’,d’,’e’,’q’,’a’]) ----- FALSE sameFirstLast
 * ([’e’,’d’,’a’,d’,’e’,’q’,’a’ ,’e’]) ----- TRUE sameFirstLast ([‘a’]) -----
 * FALSE
 */