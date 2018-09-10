package march2017.prob2_;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double suma =0.0;
		for(Employee employee : list)
			suma += employee.computeUpdatedBalanceSum();
		return suma;
	}
}
