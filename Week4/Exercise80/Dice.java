package test4;

import java.util.Random;

public class Dice {
	private Random random;
	private int numberOfSides;

	public Dice(int numberOfSides) {
		this.random = new Random();
		this.numberOfSides = numberOfSides;
	}

	public int roll() {
		return random.nextInt(this.numberOfSides)+1;
	}
}
