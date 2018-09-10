package prob2;

public final class Ellipse implements ClosedCurve{
	final private double semiMajorAxis;//a
	final private double e;
	
	
	
	public Ellipse(double semiMajorAxis, double e) {
		this.semiMajorAxis = semiMajorAxis;
		this.e = e;
	}



	public double getSemiMajorAxis() {
		return semiMajorAxis;
	}



	public double getSemiMinorAxis() {
		return e;
	}



	@Override
	public double computePerimeter() {

		return 4*semiMajorAxis*e;
	}

}
