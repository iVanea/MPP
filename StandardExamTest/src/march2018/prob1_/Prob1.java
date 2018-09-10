package march2018.prob1_;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import march2018.prob1_.dataclasses.BookTestData;


public class Prob1 {
	
	//Return a string of the distinct names of those publishers 
	//that published books in the year 2015
	//and that were located in either the UK or the US (use
	//strings "UK" and "US" in your tests). Your returned string
	//must present the publisher names in (ascending) sorted order
	//and publisher names are separated by ", ".
	public static String findPublishers(List<Book> books){
		System.out.println(books.stream().filter(book->(book.getYear()==2015))
				.map(book->book.getPublisher())
				.filter(publishier->"UK".equals(publishier.getCountry()) || "US".equals(publishier.getCountry()))
				.sorted(Comparator.comparing(Publisher::getName))
				.map(book->book.getName())
				.distinct().collect(Collectors.joining(", ")));
		return  books.stream()
				.filter(book -> book.getYear() == 2015)
				.map(book -> book.getPublisher())		
				.filter(pub -> "UK".equals(pub.getCountry()) || "US".equals(pub.getCountry()))
				.sorted(Comparator.comparing(Publisher::getName))
				.map(pub -> pub.getName())
				.distinct()
				.collect(Collectors.joining(", "));
	}
	
	
	//Return the total cost of books that were written by an author
	//whose name contains letter "o" and that were  published by "De Agostini Editore"
	public static double getTotalCost(List<Book> books){
		System.out.println(books.stream().filter(book->book.getAuthor().contains("o") 
				&& "De Agostini Editore".equals(book.getPublisher().getName()))
				.mapToDouble(book->book.getCost()).sum()
				);
		return books.stream()
				.filter(book -> book.getAuthor().contains("o") && "De Agostini Editore".equals(book.getPublisher().getName()))
				.map(book -> book.getCost())
				.filter(d -> Objects.nonNull(d))
				.reduce((x,y) -> x + y).orElse(0.0);

	}


	public static void main(String[] args) {
		testFindPublishers();
		testGetTotalCost();
	}

	// Expected output: 
	// McGraw-Hill Education, Pearson, Reed Elsevier, ThomsonReuters
	// McGraw-Hill Education, Pearson, Reed Elsevier, ThomsonReuters
	public static void testFindPublishers() {
		List<Book> books = BookTestData.getList();
		System.out.println(findPublishers(books));
	}

	// Expected output: 180.57
	// 23.07 
	public static void testGetTotalCost() {
		List<Book> books = BookTestData.getList();
		System.out.println(getTotalCost(books));
	}
}

/* books.stream()
.filter(book -> book.getYear() == 2015)
.map(book -> book.getPublisher())		
.filter(pub -> "UK".equals(pub.getCountry()) || "US".equals(pub.getCountry()))
.sorted(Comparator.comparing(Publisher::getName))
.map(pub -> pub.getName())
.distinct()
.collect(Collectors.joining(", "));*/


/*books.stream()
.filter(book -> book.getAuthor().contains("o") && "De Agostini Editore".equals(book.getPublisher().getName()))
.map(book -> book.getCost())
.filter(d -> Objects.nonNull(d))
.reduce((x,y) -> x + y).orElse(0.0);
*/