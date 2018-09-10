package prob1;

public class Book extends LendingItem{
	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	
	public Book(String isbn, String title, String fName, String lName) {
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = fName;
		this.authorLastName = lName;
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
	public boolean equals(Object ob) {
		if(ob==null) return false;
		if(!(this.getClass().equals(ob.getClass()))) return false;
		Book b = (Book) ob;
		return (this.isbn.equals(b.isbn) && this.title.equals(b.title) && this.authorFirstName.equals(b.authorFirstName) && this.authorLastName.equals(b.authorLastName));
	}
}
