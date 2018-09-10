package prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {

		BiFunction<Double, Double, List<Double>> myFunction = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
		};

		List<Double> list2 = myFunction.apply(2.0, 3.0);
		list2.forEach(System.out::println);
	}

}
