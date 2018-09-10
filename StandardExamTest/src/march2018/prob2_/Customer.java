package march2018.prob2_;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private int id;
	private String name;
	
	private List<Order> orders;
	private List<Payment> payments;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.orders = new ArrayList<Order>();
	}
	
	public void addPayment(Payment payment){
		
		if(payments == null){
			payments = new ArrayList<Payment>();
		}
		
		if(payment != null){
			payments.add(payment);
		}
		
	}

	public void addOrder(Order order){
		if(order != null){
			orders.add(order);
		}
	}

	public List<Order> getOrders() {
		return orders;
	}
	
	
}
