package WEEK4;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
	private ArrayList<Integer> numbers;
	private Random random;
	
	public LotteryNumbers() {
		random = new Random();
		// We'll format a list for the numbers
		this.numbers = new ArrayList<Integer>();
		// Draw numbers as LotteryNumbers is created
		this.drawNumbers();
	}

	public ArrayList<Integer> numbers() {
		return this.numbers;
	}
	
	public void drawNumbers() {
		// Write the number drawing here using the method containsNumber()
		while(this.numbers.size() < 7) {
			int num = random.nextInt(39) + 1;
			boolean alreadyDrawn = this.containsNumber(num);
			if(!alreadyDrawn) {
				this.numbers.add(num);
			}
		}	
	}
	
	public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
		if(this.numbers.contains(number)) {
			return true;
		} else {
			return false;
		}
    }
}
