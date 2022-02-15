package broken.abstraction2;

//this class should inerhit DoorDash && Healthy
//using implements keyword instead of inherits
public class Chipotle implements Doordash, Healthy{
	
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
