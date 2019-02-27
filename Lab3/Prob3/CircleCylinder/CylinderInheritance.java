package CircleCylinder;

public class CylinderInheritance {
	
	double height;
	double radius;	
	
	CylinderInheritance(double radius, double height){
		this.height = height;
		this.radius = radius;
		
	}
	
	public double getHeight() {
		return height;
	}
	
	protected double computeArea() {
		return ((22*radius)/7)*(radius);
	}
	

	public double computeVolume() {
		return (computeArea() * height);
	}
	

}
