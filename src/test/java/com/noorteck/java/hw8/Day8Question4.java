package com.noorteck.java.hw8;

public class Day8Question4 {
	
	public static void main(String[] args) {
		
		//For Loop
		System.out.println("For Loop:");
		int even=0;
		int odd=0;
		
		for (int i=1; i<=20; i++) {
			if(i%2==0) {
				even=even+i;
			} else {
				odd=odd+i;
			}
		}
		
		System.out.println("Total of EVEN numbers: " + even);
		System.out.println("");
		System.out.println("Total of ODD numbers: " + odd);
		
		
		//While Loop
		System.out.println("");
		System.out.println("While Loop:");
		int even2=0;
		int odd2=0;
		int y=1;
		
		while (y<=20) {
			if(y%2==0) {
				even2=even2+y;
				y++;
			} else {
				odd2=odd2+y;
				y++;
			}
		}
			
		System.out.println("Total of EVEN numbers: " + even2);
		System.out.println("");
		System.out.println("Total of ODD numbers: " + odd2);
		
		
		//Do-While Loop
		System.out.println("");
		System.out.println("Do-While Loop:");
		int even3=0;
		int odd3=0;
		int x=1;
				
		do {
			if(x%2==0) {
				even3=even3+x;
				x++;
			} else {
				odd3=odd3+x;
				x++;
			}
		} while (x<=20);
					
		System.out.println("Total of EVEN numbers: " + even3);
		System.out.println("");
		System.out.println("Total of ODD numbers: " + odd3);
		

	}

}


/**
4.	write Java program to calculate the sum of Odd and even numbers.
a.	Loop through numbers between 1 and 20 and display the total of odd numbers and total of even numbers.
b.	Using for loop
c.	Using while loop
d.	Using do while loop
*/