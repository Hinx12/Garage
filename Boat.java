
public class Boat extends Vehicle {
	
	private int numOfSails;
	
	public Boat (int numOfSails, String size, int speed, int ID, int cost, String type, String name) {
		
		super(size, speed, ID, cost, type, name);
		this.numOfSails = numOfSails;
	}
	
	public int getNumOfSails() {
		
		return numOfSails;
	}
}
