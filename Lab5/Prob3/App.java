package Prob3;

import Vehicles.Vehicle;
import Vehicles.VehicleFactory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vCar = VehicleFactory.getVehicle("Car");
		Vehicle  vBus= VehicleFactory.getVehicle("Bus");
		Vehicle vTrack = VehicleFactory.getVehicle("Track");
		Vehicle vElectric = VehicleFactory.getVehicle("ElectricCar");
		
		vCar.startEngine();
		vBus.startEngine();
		vTrack.startEngine();
		vElectric.startEngine();
		
		
		

	}

}
