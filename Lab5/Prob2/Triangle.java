package Prob2;

public final class Triangle implements Figure {
	
	private final double base;
	private final double height;
	
	public Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	public double getBase() {
		return base;
	}

	@Override
	public final double computeArea() {
		// TODO Auto-generated method stub
		return ((base * height)/2);
	}
	

}
