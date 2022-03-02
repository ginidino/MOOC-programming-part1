package WEEK4;

// Exercise 75.1: Implementing method decrease()
public class Exercise751 {
	public static void main(String[] args) {
		DecreasingCounter counter = new DecreasingCounter(10);

        	counter.printValue();

        	counter.decrease();
        	counter.printValue();

        	counter.decrease();
        	counter.printValue();
	}
}
