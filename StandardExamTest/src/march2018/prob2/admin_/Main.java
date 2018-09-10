package march2018.prob2.admin_;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import march2018.prob2_.Customer;
import march2018.prob2_.Order;
import march2018.prob2_.OrderItem;
import march2018.prob2_.Payment;
import march2018.prob2_.PaymentType;
import march2018.prob2_.Product;

public class Main {

	public static void main(String[] args) {
		
		//Uncomment below when you're ready for testing
		
		
		Product p1 = new Product(1, "Extra Fancy Unsalted Mixed Nuts", "Snack", 21.49);
		Product p2 = new Product(2, "Pecan Halves", "Snack", 18.59);
		Product p3 = new Product(3, "Donsuemor Traditional Madeleines", "Snack", 7.98);
		Product p4 = new Product(4, "Bakery Fig Bar", "Snack", 12.99);
		Product p5 = new Product(5, "Sun-Maid California Organic Raisins", "Snack", 12.24);

		Product p6 = new Product(6, "Organic 2% Chocolate Milk", "Breakfast", 18.99);
		Product p7 = new Product(7, "Butter Croissants", "Breakfast", 7.01);
		Product p8 = new Product(8, "Dave's Killer Bread, 21 Whole Grains and Seeds", "Breakfast", 8.02);
		Product p9 = new Product(9, "Quaker Flavor Variety Instant Oatmeal", "Breakfast", 11.29);
		Product p10 = new Product(10, "Nature Valley Crunchy Granola Bars, Oats 'n Honey", "Breakfast", 14.79);

		Product p11 = new Product(11, "Starbucks VIA Instant Coffee Single Serve Packets, Colombia", "Coffee", 16.59);
		Product p12 = new Product(12, "Medium Roast Whole Bean Coffee, House Blend",
				"Coffee", 11.99);
		Product p13 = new Product(13, "Decaffeinated Coffee, Dark Roast", "Coffee", 11.99);
		Product p14 = new Product(14, "French Roast Dark Whole Bean 2.5-Pounds", "Coffee", 20.99);
		Product p15 = new Product(15, "Taster's Choice Freeze Dried Coffee", "Coffee", 13.59);

		OrderItem oi1 = new OrderItem(p1, 1);
		OrderItem oi2 = new OrderItem(p2, 2);
		OrderItem oi3 = new OrderItem(p3, 3);
		OrderItem oi4 = new OrderItem(p4, 2);
		OrderItem oi5 = new OrderItem(p5, 1);
		OrderItem oi6 = new OrderItem(p6, 7);
		OrderItem oi7 = new OrderItem(p7, 2);
		OrderItem oi8 = new OrderItem(p8, 5);
		OrderItem oi9 = new OrderItem(p9, 4);
		OrderItem oi10 = new OrderItem(p10, 1);
		OrderItem oi11 = new OrderItem(p11, 1);
		OrderItem oi12 = new OrderItem(p12, 3);
		OrderItem oi13 = new OrderItem(p13, 6);
		OrderItem oi14 = new OrderItem(p14, 2);
		OrderItem oi15 = new OrderItem(p15, 3);

		Order o1 = new Order(1, Arrays.asList(oi15, oi7, oi8), LocalDate.of(2018, 1, 2));
		Order o2 = new Order(2, Arrays.asList(oi4, oi3, oi6, oi9), LocalDate.of(2018, 2, 1));
		Order o3 = new Order(3, Arrays.asList(oi11, oi15, oi3, oi4), LocalDate.of(2018, 2, 3));
		Order o4 = new Order(4, Arrays.asList(oi13, oi12, oi1, oi5, oi14), LocalDate.of(2018, 2, 12));
		Order o5 = new Order(5, Arrays.asList(oi12, oi3, oi15, oi4, oi6), LocalDate.of(2018, 2, 18));
		Order o6 = new Order(6, Arrays.asList(oi3, oi7, oi9, oi10, oi14), LocalDate.of(2018, 2, 22));
		Order o7 = new Order(7, Arrays.asList(oi1, oi10, oi15, oi5, oi8), LocalDate.of(2018, 2, 23));
		Order o8 = new Order(8, Arrays.asList(oi5, oi4, oi10, oi7, oi8), LocalDate.of(2018, 2, 25));
		Order o9 = new Order(9, Arrays.asList(oi1, oi7, oi4, oi9), LocalDate.of(2018, 2, 27));
		Order o10 = new Order(10, Arrays.asList(oi9, oi12, oi11, oi13), LocalDate.of(2018, 3, 4));

		Customer c1 = new Customer(1, "Amelia");
		Payment pm1 = new Payment(1, "4140123456780001", PaymentType.CREDIT);
		Payment pm2 = new Payment(2, "5150123456780001", PaymentType.DEBIT);
		c1.addPayment(pm1);
		c1.addPayment(pm2);

		o1.setPayment(pm1);
		c1.addOrder(o1);

		o3.setPayment(pm1);
		c1.addOrder(o3);

		o4.setPayment(pm2);
		c1.addOrder(o4);

		Customer c2 = new Customer(2, "Olivia");
		Payment pm3 = new Payment(3, "4140123456780002", PaymentType.CREDIT);
		c2.addPayment(pm3);

		o9.setPayment(pm3);
		c2.addOrder(o9);
		o2.setPayment(pm3);
		c2.addOrder(o2);

		Customer c3 = new Customer(3, "Emily");
		Payment pm4 = new Payment(4, "5150123456780003", PaymentType.DEBIT);
		c3.addPayment(pm4);

		o5.setPayment(pm4);
		c3.addOrder(o5);

		o8.setPayment(pm4);
		c3.addOrder(o8);

		Customer c4 = new Customer(4, "Ella");
		Payment pm5 = new Payment(5, "4140123456780004", PaymentType.CREDIT);
		Payment pm6 = new Payment(6, "5150123456780004", PaymentType.DEBIT);
		c4.addPayment(pm5);
		c4.addPayment(pm6);

		o6.setPayment(pm5);
		c4.addOrder(o6);

		o7.setPayment(pm6);
		c4.addOrder(o7);

		Customer c5 = new Customer(5, "Chloe");
		Payment pm7 = new Payment(7, "4140123456780005", PaymentType.CREDIT);
		Payment pm8 = new Payment(8, "5150123456780005", PaymentType.DEBIT);
		c5.addPayment(pm7);
		c5.addPayment(pm8);

		o10.setPayment(pm7);
		c5.addOrder(o10);

		List<Customer> custs = Arrays.asList(c1, c2, c3, c4, c5);
		List<Product> products = getProductsByPaymentTypeAndCategory(custs);
		System.out.println(products);
	}

	// Return a list of distinct products which is in "Snack" and purchased by
	// using CREDIT.
	// expected output: 
	// [[productId=3, productName=Donsuemor Traditional Madeleines], [productId=4, productName=Bakery Fig Bar], [productId=1, productName=Extra Fancy Unsalted Mixed Nuts]]
	// [[productId=3, productName=Donsuemor Traditional Madeleines], [productId=4, productName=Bakery Fig Bar], [productId=1, productName=Extra Fancy Unsalted Mixed Nuts]]
	public static List<Product> getProductsByPaymentTypeAndCategory(List<Customer> custs) {
		
		//implement
		
//		System.out.println(custs.stream().filter(customer->customer.getOrders().));
		
		return null;
//		return null;
	}

}


/*custs.stream().flatMap(cust -> cust.getOrders().stream())
.filter(order -> order.getPayment().getType() == PaymentType.CREDIT)
.flatMap(order -> order.getItems().stream())
.map(item -> item.getProduct())
.filter(product -> "Snack".equals(product.getCategory()))
.distinct()
.collect(Collectors.toList())
;
*/