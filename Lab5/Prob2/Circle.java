package Prob2;

public final class Circle implements Figure{
	
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public final double computeArea() {
		
		return ((22 * radius * radius )/7);
	}

	

}
