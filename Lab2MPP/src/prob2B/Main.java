package prob2B;

public class Main {
	public static void main(String args) {
		OrderLine orderLine1 = new OrderLine();
		OrderLine orderLine2 = new OrderLine();
		
		OrderLine[] orderColection = new OrderLine[] {orderLine1, orderLine2};
		
		Order order = new Order(orderColection);
		order.setOrderNum(1);
		
		orderLine1.setOrder(order);
	}
}
