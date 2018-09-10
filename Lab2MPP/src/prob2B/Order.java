package prob2B;

public class Order {
	private Integer orderNum;
	private OrderLine[] orderLine;
	
	public Order() {
	}
	
	public Order(OrderLine[] orderLine) {
		setOrderLine(orderLine);
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public OrderLine[] getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(OrderLine[] orderLine) {
		this.orderLine = orderLine;
	}

}
