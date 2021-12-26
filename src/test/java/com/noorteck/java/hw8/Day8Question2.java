package com.noorteck.java.hw8;

public class Day8Question2 {
	
	public static void main(String[] args) {
		
		//For Loop.
		System.out.println("For Loop:");
		
		for(int i=20; i<=200; i++) {
			if(i>=74 && i<=95) {
				System.out.println("Hurricane Category: 1 " + "Wind Speed: " + i);
			} else if(i>=105 && i<=110) {
				System.out.println("Hurricane Category: 2 " + "Wind Speed: " + i);
			} else if(i>=120 && i<=130) {
				System.out.println("Hurricane Category: 3 " + "Wind Speed: " + i);				
			} else if(i>=140 && i<=155) {
				System.out.println("Hurricane Category: 4 " + "Wind Speed: " + i);
			} else if(i>=165 && i<=194) {
				System.out.println("Hurricane Category: 5 " + "Wind Speed: " + i);
			}
		}
		
		//While Loop.
		System.out.println("");
		System.out.println("While Loop:");
		
		int y=20;
		
		while(y<=200) {
			if(y>=74 && y<=95) {
				System.out.println("Hurricane Category: 1 " + "Wind Speed: " + y);
				y++;
			} else if(y>=105 && y<=110) {
				System.out.println("Hurricane Category: 2 " + "Wind Speed: " + y);
				y++;
			} else if(y>=120 && y<=130) {
				System.out.println("Hurricane Category: 3 " + "Wind Speed: " + y);
				y++;
			} else if(y>=140 && y<=155) {
				System.out.println("Hurricane Category: 4 " + "Wind Speed: " + y);
				y++;
			} else if(y>=165 && y<=194) {
				System.out.println("Hurricane Category: 5 " + "Wind Speed: " + y);
				y++;
			} else {
				y++;
			}
		}
		
		//Do-While Loop.
		System.out.println("");
		System.out.println("Do-While Loop:");
		
		int x=20;
		
		do {
			if(x>=74 && x<=95) {
				System.out.println("Hurricane Category: 1 " + "Wind Speed: " + x);
				x++;
			} else if(x>=105 && x<=110) {
				System.out.println("Hurricane Category: 2 " + "Wind Speed: " + x);
				x++;
			} else if(x>=120 && x<=130) {
				System.out.println("Hurricane Category: 3 " + "Wind Speed: " + x);
				x++;
			} else if(x>=140 && x<=155) {
				System.out.println("Hurricane Category: 4 " + "Wind Speed: " + x);
				x++;
			} else if(x>=165 && x<=194) {
				System.out.println("Hurricane Category: 5 " + "Wind Speed: " + x);
				x++;
			} else {
				x++;
			}
		} while(x<=200);
		
	}

}


/**

2.	Write a program called Hurricane (class name) that takes the wind speed and prints whether it qualifies as hurricane. 
If it qualifies as a hurricane then display the wind speed and the Hurricane category it is.

a.	Wind speed can be anywhere from 20 -200. Using java loop, loop through and print ONLY if it qualifies as a Hurricane, 
the category of the hurricane and the wind speed.

Category	Wind Speed
1	74-95
2	105 – 110
3	120-130
4	140-155
5	165-194


*/