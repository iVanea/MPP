package march2017.prob2_;

public abstract class Account {

	private String accountID;
	private double balance;
	
	public Account(String accountID, double balance) {
		this.accountID = accountID;
		this.balance = balance;
	}
	public abstract String getAccountID();
	public abstract double getBalance();
	public abstract double computeUpdatedBalance();
	
}
