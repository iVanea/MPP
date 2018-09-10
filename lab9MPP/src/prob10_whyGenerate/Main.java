package prob10_whyGenerate;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * part A IntStream ones = IntStream.generate(() -> 1).distinct();
		 * ones.forEach(System.out::println);
		 */
		// code below that is commented generates an infinite IntStream of number one,
		// distinct return only elements that are distinct by others, the solution is to
		// limit the generation of elements.
		IntStream ones = IntStream.generate(() -> 1).limit(2).distinct();
		ones.forEach(System.out::println);

		// Stream<BigInteger> bigIntStream = Stream.iterate(BigInteger.ZERO, n ->
		// n.add(BigInteger.ONE)).limit(10);
		// BigInteger[] bigIntArr = bigIntStream.toArray(BigInteger[]::new);
		// System.out.println(Arrays.toString(bigIntArr));

		/*
		 * part B
		 */
		System.out.println(Stream.of("Bill", "Thomas", "Mary").collect(Collectors.toList()));

		/*
		 * part C You have a Stream of Integers called myIntStream and you need to
		 * output both the maximum and minimum values somehow, making use of this stream
		 * only once. Write compact code that efficiently accomplishes this.
		 */

		IntStream myIntStream = IntStream.of(0, 5, -20, 7, 89, -3);
		
		// System.out.println(Stream.concat(myIntStream.sorted(),
		// myIntStream.sorted()));
//		 IntStream.concat(myIntStream.boxed().reduce(0, (x,y)->x>y?x:y),
//		 IntStream.of(myIntStream.reduce(0,
//		 (x,y)->x<y?x:y))).forEach(System.out::println);
//		System.out.println(myIntStream.reduce(0, (x, y) -> x > y ? x : y));
//		System.out.println(myIntStream.reduce(0, (x, y) -> x > y ? y : x));
		
//		myIntStream.sorted()..forEach(System.out::println);
//		
//		IntStream.concat(myIntStream.sorted().findFirst(), myIntStream.unordered().findFirst());
		Stream<Integer> intStream = Arrays.asList(1,2,3).stream();
		IntSummaryStatistics summary
		   = intStream.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("max = " + summary.getMax() 
		                   + " min = " + summary.getMin());
		
		System.out.println();
	}

}
