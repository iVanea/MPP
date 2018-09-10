package prob4;

public class Driver {

	public static void main(String[] args) {

		//Property[] objects = { new House(9000), new Condo(2), new Trailer() };
		Address ad1 = new Address("Iowa", "Fairfield");
		Address ad2 = new Address("Illinois", "Chicago");
		Address ad3 = new Address("Masachusets", "Boston");
		
		
		House house = new House(9000);
		house.setAddress(ad1);
		Condo condo = new Condo(2);
		condo.setAddress(ad2);
		Trailer trailer = new Trailer();
		trailer.setAddress(ad3);
		House house2 = new House(9000);
		house2.setAddress(ad2);
		
		
		Property[] properties = {house, condo, trailer, house2};
		
		double totalRent = Admin.computeTotalRent(properties);
		Admin.listAllProperties(properties, "Chicago");
		System.out.println(totalRent);
	}
}
