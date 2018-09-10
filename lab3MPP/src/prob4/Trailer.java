package prob4;

public class Trailer extends Property{
	private Address address;
	private static final double RENT = 500;
	
	public Trailer() {
		
	}
	public Trailer(Address address) {
		this.address = address;
	}
	
	public double computeRent() {
		return RENT;
	}
	
	public Address getAddress() {
		return  address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}


}
