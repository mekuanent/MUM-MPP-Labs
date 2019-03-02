package extPackage;

import java.time.LocalDate;

import prob4.Customer;
import prob4.CustomerOrderFactory;
import prob4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustomerOrderFactory.createCustomerAndOrder("Bob", LocalDate.now(), new String[]{"Chili","Pepperoni","Veggie"});
		System.out.println(cust.getOrders());
	}
}

		

