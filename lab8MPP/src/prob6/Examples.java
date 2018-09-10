package prob6;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {	
	/*	A. (Employee e) -> e.getName()
	 * Change it to Class::instanceMethod
	 * */
	Function<Employee, String> empName = Employee::getName;
	
	
	/*	B. (Employee e,String s) -> e.setName(s)
	 * Change it to Class::instanceMethod
	 * */
	BiConsumer<Employee, String> empSetName = Employee::setName;
	
	
	/*	C. (String s1,String s2) -> s1.compareTo(s2)
	 * Change it to Class::instanceMethod
	 * */
	BiFunction<String, String, Integer> stringCompare = String::compareTo;
	
	/*	D. (Integer x,Integer y) -> Math.pow(x,y)
	 * Change it to Class::staticMethod
	 * */
	BiFunction<Integer, Integer, Double> mathPow = Math::pow;
	
	/*	E. (Apple a) -> a.getWeight()
	 * Change it to Class::instanceMethod
	 * */
	Function<Apple, Double> weight = Apple::getWeight;
	
	/*	F. (String x) -> Integer.parseInt(x);
	 * Change it to Class::staticMethod
	 * */
	Function<String, Integer> StringToIint = Integer::parseInt;
	
	/* G.EmployeeNameComparator comp = new EmployeeNameComparator();
	 * (Employee e1, Employee e2) -> comp.compare(e1,e2)
	 * Change it to Class::staticMethod
	 * */
	EmployeeNameComparator comp = new EmployeeNameComparator();
	BiFunction<Employee, Employee, Integer> compEmp = comp::compare;
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
