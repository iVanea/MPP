package prog3A;

public class Cylinder {
	private double radius;
	public double height;
	
	public Cylinder(double radius, double height) {
		setRadius(radius);
		setHeight(height);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double computeVolume() {
		return (Math.PI*Math.pow(getRadius(), 2)*getHeight());
	}
}
