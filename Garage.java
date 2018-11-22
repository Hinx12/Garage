import java.util.ArrayList;

public class Garage {
	
	private ArrayList<Vehicle> garage;
	
	public Garage () {
		
		garage = new ArrayList<Vehicle>();
	}
	
	public static void main(String[] args) {
		
		Garage garageManager = new Garage();
		garageManager.addVehicle(new Car (4, "Medium", 120, 502, 2000, "Car", "Ford"));
		garageManager.addVehicle(new Car (4, "Small", 200, 203, 5000, "Car", "Ferrari"));
		garageManager.addVehicle(new Plane (2, "Large", 700, 10000, 304, "Plane", "Concorde"));
		garageManager.addVehicle(new Boat (3, "Large", 300, 650, 7000, "Boat", "Titanic"));
		garageManager.removeVehicle("Plane");
		garageManager.printGarage();
		//garageManager.fixVehicle();
		//garageManager.printGarage();
		//garageManager.emptyGarage();
		//garageManager.printGarage();

	}
	
	// DONE
	public void addVehicle (Vehicle vehicle) {
		
		System.out.println("Adding " + vehicle + " to Garage");
		garage.add(vehicle);
	}
	

	// DONE by ID
	public void removeVehicle (int ID) {
		
		System.out.println("Removing Vehicle with ID: " + ID);
	
		for (Vehicle vehicle : garage) {
			
			if (ID == vehicle.getID()) {
				garage.remove(vehicle);
				break;
			} else {
				continue;
			}
		}
	}
	
	// DONE by Vehicle Type
	public void removeVehicle (String type) {
	
		System.out.println("Removing Vehicle with type: " + type);
		
		for (Vehicle vehicle : garage) {
			
			if (type == vehicle.getType()) {
				garage.remove(vehicle);
				break;
			} else {
				        
				continue;
			}
		}
	}
	
	// DONE
	public void emptyGarage() {
		
		System.out.println("List of all Vehicles being Removed");

		for (Vehicle vehicle : garage) {
			if (garage.isEmpty()) {
				System.out.println("Garage Empty");
			} else {
				System.out.println(vehicle);
				garage.clear();
			}
		}
	}
	
	// DONE
	public void printGarage() {
		
		System.out.println("Printing Vehicles in Garage");
		
		if (garage.isEmpty()) {
			System.out.println("Garage is Empty");
		} else {
			for (Vehicle vehicle : garage) {
				System.out.println(vehicle);
			}
		}
	}
	
	// DONE
	public void fixVehicle() {
		
		System.out.println("Calculating bills for all Vehicles");
		
		for (Vehicle vehicle : garage) {
			
			if (vehicle instanceof Car) {
				Car theCar = (Car) vehicle;
				theCar.setBill(theCar.getNumOfWheels() * 100);
			} else if (vehicle instanceof Plane) {
				Plane thePlane = (Plane) vehicle;
				thePlane.setBill(thePlane.getNumOfWings() * 500);
			} else {
				Boat theBoat = (Boat) vehicle;
				theBoat.setBill(theBoat.getNumOfSails() * 1000);
			}
		}
	}
}
