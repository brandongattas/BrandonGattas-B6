package broken.abstraction2;

public interface Healthy {
	/*Variables by default are public static final
	  and must be initialized*/
	 
	int amount=3; 
	String name="Apple";	
	
	//Interfaces cannot have constructor
	/*public Healthy(int calorie) {
		System.out.println("Calorie: " + calorie );
	}
	
	public Healthy(int calorie, int amount) {
		System.out.println("Amount: " + amount);
		System.out.println("Calorie:" + calorie);
	}*/
	
	public abstract void getCalories(String type);
	
	public abstract void setCalories();
}