package test6;

public class Exercise94 {
	public static void main(String[] args) {
	    Person pekka = new Person("Pekka Mikkola", "010-1234-1234");

	    System.out.println(pekka.getName());
	    System.out.println(pekka.getNumber());

	    System.out.println(pekka);
	    pekka.changeNumber("010-5678-5678");
	    System.out.println(pekka);
	    System.out.println();
	    
	    Phonebook phonebook = new Phonebook();

	    phonebook.add("Pekka Mikkola", "010-1234-1234");
	    phonebook.add("Edsger Dijkstra", "010-1235-1235");
	    phonebook.add("Donald Knuth", "010-6789-6789");

	    phonebook.printAll();
	    System.out.println();
	    
	    String number = phonebook.searchNumber("Pekka Mikkola");
	    System.out.println(number);

	    number = phonebook.searchNumber("Martti Tienari");
	    System.out.println(number);
	}
}
