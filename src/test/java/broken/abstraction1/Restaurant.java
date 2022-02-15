package broken.abstraction1;

public abstract class Restaurant {
	public final double DISCOUNT = 20.00;
	public int luckyNumber= 12;
	public  int waitTime= 20;
	public String name;
	
	public Restaurant(String name, int luckyNumber, int waitTime) {
		name = this.name; //Used this keyword to refer to instance var
		luckyNumber = this.luckyNumber; //Used this keyword
		waitTime = this.waitTime; //Used this keyword
		
		System.out.println(this.name);
		System.out.println(this.waitTime);
		System.out.println(this.luckyNumber);
	}
	
	
	//removed static because static method cannot be overriden
	public abstract void location();
	
	public static void setOperationTime() {
		System.out.println("Monday-Friday");
	}
	
	//final method cannot be overriden or abstract
	public final void specialMenu() {
		
	}
	
	
	abstract void rating();
	
	//abstract method does not have a body
	public abstract void breakfastMenu();/* {
		System.out.println("9AM-11AM");
	}*/
	
	//added parameter
	public abstract void lunchMenu(String time);

	public abstract void dinnerMenu();
}