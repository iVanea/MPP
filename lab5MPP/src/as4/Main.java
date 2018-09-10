package as4;
import java.util.*;

import as4.otherpackage.*;
import as4.personbirth.*;

public class Main {

	public static void main(String[] args) {
		//two setters
		printPersonBirthInfo();
		
		
			
		
	}
	public static void printPersonBirthInfo() {
		Collection<DataRecord> data = Database.h.values();
		List<BirthInfo> birthInfo = new ArrayList<>();
		for(DataRecord d : data) {
			PersonBirthInfo sr 
			  = PersonBirthInfoFactory.CreateInstance(d.getName(), d.getBirthdate());
			birthInfo.add(sr.getBirthInfo());	
			//System.out.println(birthInfo);
			
		}
		Iterator<BirthInfo> it = birthInfo.iterator();
		System.out.println("A Person:");
		BirthInfo next = null;
		while(it.hasNext() ) {
			System.out.print(it.next().getPerson().getName()+ " ");
		}
	}
}
