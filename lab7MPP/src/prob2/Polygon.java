package prob2;

public interface Polygon extends ClosedCurve {
	
	double[] getSides();
	
	@Override
	default double computePerimeter() {
		double sum = 0;
		double arr[] = getSides();
		for(Double d : arr) {
			sum += d;
		}
		return sum;
	}
}
