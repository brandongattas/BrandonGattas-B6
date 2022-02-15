package broken.abstraction1;

public class RestaurantDemo {
	
	//erased ; after parenthesis
	public static void main(String[] args) {
		
		//cannot create object of an abstract class
		FastFood obj1 = new FastFood();
		obj1.location();
		System.out.println(obj1.DISCOUNT);
		
		//Cannot create object of an abstract class
		//Restuarant obj2 = new FastFood();
		obj1.getInfo();//method not expecting parameter
		obj1.setInfo();
		
		//used the same object
		//FastFood obj3 = new Fastfood("John Cena", 12);
		
		//final variable cannot be reassigned value
		//obj1.DISCOUNT = 44.44;
		
		obj1.dinnerMenu();//already printing void
		obj1.lunchMenu("11 pm - 3 pm");//specifying parameter
		
		
	}
 

}
