package com.noorteck.java.hw15;

public class StaticRecapTwo {

	// static method
	public static void getInfo() {

		//TODO call [isJavaFun] variable and assign value = true
		StaticRecapOne.isJavaFun=true;

		//TODO call [totalAmount] variable and assign value = 1111
		StaticRecapOne.totalAmount=1111;

		//TODO print value of variable [isJavaFun]
		System.out.println(StaticRecapOne.isJavaFun);

		//TODO print value of variable [totalAmount]
		System.out.println(StaticRecapOne.totalAmount);

		//TODO call method [addNum()]
		StaticRecapOne.addNum(1, 2);

 

	}

	// non-static method
	public void statusUpdate() {

		//TODO call [month] variable and assign value = "January"
		StaticRecapOne obj = new StaticRecapOne();		
		obj.month="January";
		
		//TODO call [iLikeJava] variable and assign value = "Java is life"
		obj.iLikeJava="Java is life";

		//TODO print value of variable [month]
		System.out.println(obj.month);

		//TODO print value of variable [iLikeJava]
		System.out.println(obj.iLikeJava);

		//TODO call method [getCountry()]
		obj.getCountry();



	}

	public static void main(String[] args) {
		 

		//TODO call method [getInfo()]
		getInfo();
	}
}
