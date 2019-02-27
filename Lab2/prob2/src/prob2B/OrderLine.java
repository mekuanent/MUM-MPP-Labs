package prob2B;

public class OrderLine {
	public int linenum;
	public double price;
	public String quality;
	
	public OrderLine(int linnum, double price2, String quality2) {
		this.linenum = linnum;
		this.price = price2;
		this.quality = quality2;
	}

	public static OrderLine createOrderLine(Order order, int linnum, double price, String quality) {
		if(order == null) {
			throw new NullPointerException("Student Must be set for GradeReport to be instanciated");
		}
		OrderLine orderLine = new OrderLine(linnum, price, quality);
		return orderLine;
	}
	
}
