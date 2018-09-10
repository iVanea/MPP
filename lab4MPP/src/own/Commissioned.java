package own;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
private double commission;
private double baseSalary;
private List<Order> orders;

public double getCommission() {
	return commission;
}
public void setCommission(double commission) {
	this.commission = commission;
}
public double getBaseSalary() {
	return baseSalary;
}
public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}


public Commissioned(String empId, double commission, double baseSalary) {
	super(empId);
	this.commission = commission;
	this.baseSalary = baseSalary;
	orders = new ArrayList<>();
}

@Override
public double calcGrossPay(int mount, int year) {
	
	return 0 ;
}
}
