package may2017.prob2_;

public class CD extends LendingItem {
	private String productId;
	private String title;
	private String company;
	public CD(String productId, String title, String company) {
		this.productId = productId;
		this.title = title;
		this.company = company;
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
	public boolean equals(Object o) {
		if(o==null) return false;
		if (!o.getClass().equals(this.getClass())) return false;
		CD cd = (CD)o;
		boolean result = this.company.equals(cd.company) && this.productId.equals(cd.productId) && this.title.equals(cd.title);
		return result;
		
	}
}
