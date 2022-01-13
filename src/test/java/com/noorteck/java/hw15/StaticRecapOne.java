package com.noorteck.java.hw15;

public class StaticRecapOne {

	public static boolean isJavaFun;
	String month;
	
	public static int totalAmount;
	String iLikeJava;
	
	String country;
	int age;
	char gender;
	public static double temperature;

	public void setCountry() {

		//TODO call [country] variable and assign value = "USA";
		country="USA";

		//TODO  print the value of variable [country]
		System.out.println(country);
	}

	public void getCountry() {

		// call method [setCountry()]
		setCountry();

		// call variable [gender] and assign value 'f'
		gender='f';

		// print the [gender] variable
		System.out.println(gender);
		
		// call variable[age] and assign value 11
		age=11;

		// print variable [age]
		System.out.println(age);
	}

	public static void addNum(int a, int b) {
		int result = a+b;	
		System.out.println(result);
		
		
		//TODO call [temperature] variable and assign value = 55.55;
		temperature = 55.55;
		
		//TODO  print the value of variable [temperature]
		System.out.println(temperature);
		
		 
	}

	public static void divNum(int a, int b) {


		//TODO  call method[addNum()]
		addNum(1,2);
		System.out.println(a / b);

	}

}
