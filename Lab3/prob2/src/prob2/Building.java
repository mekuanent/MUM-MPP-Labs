package prob2;

import java.util.List;

public class Building {
	List<Apartment> apartments;
	double maintenanceCost;
	
	public Building(List<Apartment> apartments, double maintenanceCost) {
		this.apartments = apartments;
		this.maintenanceCost = maintenanceCost;
	}
	public double generateProfit() {
		double grossProfit = 0;
		for(Apartment a : this.apartments) {
			grossProfit += a.rent;
		}
		double netProfit = grossProfit - this.maintenanceCost;
		return netProfit;
	}
}
