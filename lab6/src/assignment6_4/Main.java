package assignment6_4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strings = {"abc","record","2","stackoverflow", "    backnote   "};
		StringSort myStringSort = new StringSort(new StringSort.StringLengthComparator());
		
		String[] result  = myStringSort.stringSort(strings);
		
		String s = Arrays.toString(result);
		
		System.out.println(s);
	}

}
