package test6;

public class Book {
	private String title;
	private String pulisher;
	private int year;

	public Book(String title, String publisher, int year) {
		this.title = title;
		this.pulisher = publisher;
		this.year = year;
	}

	public String title() {
		return title;
	}

	public String publisher() {
		return pulisher;
	}

	public int year() {
		return year;
	}

	public String toString() {
		return this.title + ", " + this.pulisher + ", " + this.year;
	}
}
