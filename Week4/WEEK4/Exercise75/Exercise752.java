package WEEK4;

// Exercise 75.2: Value remains positive
public class Exercise752 {
	public static void main(String[] args) {
        	DecreasingCounter counter = new DecreasingCounter(2);

        	counter.printValue();

        	counter.decrease();
        	counter.printValue();

        	counter.decrease();
        	counter.printValue();

        	counter.decrease();
        	counter.printValue();
    	}
}
