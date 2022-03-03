package WEEK4;

public class NumberStatistics {
	private int amountOfNumbers;
	private int sum; // 79.2

    public NumberStatistics() {
    	this.amountOfNumbers = 0;
    	this.sum = 0;
    }
    
    public void addNumber(int num) {
       this.amountOfNumbers++; // 79.1: Amount of numbers
       this.sum += num; // 79.2: sum and average
    }
    // 79.1: Amount of numbers
    public int amountOfNumbers() {
    	return this.amountOfNumbers;
    }
    // 79.2: sum and average
	public int sum() {
		return this.sum;
	}
	// 79.2: sum and average
	public double average() {
		if (this.amountOfNumbers == 0) {
			return 0;
		}
		return (double) this.sum / this.amountOfNumbers;
	}
}
