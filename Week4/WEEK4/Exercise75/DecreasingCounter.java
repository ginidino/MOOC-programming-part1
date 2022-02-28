package WEEK4;

public class DecreasingCounter {
	private int value;   // object variable that remembers the value of the counter
	private int initialValue;
	
	public DecreasingCounter(int valueAtStart) {
		this.value = valueAtStart;
		this.initialValue = valueAtStart;
	}

	public void printValue() {
		System.out.println("value: " + this.value);
	}
	// 75.1
	public void decrease() {
		// write here the code that decrements the value of counter by one
		// 75.1: Implementing method decrease()
		//this.value--;
		
		// 75.2: Value remains positive
		if (this.value > 0) {
			this.value--;
		}
	}
	// and here the rest of the methods
	// 75.3
	public void reset() {
		this.value = 0;
	}
	// 75.4
	public void setInitial() {
		this.value = this.initialValue;
	}
}
