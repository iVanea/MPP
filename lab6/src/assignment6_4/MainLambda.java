package assignment6_4;

import java.util.Arrays;

public class MainLambda {

	public static void main(String[] args) {
		String [] strings = {"abc","record","2","stackoverflow"};
		StringSort myStringSort = new StringSort((String s1, String s2)->{
			return s1.compareTo(s2);
		});
		
		String[] result  = myStringSort.stringSort(strings);
		
		String s = Arrays.toString(result);
		
		System.out.println(s);
	}

}
