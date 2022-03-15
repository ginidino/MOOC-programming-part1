package WEEK5;

// Exercise 93: Person extended
public class Exercise93 {
	public static void main(String[] args) {
		// Exercise 93.1: Calculating the age based on the birthday
		Person2 paul = new Person2("Paul", 15, 2, 1993);
		Person2 steve = new Person2("Steve", 1, 3, 1955);
		// Exercise 93.2: Comparing ages based on birthdate
        Person2 martin = new Person2("Martin", 1, 3, 1983);
        Person2 thomas = new Person2("Thomas", 15, 2, 1983);
        // Exercise 93.3: New constructors
     	Person2 pekka = new Person2("Pekka", new MyDate(15, 2, 1983));
     	Person2 luca = new Person2("Luca");
        
        // Exercise 93.1: Calculating the age based on the birthday
        System.out.println(steve.getName() + " age " + steve.age() + " years");
        System.out.println(pekka.getName() + " age " + paul.age() + " years");
        System.out.println();
        
        // Exercise 93.2: Comparing ages based on birthdate
        System.out.println(martin.getName() + " is older than " +  thomas.getName() + ": "+ martin.olderThan(thomas));
        System.out.println(pekka.getName() + " is older than " +  martin.getName() + ": "+ thomas.olderThan(martin));
        System.out.println();
        
        // Exercise 93.3: New constructors
        System.out.println(pekka);
        System.out.println(luca);
	}
}
