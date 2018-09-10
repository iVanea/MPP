package prob1;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private ItemType lendingItemType;
	private LendingItem lendingItem;
	
	public CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type ) {
		this.checkoutDate = chDate;
		this.dueDate = dueDate;
		this.lendingItem = item;
		this.lendingItemType = type;
	}
	
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public ItemType getLendingItemType() {
		return lendingItemType;
	}
	public LendingItem getLendingItem() {
		return lendingItem;
	}
	
	
	
	
	
}
