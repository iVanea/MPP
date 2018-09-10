package may2017.prob2_;

import java.util.*;


public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		//implement
//		System.out.println(Stream.of(members).reduce((x)->x.ge).map(x->x.getPhone())
				
//						);
		
		for(LibraryMember libMember : members) {
			List<CheckoutRecordEntry> entryList =libMember.getCheckoutRecord().getCheckoutEntryList();
			for(CheckoutRecordEntry checkoutRecordEntry : entryList) {
				if (item.equals(checkoutRecordEntry.getLendingItem())) {
					phoneNums.add(libMember.getPhone());
				}
			}
		}
		
		Collections.sort(phoneNums);
		
		return phoneNums;
	}
}
