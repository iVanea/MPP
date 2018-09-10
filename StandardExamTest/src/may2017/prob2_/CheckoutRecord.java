package may2017.prob2_;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	public List<CheckoutRecordEntry> checkoutEntryList = new ArrayList<>();

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return checkoutEntryList;
	}

	public void addCheckoutEntry(CheckoutRecordEntry checkoutEntry) {
		this.checkoutEntryList.add(checkoutEntry);
	}

	
}
