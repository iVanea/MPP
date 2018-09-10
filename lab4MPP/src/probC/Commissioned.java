package probC;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee{
	private double commission;
	private double baseSalary;
	private List<Order> order;
	
	Commissioned(String id, double commission, double sal){
		super(id);
		this.commission = commission;
		this.baseSalary = sal;
		order = new ArrayList<>();
	}
	public void addOrder(Order ord) {
		order.add(ord);
	}
	
	
	public double calcGrossPay(int month, int year) {
		int totalValOfOrder =0;
		if(order!=null) {
			for(Order or : order) {
				
				if(month==1 && or.getOrderDate().getMonthValue()==12 && (year-or.getOrderDate().getYear()==1)) {
					totalValOfOrder +=or.getOrderAmount();
				}
				else if(or.getOrderDate().getMonthValue()==month-01) {
					totalValOfOrder +=or.getOrderAmount();
				}
			}
		}
		double grossSal = this.baseSalary +(this.commission*totalValOfOrder);
		
		return grossSal;
	}

}
