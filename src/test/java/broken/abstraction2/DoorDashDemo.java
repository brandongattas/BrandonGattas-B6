package broken.abstraction2;

public class DoorDashDemo {
	
	public static void main(String[] args) {
	
		//cannot create object from an interface
		MyChoice obj1 = new MyChoice();		
		//Healthy obj2 = new Healthy();
			
		//DoorDash obj3 = new Subway();
		obj1.setPrice(22.22);
		
		//Subway obj4 = new Chipotle();	
		obj1.fee();
		
		//Chipotle obj4 = new MyChoice();	
		obj1.setPrice(15.99);
				
		Subway obj5 = new Subway("Brandon",15);
		
		/* Final variables values cannot be reassigned
		Healthy.amount = 22;
		Healthy.name = "MD";*/
		
		System.out.println(Healthy.amount);
		System.out.println(Healthy.name);
	}


}
