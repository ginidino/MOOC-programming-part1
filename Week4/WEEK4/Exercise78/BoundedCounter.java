package WEEK4;

public class BoundedCounter {
	private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }
    // 78.1: BoundedCounter
	public void next() {
        if (this.value == this.upperLimit) {
        	this.value = 0;
        } else {
        	this.value++;
        }
    }

    public String toString() {
    	// 78.1: BoundedCounter
        //return "" + this.value;
    	
    	// 78.2: Printing the initial zero
    	String initial = "0";
    	if (this.value > 9) {
    		initial = "";
    	}
    	return initial + this.value;
    }
    // 78.3: The first version of the clock
    public int getValue() {
        // write here code that returns the value
    	return this.value;
    }
    // 78.4: The second version of the clock
	public void setValue(int value) {
		if (this.value < 0 || this.value > this.upperLimit) {
			return;
		}
		this.value = value;
	}
}
