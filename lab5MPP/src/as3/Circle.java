package as3;

public final class Circle implements Shape {
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double computeArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public double getRadius() {
		return radius;
	}
}
