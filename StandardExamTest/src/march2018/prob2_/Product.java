package march2018.prob2_;

public class Product {
	
	private int productId;
	private String productName;
	private String category;
	private double price;
	
	
	
	public Product(int productId, String productName, String category, double price) {
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
	}



	public int getProductId() {
		return productId;
	}



	public String getProductName() {
		return productName;
	}



	public String getCategory() {
		return category;
	}



	public double getPrice() {
		return price;
	}



	@Override
	public String toString() {
		//uncomment when you're ready
		return "[productId=" + productId + ", productName=" + productName + "]";
//		return null;
	}



//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((category == null) ? 0 : category.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(price);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + productId;
//		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
//		return result;
//	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}

}