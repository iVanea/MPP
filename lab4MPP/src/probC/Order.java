package probC;

import java.time.LocalDate;

public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private int orderAmount;
	
	Order(String orderNo, int amount, int year, int month, int day){
		this.orderNo = orderNo;
		this.orderAmount = amount;
		this.orderDate =  LocalDate.of(year, month, day);
	}

	public String getOrderNo() {
		return orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	
	

}
