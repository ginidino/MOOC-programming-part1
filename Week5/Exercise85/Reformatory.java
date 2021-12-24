package test5;

public class Reformatory {
	private int weightsMeasured;
	
	public Reformatory() {
		this.weightsMeasured = 0;
	}

	public int weight(Person person) {
		this.weightsMeasured++;
		return person.getWeight();
	}

	public void feed(Person person) {
		int weightEating = person.getWeight();
		person.setWeight(weightEating + 1);
	}

	public int totalWeightsMeasured() {
		return weightsMeasured;
	}
}