package prob4;

import java.util.ArrayList;
import java.util.List;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;

		for(Property p:properties) {
			totalRent+=p.computeRent();
		}
		
		
		return totalRent;
	}
	
	public static void listAllProperties (Property[] properties, String city){
		List<Property> myProperties = new ArrayList<>();
		
		for(Property p: properties) {
			if(p.getAddress().getCity().compareTo(city) == 0){
				myProperties.add(p);
				//System.out.println(p.getAddress().getCity() + p.getAddress().getState());
				
			}
		}
		
		for(Property p: myProperties) {
			System.out.println(p.getClass().getSimpleName()+" " + "in "+ p.getAddress().getCity());
		}
	
	}
	
	
}
