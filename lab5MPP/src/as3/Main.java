package as3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(1.5));
		shapes.add(new Triangle(1.5, 2.0));
		shapes.add(new Rectangle(1.7, 1.5));
		shapes.add(new Circle(1.5));
		
		double sumOfAreas = 0.0;
		for (Shape shape : shapes) {
			sumOfAreas += shape.computeArea();
		}
		
		printArea(sumOfAreas);
	}
	
	public static void printArea(double sumOfAreas) {
		System.out.printf("Sum of Areas = %.2f", sumOfAreas);
	}
}
