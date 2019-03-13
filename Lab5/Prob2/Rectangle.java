package Prob2;

public final class Rectangle implements Figure {
	
	private final double width;
	private final double length;
	
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}


	@Override
	public final double computeArea() {

		return width * length;
	}
	
	

}
