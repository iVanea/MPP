package march2018.prob2_;

import java.time.LocalDate;
import java.util.List;

public class Order {

	private int orderId;
	private List<OrderItem> items; 
	private LocalDate orderDate;
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	private Payment payment;
	
	public Order(int orderId, List<OrderItem> items, LocalDate orderDate) {
		this.orderId = orderId;
		this.items = items;
		this.orderDate = orderDate;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public Payment getPayment() {
		return payment;
	}

	public double getTotalPrice(){
		double price = 0.0;
		
		if(items != null){
			for(OrderItem item : items){
				if(item != null){
					price = price + item.getTotalPrice();
				}
			}
		}
		return price;
	}
	
}
