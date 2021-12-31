package com.noorteck.java.hw9;

public class Day9Question1 {
	
	public static void main(String[] args) {  //static goes first than void and capital S for String.
		double tempOne=84.7;	//in this case we would need a double variable to store decimals
		 int tempTwo =66;
		
		String result;
		if (tempOne <= 0 && tempTwo >= 100) { //int goes without "" and the symbol greater or lesser <> goes first than symbol equal =
			result = "true";  //String variables data must go inside " "
		}  else if  (tempOne >= 100 && tempTwo <= 0) {  //else goes first and then if and the symbol greater or lesser <> goes first than symbol equal =, I also  had to remove the ;
			result = "true"; //String variables data must go inside " "
		} else {
			result= "false";
		}
		
		System.out.println(result); //the correct name of variable is result without s and the end
		
		String season = "Monday";

		switch (season) { //the syntax is switch(controlling_expression), I also needed to update to JRE 1.8
		case "fall": //String data goes between " " and use colon not semicolon at the end
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");			
			 
		case "s": //we comparing String not char, controlling expression is String
			System.out.println("Recovering from cold weather");			
			break;
		case "summer": //colon at the end instead of semicolon
			System.out.println("Toooo hot");			
			 
		default: //colons at the end instead of semicolon
			System.out.println("Season does not exist!");	
		}
		
		
		for(int i=1; i<10; i++){ //use int with lowercase i to declare variable and must be initialized after i<10 use semicolon to separate and delete ; at the end.
			
			if (i == 5) { //delete semicolon and )( also == goes together, open curly braces
				System.out.println("I equals to 5");  //; at the end
			} else { //delete ()
				System.out.println("i not equals"); //String goes between ""
			}
		}
		
}

}
	
	// erase } and the second }
	
 



