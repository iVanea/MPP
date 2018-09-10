package probC;

public class Hourly extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;
	private static final int WEEK_NUMBER = 4;
	
	
	Hourly(String id, double hourlyWage, double hoursPerWeek){
		super(id);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	public double getHourlyWage() {
		return this.hourlyWage;
	}
	public double getHoursPerWeek() {
		return this.hoursPerWeek;
	}
	
	public double calcGrossPay(int month, int year) {
		double grossPay = WEEK_NUMBER*hourlyWage*hoursPerWeek;
		return grossPay;
	}
//	public PayCheck calcCompensation(int month, int year) {
//		payCheck = new PayCheck(this, month, year);
//		
//		return payCheck;
//	}
	

}
