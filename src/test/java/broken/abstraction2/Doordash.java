package broken.abstraction2;

public interface Doordash {
	
	//interface cannot have constructor
	/*public Doordash(String name, int duration) {	
		System.out.println("Name:" + name);
		System.out.println("Duraiton:" + duration);
	}*/
	
	public abstract void delivery();	
	public abstract void fee();	
	public abstract void pickUp();//changed to public access modifier
		
	//changed to return type void
	default void getLocation() {	
		System.out.println("Rest Town Center");
	}
	
	//changed return type to String
	public static String setLocation(String location) {		
		location = "Reston";	
		System.out.println(location);
		return location;
	}
}
