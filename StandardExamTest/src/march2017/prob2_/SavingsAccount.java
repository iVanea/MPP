package march2017.prob2_;

public class SavingsAccount extends Account{
	private double balance;
	private double interestRate;
	private String acctId;
	
	public SavingsAccount(String accountID, double interestRate, double balance) {
		super(accountID, balance);
		this.balance = balance;
		this.interestRate = interestRate;
		this.acctId = accountID;
	}
	@Override
	public String getAccountID() {
		// TODO Auto-generated method stub
		return acctId;
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	@Override
	public double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance + (interestRate * balance);
	}

	
}
