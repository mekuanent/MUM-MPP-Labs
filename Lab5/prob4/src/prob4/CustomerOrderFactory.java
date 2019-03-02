package prob4;

import java.time.LocalDate;

public class CustomerOrderFactory {
	
	public static Customer createCustomerAndOrder(String name, LocalDate orderDate, String[] items) {
		Customer customer = new Customer(name);
		customer.createOrder(orderDate,items);
		return customer;
	}

}
