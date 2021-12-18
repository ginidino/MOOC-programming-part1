package test4;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	private Random random = new Random();
	
	public LotteryNumbers() {
		this.drawNumbers();
	}

	public ArrayList<Integer> numbers() {
		return this.numbers;
	}
	
	public void drawNumbers() {
		while (this.numbers.size() < 7) {
			int num = random.nextInt(39) + 1;
			boolean alreadyDrawn = this.containsNumber(num);
			if (!alreadyDrawn) {
				this.numbers.add(num);
			}
		}
	}
	
	public boolean containsNumber(int number) {
		if (this.numbers.contains(number)) {
			return true;
		} else 
			return false;
	}
}
