package com.noorteck.java.hw8;

public class Day8Question3 {
	
	public static void main(String[] args) {
		
		//For Loop.
		System.out.println("For Loop:");
		int sum = 0;
		int count = 0;
		
		for (int i=20; i<=30; i++) {
			sum=sum+i;
			count++;
		}
		System.out.println("The Average of numbers between 20 and 30 is: " + sum/count);

		//While Loop.
		System.out.println("");
		System.out.println("While Loop:");
		int sum2 = 0;
		int count2 = 0;
		int y = 20;
		
		while (y<=30) {
			sum2=sum2+y;
			count2++;
			y++;
		}
		System.out.println("The Average of numbers between 20 and 30 is: " + sum2/count2);
		
		
		//Do-While Loop.
		System.out.println("");
		System.out.println("Do-While Loop:");
		int sum3 = 0;
		int count3 = 0;
		int x = 20;
		
		do {
			sum3=sum3+x;
			count3++;
			x++;
		} while (x<=30);
		System.out.println("The Average of numbers between 20 and 30 is: " + sum3/count3);
	
	}

}


/**

3.	Write a program to calculate the average of numbers between 20 and 30
a.	Using for loop
b.	Using while loop
c.	Using do while loop

*/