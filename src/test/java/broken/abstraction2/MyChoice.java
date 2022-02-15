package broken.abstraction2;

//This class should inerhit Subway
//using extends because this are both classes
public class MyChoice extends Subway {
	
	//needed to specified constructor
	public MyChoice() {
		super("Brandon",25);
	}
	
	@Override 
	//misspelled method's name
	public void setPrice(double price) {
		System.out.println("New : " + price);
	}

}
