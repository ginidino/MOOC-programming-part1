package test4;

import java.util.*;

public class Exercise784 {
	public static void main(String[] args)  {
		Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        System.out.print("seconds: ");
        int s = reader.nextInt(); // read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = reader.nextInt(); // read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = reader.nextInt(); // read the initial value of hours from the user

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        for (int i = 0; i < 121; i++) {
		// like in previous but seconds taken into account
        	System.out.println(hours + ":" + minutes + ":" + seconds);
        	seconds.next();
        	if(seconds.getValue() == 0) {
        		minutes.next();
        		if(minutes.getValue() == 0) {
        			hours.next();
        		}
        	}
        }
	}
}
