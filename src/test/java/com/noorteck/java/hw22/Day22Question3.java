package com.noorteck.java.hw22;

public class Day22Question3 {

	protected String threeEqual(String str, char oldChar, char newChar) {
		String result = "";

		if (str != null) {
			int length = str.length();

			for (int i = 0; i < length; i++) {
				if (str.charAt(i) == oldChar) {
					result = str.replace(oldChar, newChar);
				}
			}
		} else {
			result = "null";
		}

		return result;
	}

	public static void main(String[] args) {

		Day22Question3 obj = new Day22Question3();

		System.out.println(obj.threeEqual(null, 'P', 'B'));
		System.out.println(obj.threeEqual("Java Pro", 'P', 'B'));
		System.out.println(obj.threeEqual("Lazy mode", 'm', 'C'));
		System.out.println(obj.threeEqual("Training", 'T', ' '));

	}

}
/**
 * 3. Write a method that takes three parameters. One String parameter, 2
 * character parameters. The method replaces old character (parameter 2) from
 * String parameter with new character (parameter 3) and returns the new string
 * Access Modifier: protected Non-Access Modifier: non-static Return Type:
 * String Method Name: threeEqual Parameter1: String str Parameter2: char
 * oldChar Parameter3: char newChar Test Data: threeEqual (null, ’P’, ‘B‘) -----
 * null threeEqual (“Java Pro”, ’P’, ‘B‘) ----- Java Bro threeEqual (“Lazy
 * mode”, ‘m‘, ‘C‘) ----- Lazy Cod threeEqual (“Training”, ‘T’, ‘ ‘) -----
 * raining
 */