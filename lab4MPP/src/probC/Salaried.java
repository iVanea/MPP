package probC;

public class Salaried extends Employee{
	private double salary;
	
	Salaried(String id,double sal){
		super(id);
		this.salary = sal;
	}
	
	public double calcGrossPay(int month, int year) {
		return salary;
	}

}
