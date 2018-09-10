package march2018.prob1_;

public class Book {

	private String title;

	private String author;

	private int year;

	private double cost;
	
	private Publisher publisher;

	public Book(String title, String author, int year, double cost, Publisher publisher) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.cost = cost;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public double getCost() {
		return cost;
	}

}
