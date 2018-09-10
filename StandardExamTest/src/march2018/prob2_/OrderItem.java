package march2018.prob2_;

public class OrderItem {
	
	private int quantity;
	private Product product;
	
	public OrderItem(Product product, int quantity) {
		this.quantity = quantity;
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public double getTotalPrice(){
		double price = 0.0;
		
		if(product != null){
			price = product.getPrice() * quantity;
		}
		return price;
	}
	
}
