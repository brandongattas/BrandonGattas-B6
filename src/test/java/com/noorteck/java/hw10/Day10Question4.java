package com.noorteck.java.hw10;

public class Day10Question4 {
	
	public static void main(String[] args) {
		
		getDoWhileLoopResult(3,8);
		
	}
	
	public static void getDoWhileLoopResult(int minNum, int maxNum) {
		
		do {
			System.out.println(minNum);
			minNum++;
		} while (minNum<=maxNum);

	}

}
