package WEEK5;

public class Reformatory {
	private int weightsMeasured;
	
	public Reformatory() {
		this.weightsMeasured = 0;
	}
	// Exercise 85.1: Weight of a person
	public int weight(Person person) {
		// returns the weight of the parameter
		this.weightsMeasured++;
		return person.getWeight();
	}
	// Exercise 85.2: Feeding a person
	public void feed(Person person) {
		person.setWeight(person.getWeight() + 1);
	}
	// Exercise 85.3: Number of times a weight has been measured
	public int totalWeightsMeasured() {
		return weightsMeasured;
	}
}
