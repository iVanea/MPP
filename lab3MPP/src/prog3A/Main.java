package prog3A;

public class Main {

	public static void main (String[] args) {
		Circle circle = new Circle(5);
		System.out.printf("Circle area: "+ circle.computeArea());
		System.out.println();
		Cylinder cylinder = new Cylinder(5, 10);
		System.out.printf("Cylinder volume: "+ cylinder.computeVolume());
		
	}

}
