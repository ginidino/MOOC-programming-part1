package WEEK6;

import java.util.ArrayList;

// Exercise 101: The library information system
public class Exercise101 {
	public static void main(String[] args) {
		// Exercise 101.1: Book
		Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
		System.out.println(cheese.title());
		System.out.println(cheese.publisher());
		System.out.println(cheese.year());

		System.out.println(cheese);
		System.out.println();
		
		// Exercise 101.2: Library
		Library Library = new Library();

		Book cheeses = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
		Library.addBook(cheeses);

		Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
		Library.addBook(nhl);

		Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

		Library.printBooks();
		System.out.println();
		
		// Exercise 101.3: Search functionality
		//Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
		Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
		Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
		//Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

		ArrayList<Book> result = Library.searchByTitle("Cheese");
		for (Book book: result) {
		    System.out.println(book);
		}

		System.out.println("---");
		for (Book book: Library.searchByPublisher("Penguin Group  ")) {
		    System.out.println(book);
		}

		System.out.println("---");
		for (Book book: Library.searchByYear(1851)) {
		    System.out.println(book);
		}
		System.out.println();
		
		// Exercise 101.4: Improved search
		for (Book book: Library.searchByTitle("CHEESE")) {
		    System.out.println(book);
		}

		System.out.println("---");
		for (Book book: Library.searchByPublisher("PENGUIN  ")) {
		    System.out.println(book);
		}
	}
}
