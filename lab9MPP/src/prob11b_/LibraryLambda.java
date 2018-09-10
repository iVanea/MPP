package prob11b_;

import java.util.List;
import java.util.stream.Collectors;

public class LibraryLambda {
	public static final TriFunction<List<Employee>, Integer, String, String> namesBySalary = (employeers, salary, letter)->
											employeers.stream().filter(x->x.getSalary()>salary)
											.filter(x->x.getLastName().compareTo(letter)>0)
											.map(e->e.getFirstName()+" "+e.getLastName()).sorted()
											.collect(Collectors.joining(", "));
}
