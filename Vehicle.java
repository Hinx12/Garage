//import java.util.ArrayList;

public class Vehicle {
	
	private String name;
	private String type;
	private String size;
	private int speed;
	private int ID;
	private int cost;
	private int bill;
	//private ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	
	public Vehicle (String size, int speed, int ID, int cost, String type, String name) {
		
		this.size = size;
		this.speed = speed;
		this.ID = ID;
		this.cost = cost;
		this.type = type;
		this.name = name;
		//vehicles.add(this);
	}
	
	public String getSize() {
		return size;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getCost() {
		return cost;
	}
	
	public int getID() {
		return ID;
	}
	
	public String toString() {
		return "ID: " + ID + ", Type: " + type + ", Model: " + name + ", Bill: "+ bill;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBill (int bill) {
		this.bill = bill;
	}
	
	public int getBill() {
		return bill;
	}
	
	//public ArrayList<Vehicle> getVehicles() {
		//return vehicles;
	//}
}
