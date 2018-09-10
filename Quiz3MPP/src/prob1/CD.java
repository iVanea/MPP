package prob1;

public class CD extends LendingItem{
	private String productId;
	private String title;
	private String company;
	
	
	public CD(String productId, String title, String company) {
		this.productId = productId;
		this.title = title;
		this.company =company;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	} 
	
	@Override
	public boolean equals(Object ob) {
		if(ob==null) return false;
		if(!(this.getClass().equals(ob.getClass()))) return false;
		CD b = (CD) ob;
		return (this.productId.equals(b.productId) && this.title.equals(b.title) && this.company.equals(b.company));
	}
	
}
