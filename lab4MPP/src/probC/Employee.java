package probC;

abstract class Employee {
	public String empId;
	private PayCheck payCheck;

	Employee(String id) {
		empId = id;
	}

	public PayCheck calcCompensation(int month, int year) {
		payCheck = new PayCheck(calcGrossPay(month, year));

		return payCheck;
	}

	public void print() {
		System.out.println("The Employee ID is : "+this.empId);
		//System.out.println("The Gross Salary is : "+calcGrossPay(month,year));
		//payCheck = new PayCheck(calcGrossPay(month, year));
		payCheck.print();
	}

	public abstract double calcGrossPay(int month, int year);

}
