package CircleCylinder;

public class Circle{
	
	double radius;
	
	Circle(double radius){
		this.radius = radius;
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double computeArea() {
		
		return ((22*radius)/7)*(radius);
	}

}
