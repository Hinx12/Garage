
public class Plane extends Vehicle {
	
	private int numOfWings;
	
	public Plane(int numOfWings, String size, int speed, int cost, int ID, String type, String name) {
		
		super(size, speed, ID, cost, type, name);
		this.numOfWings = numOfWings;
	}
	
	public int getNumOfWings() {
		
		return numOfWings;
	}
}
