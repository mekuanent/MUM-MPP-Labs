package prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Order> orders;
	public Customer(String name) {
		this.name = name;
		orders = new ArrayList<Order>();	
	}

	public void createOrder(LocalDate date, String[] items) {
		Order order = new Order(date);
		for(String item: items) {
			order.addItem(item);
		}
		orders.add(order);
	}
	public String getName() {
		return name;
	}
	public List<Order> getOrders() {
		return orders;
	}
}

