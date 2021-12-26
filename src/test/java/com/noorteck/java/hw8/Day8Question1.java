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


/**

1.	Write a program called CozaLozaWoza (class Name) which prints the numbers 1 to 36
a.	The program shall print "Coza" in place of the numbers which are multiples of 3 ONLY, ( I % 3 ==0)
b.	"Loza" for multiples of 5 ONLY, ( I % 5 == 0)
c.	"Woza" for multiples of 7 ONLY, ( I % 7 == 0)
d.	"CozaLoza" for multiples of 3 and 5
e.	If the number is not divisible of the above condition, then print the number itself


Example, the output should look like:
1, 2 , Coza, 4 , Loza, Coza, Woza, 8, Coza, Loza, CozaLoza

*/