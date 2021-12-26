package com.noorteck.java.hw8;

public class Day8Question1 {

	public static void main(String[] args) {
		
		//For Loop.
		System.out.println("For Loop:");
		for (int i=1; i<=36; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("CozaLoza");
			} else if (i%3==0) {
				System.out.println("Coza");
			} else if (i%5==0) {
				System.out.println("Loza");
			} else if (i%7==0) {
				System.out.println("Woza");
			} else {
				System.out.println(i);
			}
			
		}
		
		//While Loop.
		System.out.println("");
		System.out.println("While Loop:");
		int y=1;
		
		while (y<=36) {
			if (y%3==0 && y%5==0) {
				System.out.println("CozaLoza");
				y++;
			} else if (y%3==0) {
				System.out.println("Coza");
				y++;
			} else if (y%5==0) {
				System.out.println("Loza");
				y++;
			} else if (y%7==0) {
				System.out.println("Woza");
				y++;
			} else {
				System.out.println(y);
				y++;
			}
		}
		
		//Do-While Loop.
		System.out.println("");
		System.out.println("Do-While Loop:");
		int x=1;
		
		do {
			if (x%3==0 && x%5==0) {
				System.out.println("CozaLoza");
				x++;
			} else if (x%3==0) {
				System.out.println("Coza");
				x++;
			} else if (x%5==0) {
				System.out.println("Loza");
				x++;
			} else if (x%7==0) {
				System.out.println("Woza");
				x++;
			} else {
				System.out.println(x);
				x++;
			}
		} while (x<=36);
		

	}
}
