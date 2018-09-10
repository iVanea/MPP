package march2018.prob1_.dataclasses;

import java.util.ArrayList;
import java.util.List;
import march2018.prob1_.*;

public class BookTestData {
	private static List<Publisher> publishers = new ArrayList<>();
	private static List<Book> list = new ArrayList<Book>();
	static {
		publishers.add(new Publisher("Pearson", "UK", 1, 9158000000.00));
		publishers.add(new Publisher("Reed Elsevier", "UK", 2, 5934000000.00));
		publishers.add(new Publisher("ThomsonReuters", "US", 3, 5386000000.00));
		publishers.add(new Publisher("Wolters Kluwer", "NL", 4, 4766000000.00));
		publishers.add(new Publisher("Random House", "Germany", 5, 3328000000.00));
		publishers.add(new Publisher("Hachette Livre", "France", 6, 2833000000.00));
		publishers.add(new Publisher("Grupo Planeta", "Spain", 7, 2597000000.00));
		publishers.add(new Publisher("McGraw-Hill Education", "US", 8, 2292000000.00));
		publishers.add(new Publisher("Holtzbrinck", "Germany", 9, 2220000000.00));
		publishers.add(new Publisher("Scholastic", "US", 10, 2148000000.00));
		publishers.add(new Publisher("Cengage", "US", 11, 1993000000.00));
		publishers.add(new Publisher("Wiley", "US", 12, 1783000000.00));
		publishers.add(new Publisher("Pearson", "US", 13, 2254000000.00));
		publishers.add(new Publisher("De Agostini Editore", "Italy", 14, 1724000000.00));
		publishers.add(new Publisher("Shueisha", "Japan", 15, 1464000000.00));
		
		list.add(new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", 2015, 34.89, publishers.get(1)));
		list.add(new Book("Programming: Computer Programming for Beginners: Learn the Basics of Java, SQL & C++",
				"IT Starter Series and Joseph Connor", 2015, 19.27, publishers.get(2)));
		list.add(new Book("Learn JavaScript VISUALLY with Interactive Exercises", "Ivelin Demirov", 2014, 35.95,
				publishers.get(3)));
		list.add(new Book("Programming Language Pragmatics", "Michael L. Scott", 2015, 70.16, publishers.get(4)));
		list.add(new Book("C Programming Language", "Brian W. Kernighan", 1988, 40.49, publishers.get(5)));
		list.add(new Book("The Go Programming Language", "Brian W. Kernighan", 2015, 17.27, publishers.get(12)));
		list.add(new Book("Concepts of Programming Languages", "Robert W. Sebesta", 2015, 155.47, publishers.get(7)));
		list.add(new Book("C#: Programming Basics for Absolute Beginners", "Nathan Clark", 2017, 16.36,
				publishers.get(8)));
		list.add(new Book("Getting started with Java programming language", "Ashish Sarin", 2017, 7.99,
				publishers.get(9)));
		list.add(new Book("Programming Languages", "Robert Noonan", 2006, 49.95, publishers.get(12)));
		list.add(new Book("Programming: Principles and Practice Using C++", "Bjarne Stroustrup", 2014, 60.50,
				publishers.get(10)));
		list.add(new Book("Hacking with Python", "Steve Tale", 2017, 17.99, publishers.get(11)));
		list.add(new Book("HTML and CSS: Design and Build Websites", "Jon Duckett", 2011, 23.68, publishers.get(12)));
		list.add(new Book("Web Design with HTML, CSS, JavaScript and jQuery Set", "Jon Duckett", 2014, 46.40,
				publishers.get(12)));
		list.add(new Book("JavaScript and JQuery: Interactive Front-End Web Development", "Jon Duckett", 2014, 23.07,
				publishers.get(13)));
		list.add(new Book("The Joy of PHP", "Alan Forbes", 2015, 18.95, publishers.get(0)));
		list.add(new Book("The Road to learn React", " Robin Wieruch", 2017, 15.47, publishers.get(1)));
		list.add(new Book("Head First Design Patterns", "Bert Bates", 2004, 36.42, publishers.get(13)));
		list.add(new Book("Programming Collective Intelligence", "Toby Segaran", 2007, 18.98, publishers.get(12)));
		list.add(new Book("Two Scoops of Django 1.11: Best Practices for the Django Web Framework",
				"Audrey Roy Greenfeld", 2017, 41.56, publishers.get(12)));
	}

	public static List<Book> getList() {
		return list;
	}

}
