package prob2;

public final class EquilateralTriangle implements Polygon {
	final private double side;

	
	public EquilateralTriangle(double side) {
		this.side = side;
	
	}

	public double getSide() {
		return side;
	}

	
	
//	@Override
//	public double computePerimeter() {
//		
//		return (double)(side*3);
//	}

	@Override
	public double[] getSides() {
		double arr[] = {side,side,side};
		return arr;
	}

}
