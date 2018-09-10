package prob9_squares;

import java.util.stream.IntStream;
/*
 * public static void printSquares(int num)
	which creates an IntStream using the iterate method. The method prints to the console the
	first num squares. For instance, if num = 4, then your method would output 1, 4, 9, 16. Note:
	You will need to come up with a function to be used in the second argument of iterate. Do
	not use the map or filter operations on Stream.
 */

public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(getNextSquare(5));
		printSquares(4);
	}
	
	public static int getNextSquare(int n) {
//		System.out.print(n*n+", ");
		return (int)Math.pow(Math.sqrt(n)+1,2);
	}
	public static void printSquares(int num) {
//		IntStream.iterate(1, n->n+1).map(x->x*x).limit(num).forEach(x->System.out.print(x+", "));
//		System.out.println("\n");
		IntStream.iterate(1, x->getNextSquare(x)).limit(num).forEach(x->System.out.print(x+", "));
	
	}
}
