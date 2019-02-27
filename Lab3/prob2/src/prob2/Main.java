package prob2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Apartment> apartments = new ArrayList<Apartment>();
		Apartment a1 = new Apartment(400);
		Apartment a2 = new Apartment(400);
		Apartment a3 = new Apartment(400);
		Apartment a4 = new Apartment(400);
		Apartment a5 = new Apartment(400);
		Apartment a6 = new Apartment(400);
		Apartment a7 = new Apartment(400);
		Apartment a8 = new Apartment(400);
		
		apartments.add(a1);
		apartments.add(a2);
		apartments.add(a3);
		apartments.add(a4);
		apartments.add(a5);
		apartments.add(a6);
		apartments.add(a7);
		apartments.add(a8);
		
		List<Building> buildings = new ArrayList<Building>();
		Building b1 = new Building(apartments,24);
		Building b2 = new Building(apartments,22);
		Building b3 = new Building(apartments,12);
		Building b4 = new Building(apartments,41);
		Building b5 = new Building(apartments,67);
		Building b6 = new Building(apartments,99);
		Building b7 = new Building(apartments,89);
		Building b8 = new Building(apartments,78);
		
		buildings.add(b1);
		buildings.add(b2);
		buildings.add(b3);
		buildings.add(b4);
		buildings.add(b5);
		buildings.add(b6);
		buildings.add(b7);
		buildings.add(b8);
		
		
		
		LandLord landLord = new LandLord(buildings);
		System.out.println("Net Profit " + landLord.aggregateProfits());
	}

}
