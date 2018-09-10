package prob6_partOfStream;

import java.util.Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main (String[] args) {
/*
 * Create a method
Stream<String> streamSection(Stream<String> stream, int m, int n)
which extracts a substream from the input stream stream consisting of all elements from
position m to position n, inclusive; you must use only Stream operations to do this. You can
assume 0 <= m <= n. A Java class has been provided for you in the lab folder for this lesson;
implement the method streamSection given in that class, and test using the main method
provided.

 */
//		new Main().workWithSets();
//		Calculator calculator = new Calculator();
//		String result = calculator.calculate((a1,a2)->"-> "+(a1+a2), 1, 1);
//		System.out.println(result);
		
		Stream<String> stream = Stream.of("a", "b", "c", "1", "2", "3", "a", "b", "c");
		stream = new Main().streamSection(stream, 2, 6);
		stream.forEach(System.out::println);
	}
	
	Stream<String> streamSection(Stream<String> stream, int m, int n){
		
		return stream.skip(m).limit(n-m+1).collect(Collectors.toList())
				.stream();
	}
	
	void workWithSets() {
		 Set<Integer> a = new HashSet<Integer>();
	        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
	        Set<Integer> b = new HashSet<Integer>();
	        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
	 
	        // To find union
	        Set<Integer> union = new HashSet<Integer>(a);
	        union.addAll(b);
	        System.out.print("Union of the two Set");
	        System.out.println(union);
	 
	        // To find intersection
	        Set<Integer> intersection = new HashSet<Integer>(a);
	        intersection.retainAll(b);
	        System.out.print("Intersection of the two Set");
	        System.out.println(intersection);
	 
	        // To find the symmetric difference
	        Set<Integer> difference = new HashSet<Integer>(a);
	        difference.removeAll(b);
	        System.out.print("Difference of the two Set");
	        System.out.println(difference);
	        System.out.println("--------------------------\n\n");
	}
	
}
class Calculator {
	public String calculate(BiFunction<Integer, Integer, String> biFunc, Integer item1, Integer item2) {
		return biFunc.apply(item1, item2);
	}
}
