package WEEK4;

// Exercise 78.3: The first version of the clock
public class Exercise783 {
	public static void main(String[] args) {
		BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        for (int i = 0; i < 121; i++) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            // advance minutes
            // if minutes become zero, advance hours
            minutes.next();
            minutes.getValue();
            if (minutes.getValue() == 0) {
            	hours.next();
            }
        }
	}
}
