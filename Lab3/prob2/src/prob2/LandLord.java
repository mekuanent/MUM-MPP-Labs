package prob2;

import java.util.List;

public class LandLord {
	List<Building> buildings;
	
	public LandLord(List<Building> buildings) {
		this.buildings = buildings;
	}
	public double aggregateProfits() {
		double profit = 0;
		for(Building b: this.buildings) {
			profit += b.generateProfit();
		}
		return profit;
	}
}
