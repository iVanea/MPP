package prob4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Kerbson", "Louis", "Vilaire", "Ocatvius", "Chrisner", "Charles", "Jean",
				"Toussaint", "Bernaud", "Julmeus");

		System.out.println(new Main().countWords(list, 'e', 'd', 4));
	}

	public int countWords(List<String> words, char c, char d, int len) {

		int count = (int) words.stream().filter(value -> value.length() == len).filter(value -> value.contains(c + ""))
				.filter(value -> !value.contains(d + "")).count();

		return count;
	}

}
