package may2017.prob2_;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	private LocalDate checkoutDate;
	private LocalDate dueDate;
	public ItemType itemType;
	public LendingItem lendingItem;
	
	
	
	public CheckoutRecordEntry(LendingItem lendingItem, LocalDate checkoutDate, LocalDate dueDate, ItemType itemType) {
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.itemType = itemType;
		this.lendingItem = lendingItem;
	}
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public ItemType getItemType() {
		return itemType;
	}
	public LendingItem getLendingItem() {
		return lendingItem;
	}
	
}
