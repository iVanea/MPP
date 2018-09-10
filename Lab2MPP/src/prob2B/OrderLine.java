package prob2B;

public class OrderLine {
	Order order;
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderLine() {

	}
	
	public OrderLine(Order order) {
		setOrder(order);
	}
}
