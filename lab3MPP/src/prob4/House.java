package prob4;

public class House extends Property{
	private static final double RATE = 0.1;
	private double lotSize;
	Address address;

	public House(double lotSize) {
		super();
		this.lotSize = lotSize;
	}

	public Address getAddress() {
		return  address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public double computeRent() {
		return RATE*lotSize;
	}


}
