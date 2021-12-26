package com.noorteck.java.hw8;

public class Day8Question4 {
	
	public static void main(String[] args) {
		
		//For Loop
		System.out.println("For Loop:");
		int even=0;
		int odd=0;
		
		for (int i=1; i<=20; i++) {
			if(i%2==0) {
				even++;
			} else {
				odd++;
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
				even2++;
				y++;
			} else {
				odd2++;
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
				even3++;
				x++;
			} else {
				odd3++;
				x++;
			}
		} while (x<=20);
					
		System.out.println("Total of EVEN numbers: " + even3);
		System.out.println("");
		System.out.println("Total of ODD numbers: " + odd3);
		
	}

}
