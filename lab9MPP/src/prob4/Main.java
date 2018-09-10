package prob4;

import java.util.List;
import java.util.stream.*;

public class Main {
	final Stream<Integer> primes = Stream.iterate(2, n -> generateNextPrime(n)).limit(5).collect(Collectors.toList())
			.stream();

	public static void main(String[] args) {
		/*
		 * This exercise asks you to work with potentially infinite streams of prime
		 * numbers. A. To begin, create a final variable Stream<Integer> primes that
		 * contains all prime numbers (in particular, the Stream is infinite). Generate
		 * the primes using the iterate method of Stream – do not use the map or filter
		 * Stream operations
		 */

		// System.out.println(primes.map( n -> n.toString()
		// ).collect(Collectors.joining(", ")));
		new Main().printFirstNPrimes(5);

	}

	/*
	 * B. Next, create a variation of the primes Stream that can be called multiple
	 * times by a method printFirstNPrimes(long n), which prints to the console the
	 * first n prime numbers. Note that the Stream primes that you created in part A
	 * cannot be used a second time; how can you get around that limitation? Prove
	 * that you succeeded by calling the method printFirstNPrimes(long n) (from a
	 * main method) more than once.
	 */
	public static boolean isPrime(int number) {
		return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
	}

	public static int generateNextPrime(int number) {
		return IntStream.iterate(number + 1, n -> n + 1).filter(s -> isPrime(s)).limit(1).findFirst().getAsInt();
	}

	public void printFirstNPrimes(long n) {
		List<Integer> list = primes.collect(Collectors.toList());
		System.out.println("List with first 5 primes: " + list);
		System.out.println("Continue find next 5 primes: " + Stream.iterate(2, i -> generateNextPrime(i))
				.filter(x -> !list.contains(x)).limit(n).collect(Collectors.toList()));

	}
}
