package WEEK5;

// Exercise 85: Reformatory
// Exercise 85.1: Weight of a person
public class Exercise851 {
	public static void main(String[] args) {
		Reformatory eastHelsinkiReformatory = new Reformatory();

	    Person brian = new Person("Brian", 1, 110, 7);
	    Person pekka = new Person("Pekka", 33, 176, 85);

	    System.out.println(brian.getName() + " weight: " + eastHelsinkiReformatory.weight(brian) + " kilos");
	    System.out.println(pekka.getName() + " weight: " + eastHelsinkiReformatory.weight(pekka) + " kilos");
	}
}
