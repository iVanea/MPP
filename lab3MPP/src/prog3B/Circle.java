package prog3B;

public class Circle {
	Cylinder cylinder;
	public Circle(double radius) {
		cylinder = new Cylinder(radius, 0);
	}
	
	public double getRadius() {
		return cylinder.getRadius();
	}
	
	public double computeArea() {
		return Math.PI*Math.pow(getRadius(), 2);
	}
	
}
