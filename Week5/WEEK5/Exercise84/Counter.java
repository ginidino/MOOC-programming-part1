package WEEK5;

public class Counter {
	private int startingValue;
	private boolean check;
	
	// Exercise 84.1: Multiple constructors
	public Counter(int startingValue, boolean check) {
		this.startingValue = startingValue;
		this.check = check;
	}
	// Exercise 84.1: Multiple constructors
	public Counter(int startingValue) {
		this.startingValue = startingValue;
		this.check = false;
	}
	// Exercise 84.1: Multiple constructors
	public Counter(boolean check) {
		this.check = check;
		this.startingValue = 0;
	}
	// Exercise 84.1: Multiple constructors
	public Counter() {
		this.startingValue = 0;
		this.check = false;
	}
	// Exercise 84.1: Multiple constructors
	public int value() {
		return this.startingValue;
	}
	// Exercise 84.1: Multiple constructors
	public void increase() {
		this.startingValue++;
	}
	// Exercise 84.1: Multiple constructors
	public void decrease() {
		if (this.check == false) {
			this.startingValue--;
		} else if (this.check == true && this.startingValue > 0) {
			this.startingValue--;
		}
	}
	// Exercise 84.2: Alternative methods
	public void increase(int increaseAmount) {
		if (this.startingValue > 0) {
			this.startingValue += increaseAmount;
		}
	}
	// Exercise 84.2: Alternative methods
	public void decrease(int decreaseAmount) {
		if (decreaseAmount > 0 && this.check == true) {
			if (this.startingValue >= decreaseAmount) {
				this.startingValue -= decreaseAmount;
			} else {
				return;
			}
		} else {
			this.startingValue -= decreaseAmount;
		}
	}
}
