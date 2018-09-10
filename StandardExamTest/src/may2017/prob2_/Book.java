package may2017.prob2_;

public class Book extends LendingItem {
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;

	public Book(String isbn, String title, String authorFirstName, String authorLastName) {
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (!o.getClass().equals(this.getClass()))
			return false;
		Book book = (Book) o;
		boolean result = this.isbn.equals(book.isbn) && this.title.equals(book.title)
				&& this.authorFirstName.equals(book.authorFirstName) && this.authorLastName.equals(book.authorLastName);
		return result;

	}
}
