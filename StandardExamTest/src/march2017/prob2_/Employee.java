package march2017.prob2_;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	List<Account> accounts = new ArrayList<>();;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void addAccount(Account acct) {
		this.accounts.add(acct);
	}

	public double computeUpdatedBalanceSum() {
		double suma = 0.0;
		for(Account account :accounts)
			suma+=account.computeUpdatedBalance();
		return suma;
	}
}
