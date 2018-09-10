package own;

public abstract class Employee {
	public String empId;
//	private PayCheck paycheck;
	
	public Employee(String empId) {
		setEmpId(empId);
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public void print() {
		
	}
	
//	public PayCheck calcCompensation(int month, int year) {}
	
	public abstract double calcGrossPay(int month, int year);
}
