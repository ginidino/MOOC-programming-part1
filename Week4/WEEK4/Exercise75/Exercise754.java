package WEEK4;

// Exercise 75.4: Back to initial value
public class Exercise754 {
	public static void main(String[] args) {
        	DecreasingCounter counter = new DecreasingCounter(100);

        	counter.printValue();

        	counter.decrease();
        	counter.printValue();

        	counter.decrease();
        	counter.printValue();

        	counter.reset();
        	counter.printValue();

        	counter.setInitial();
        	counter.printValue();
    }
}
