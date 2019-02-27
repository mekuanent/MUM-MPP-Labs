package prob2B;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	public Date orderDate; 
	public List<OrderLine> orderLines;
	public Order(Date orderDate, int orderLineNum, double orderLinePrice, String orderLineQuality) {
		this.orderDate = orderDate;
		this.orderLines = new ArrayList<OrderLine>();
		OrderLine orderline = OrderLine.createOrderLine(this, orderLineNum, orderLinePrice, orderLineQuality);
		this.orderLines.add(orderline);
	}
	
	public void addOrderLine(OrderLine orderline) {
		this.orderLines.add(orderline);
	}
	
	public static void main(String[] args) {
		Order order = new Order(new Date(),1,2.4,"good");
		order.addOrderLine(OrderLine.createOrderLine(order, 2, 2.5, "excellent"));
		order.addOrderLine(OrderLine.createOrderLine(order, 3, 2.1, "fair"));
		order.addOrderLine(OrderLine.createOrderLine(order, 4, 2.3, "excellent"));
		order.addOrderLine(OrderLine.createOrderLine(order, 5, 2.4, "perfect"));
		order.addOrderLine(OrderLine.createOrderLine(order, 6, 2.6, "good"));
		
		System.out.println("Order Date : " + order.orderDate.toLocaleString());
		for(OrderLine ol : order.orderLines) {
			System.out.println("Order Line => num : " + ol.linenum + " price: " + ol.price + " quality : " + ol.quality);
		}
	}
}
