package own;

import java.time.LocalDate;

public class Order {
private int orderNo;
private LocalDate orderDate;
private int orderAmount;

public int getOrderNo() {
	return orderNo;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public int getOrderAmount() {
	return orderAmount;
}


public Order(int orderNo, int orderAmount, int year, int month, int day) {
	this.orderNo = orderNo;
	this.orderDate =  LocalDate.of(year, month, day);
	this.orderAmount = orderAmount;
}



}
