public class Ellipse implements ClosedCurve {
	private double a, e;
	public Ellipse(double a, double e) {
        this.a = a;
		this.e = e;        
	}
	
	@Override
	public double computePerimeter() {
		return 4 * a * e;
	}
}