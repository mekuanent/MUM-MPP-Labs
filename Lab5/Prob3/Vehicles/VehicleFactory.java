package Vehicles;

public class VehicleFactory {
	
	public static Vehicle getVehicle(String v) {
		
		
		if(v == "Car") {
			Vehicle vehicle = new Car();
			return vehicle;
		}
		if(v == "ElectricCar") {
			Vehicle vehicle = new ElectricCar();
			return vehicle;
		}
		if(v == "Track") {
			Vehicle vehicle = new Track();
			return vehicle;
		}
		
		Vehicle vehicle = new Bus();
		return vehicle;
		
		
	}
}
