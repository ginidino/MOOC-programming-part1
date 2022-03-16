package WEEK6;

// Exercise 94: PhoneBook
public class Exercise094 {
	public static void main(String[] args) {
	    Person pekka = new Person("Pekka Mikkola", "010-1234-1234");
	    // Exercise 94.1: Person
	    System.out.println(pekka.getName());
	    System.out.println(pekka.getNumber());

	    System.out.println(pekka);
	    pekka.changeNumber("010-2345-2345");
	    System.out.println(pekka);
	    System.out.println();
	    
	    // Exercise 94.2: Adding persons to Phonebook
	    Phonebook phonebook = new Phonebook();
	    
	    phonebook.add("Pekka Mikkola", "010-1234-1234");
	    phonebook.add("Edsger Dijkstra", "010-1235-1235");
	    phonebook.add("Donald Knuth", "010-6789-6789");

	    phonebook.printAll();
	    System.out.println();
	    
	    // Exercise 94.3: Searching for numbers from the phonebooks
	    String number = phonebook.searchNumber("Pekka Mikkola");
	    System.out.println(number);

	    number = phonebook.searchNumber("Martti Tienari");
	    System.out.println(number);
	}
}
