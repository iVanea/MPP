package prob2.c;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeInfo {
	static enum SortMethod {
		BYNAME, BYSALARY
	};

	public void sort(List<Employee> emps, final SortMethod method) {
		Function<Employee, String> byName = e -> e.name;
		Function<Employee, Integer> bySalary = e -> e.salary;
		List<Employee> emp1;
		if (method == SortMethod.BYNAME)
			emp1 = emps.stream().sorted(Comparator.comparing(byName).thenComparing(bySalary))
					.collect(Collectors.toList());
		else
			emp1 = emps.stream().sorted(Comparator.comparing(bySalary).thenComparing(byName))
					.collect(Collectors.toList());

		emps.clear();
		emps.addAll(emp1);
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		// same instance
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
