package com.noorteck.java.hw8;

public class Day8Question5 {
	
	public static void main(String[] args) {
		
		//For Loop.
		System.out.println("For Loop:");
		for(int i=1; i<=32; i++) {
			if(i%2==0 && i>=2 && i<=5) {
				System.out.println(i + " Even Number 2-5.");
			} else if (i%2==0 && i>=6 && i<=20) {
				System.out.println(i + " Even Number 6-20.");
			} else if (!(i%2==0) && i>=15 && i<=20) {
				System.out.println(i + " Odd Number 15-20.");
			}
		}
		
		
		//While Loop.
		System.out.println("");
		System.out.println("While Loop:");
		int y=1;
		
		while(y<=32) {
			if(y%2==0 && y>=2 && y<=5) {
				System.out.println(y + " Even Number 2-5.");
				y++;
			} else if (y%2==0 && y>=6 && y<=20) {
				System.out.println(y + " Even Number 6-20.");
				y++;
			} else if (!(y%2==0) && y>=15 && y<=20) {
				System.out.println(y + " Odd Number 15-20.");
				y++;
			} else {
				y++;
			}
		}
		
		
		//Do-While Loop.
		System.out.println("");
		System.out.println("Do-While Loop:");
		int x=1;
			
		do {
			if(x%2==0 && x>=2 && x<=5) {
				System.out.println(x + " Even Number 2-5.");
				x++;
			} else if (x%2==0 && x>=6 && x<=20) {
				System.out.println(x + " Even Number 6-20.");
				x++;
			} else if (!(x%2==0) && x>=15 && x<=20) {
				System.out.println(x + " Odd Number 15-20.");
				x++;
			} else {
				x++;
			}
		} while(x<=32);
		
	}

}

/**
5.	Using for loop, loop through numbers 1-32

a.	If the number is even and in the range of 2 to 5
i.	then print “Even number 2-5 “ and the value of number. (numbers between 2

b.	If the number is even and in the range of 6 to 20
i.	then print “Even Number 6-20” and the value of the number


c.	If the number is odd and in the range of 15 to 20
i.	then print “Odd Number 15-20” and the value of the number
*/
