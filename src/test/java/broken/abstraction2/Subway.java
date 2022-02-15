package broken.abstraction2;

// this class should inerhit DoorDash && Healthy
//using keyword implements because these are interfaces and using , instead of &&
public class Subway implements Doordash, Healthy {
	
	public Subway(String name, int duration) {
		//super(name, duration); Interface does not support constructor
		
		System.out.println("name:" + name);
		System.out.println("duration: " + duration);
	}
	public void setPrice(double price) {
		System.out.println("Price: "+ price);
	}
	
	@Override
	public void delivery() {
		System.out.println("Yes");
	}
	
	@Override
	public void fee() {
		System.out.println("10$");
	}
	
	@Override
	public void pickUp() {
		System.out.println("Yes");
	}
	
	@Override
	public void setCalories() {
		System.out.println("120");
	}
	
	@Override
	public void getCalories(String type) {
		System.out.println("Organic");
	}
}
