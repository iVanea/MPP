package as3;

public final class Rectangle implements Shape {
	private final double width;
	private final double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double computeArea() {
		return this.width * this.length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
}
