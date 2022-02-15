package broken.abstraction1;

/*used extends instead of implements because we are
  referencing between class to another class.*/
public class FastFood extends Restaurant {
	
	public FastFood(){
		super("Carls Jr", 11, 25);
	}
	
	@Override
	//Overriding method cannot be more restrictive
	public void location() {
		System.out.println("Reston VA");
	}
	
	//@Override //capital O for Override
	//Hiding static method instead of overriding
	public static void setOperationTime() {
		System.out.println("24/7");
	}
	
	@Override
	public void lunchMenu(String time) {
		System.out.println("Time: " + time);
	}
	
	@Override
	/*return type is void instead of int, 
	  case sensitive and cannot be more restrictive.*/
	public void breakfastMenu() {
		System.out.println("Not serving...");
	}
	
	@Override 
	//corrected method's name and added return type void
	public void dinnerMenu() {
		System.out.println("7PM-10PM");
	}
	
	public void display() {
		/* This is a Final variable, cannot reasign value
		DISCOUNT = 30.00;*/
		
		//this is int variable not double
		luckyNumber = 22;
		
		//this is int variable nto String
		waitTime = 25;
		
		//implemented rating abstract method
		rating();
	}
	
	void rating() {
		System.out.println("3 stars");
	}
	
	//this is a concrete class, no abstract method allowed
	public void getInfo() {
		System.out.println("This is info");
	}
	
	//this is concrete class
	public void setInfo() {
		
	}

}
