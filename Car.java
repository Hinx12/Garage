
public class Car extends Vehicle {
	
	private int numOfWheels;
	
	public Car (int numOfWheels, String size, int speed, int ID, int cost, String type, String name) {
		
		super(size, speed, ID, cost, type, name);
		this.numOfWheels = numOfWheels;
	}
	
	public int getNumOfWheels() {
		return numOfWheels;
	}

}
