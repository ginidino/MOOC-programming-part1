package test6;

import java.util.ArrayList;

public class Exercise101 {
	public static void main(String[] args) {
		Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
		System.out.println(cheese.title());
		System.out.println(cheese.publisher());
		System.out.println(cheese.year());

		System.out.println(cheese);
		System.out.println();
		
		Library Library = new Library();
		Library.addBook(cheese);
		
		Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
		Library.addBook(nhl);

		Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

		Library.printBooks();
		System.out.println();
		
		Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
		Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
		Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
		Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

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
	}
}
