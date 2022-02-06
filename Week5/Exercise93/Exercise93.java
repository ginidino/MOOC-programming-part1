package test5;

public class Exercise93 {
	public static void main(String[] args) {
		Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
		Person steve = new Person("Steve");
        Person martin = new Person("Martin", 1, 3, 1983);
        Person thomas = new Person("Thomas", 1, 3, 1955);

        System.out.println(thomas.getName() + " age " + thomas.age() + " years");
        System.out.println(pekka.getName() + " age " + pekka.age() + " years");
        System.out.println(martin.getName() + " age " + martin.age() + "years");
        System.out.println();
        System.out.println(martin.getName() + " is older than " +  pekka.getName() + ": "+ martin.olderThan(pekka));
        System.out.println(pekka.getName() + " is older than " +  martin.getName() + ": "+ pekka.olderThan(martin));
        System.out.println();
        System.out.println(pekka);
        System.out.println(steve);
	}
}