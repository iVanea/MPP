package prob4;

public class Condo extends Property{
	
	private static final double RATE = 400;
	private int numOfFloors;
	Address address;
	
	public Condo(int numOfFloors) {
		this.numOfFloors = numOfFloors;
				
	}
	
	public int getNumOfFloors() {
		return numOfFloors;
	}

	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = numOfFloors;
	}
	
	public double computeRent() {
		return RATE*numOfFloors;
	}
	
	public Address getAddress() {
		return  address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


}
