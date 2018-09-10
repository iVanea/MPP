package prob1;

import java.util.List;
import java.util.ArrayList;


public class CheckoutRecord {
	private List<CheckoutRecordEntry> recordEntryList= new ArrayList<>();
	
	public List<CheckoutRecordEntry> getCheckoutRecordEntryList(){
		return recordEntryList;
	}
	
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		this.recordEntryList.add(entry);
	}
}
