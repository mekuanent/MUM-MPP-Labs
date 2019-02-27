package CircleCylinder;


public class Cylinder {
	
	double height;
	double radius;	
	Circle circle;
	
	Cylinder(double radius, double height){
		this.height = height;
		this.radius = radius;
		
		circle = new Circle(radius);
	}
	
	public double getHeight() {
		return height;
	}
	

	public double computeVolume() {
		return (circle.computeArea() * height);
	}
	
	
	

}
