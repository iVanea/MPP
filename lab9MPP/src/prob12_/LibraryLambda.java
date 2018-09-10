package prob12_;

import java.util.List;
import java.util.stream.Collectors;

public class LibraryLambda {
	// the number of Employees in list whose salary > 100000 and whose last name begins
	//with a letter that comes after the letter 'E'
	public static final TriFunction<List<Employee>, Integer, Character, Integer> countEmployeesBySalaryAndLetter =
			(emps, salary,letter)-> (int)(long)emps.stream().filter(e->e.getSalary()>salary)
			.filter(e->e.lastName.charAt(0)>letter).count();
			
	//a list of sorted full names - all upper case -- of Employees with	
	//salary > 85000 and whose first name begins with a letter that comes before  the letter 'R'
	public static final TriFunction<List<Employee>,Integer,Character,String> fullNameEmployessBySalaryAndLetter = 
			(emps, salary, letter)-> emps.stream().filter(e->e.getSalary()>salary)
			.filter(e->e.getLastName().charAt(0)>letter)
			.map(e->e.getFirstName().toUpperCase()+" "+e.getLastName().toUpperCase()).sorted()
			.collect(Collectors.joining(","));
}
