package CircleCylinder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder c = new Cylinder(1,10);
		Circle cr = new Circle(1);
		CylinderInheritance cl = new CircleInheritance(1);
		
		System.out.println(c.computeVolume());
		System.out.println(cr.computeArea());
		System.out.println(cl.computeArea());
		
		

	}

}
