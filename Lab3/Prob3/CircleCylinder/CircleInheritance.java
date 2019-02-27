package CircleCylinder;

public class CircleInheritance extends CylinderInheritance{
	
	
	
	
	CircleInheritance(double radius){		
		super(radius,0);		
	}
	
	public double getRadius() {
		return super.radius;
	}
	
	@Override
	public double computeArea() {
		return super.computeArea();
	}
	

}
