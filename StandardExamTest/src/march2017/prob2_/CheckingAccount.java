package march2017.prob2_;

public class CheckingAccount extends Account{
	private double balance;
	private double monthlyFee;
	private String acctId;
	
	public CheckingAccount(String accountID, double monthlyFee, double balance) {
		super(accountID, balance);
		this.balance = balance;
		this.monthlyFee = monthlyFee;
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
		return balance-monthlyFee;
	}

}
