package probC;

final public class PayCheck {
	private final double grossPay;
	private final double fica;
	private final double state;
	private final double local;
	private final double medicare;
	private final double socialSecurity;
	
	
	PayCheck(double grossPay){
		
		this.grossPay = grossPay;
		this.fica = 0.23*this.grossPay;
		this.state = 0.05*this.grossPay;
		this.local = 0.01*this.grossPay;
		this.medicare = 0.03*this.grossPay;
		this.socialSecurity = 0.075*this.grossPay;
	}
	public double getNetPay() {
		double deduction = fica+state+local+medicare+socialSecurity;
		double netPay = grossPay - deduction;
		return netPay;
	}
	
	public void print() {
		StringBuilder sb = new StringBuilder();
		sb.append("The Net Pay is : "+getNetPay()+"\n"+
		"The FICA TAX deduction is : "+this.fica+"\n"+
				"The State TAX deduction is : "+this.state+"\n"+
				"The Local TAX deduction is : "+this.local+"\n"+
				"The Medicare deduction is : "+this.medicare+"\n"+
				"The Social Security deduction is : "+this.socialSecurity);
		System.out.print(sb.toString()+"\n\n");
	}
}
