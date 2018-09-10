package prob5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// Using lambda expression
		Consumer<String> consumer1 = values -> System.out.println(values.toUpperCase());
		list.forEach(consumer1);

		// Using method reference
		Consumer<String> consumer2 = System.out::println;
		list.stream().map(String::toUpperCase).forEach(consumer2);

	}

}