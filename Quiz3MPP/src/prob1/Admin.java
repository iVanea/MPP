package prob1;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		//implement
		for(LibraryMember m : members) {
			List<CheckoutRecordEntry>entryList =m.getCheckoutRecord().getCheckoutRecordEntryList();
			for(CheckoutRecordEntry e : entryList) {
				if(item.equals(e.getLendingItem())) phoneNums.add(m.getPhone());
			}
		}
		
		Collections.sort(phoneNums);
		return phoneNums;
	}
}
