package WEEK5;

// Exercise 92: Difference of two dates
public class Exercise92 {
	public static void main(String[] args) {
		MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);
        
        // Exercise 92.1: Difference in years, first version
        // Exercise 92.2: More accuracy
        System.out.println(second + " and " + first + " difference in years: " + second.differenceInYears(first)); 
        System.out.println(third + " and " + first + " difference in years: " + third.differenceInYears(first));   
        System.out.println(second + " and " + third + " difference in years: " + second.differenceInYears(third)); 
        System.out.println();
        
        // Exercise 92.3: And the final version
        System.out.println(first + " and " + second + " difference in years: " + second.differenceInYears(first));
        System.out.println(second + " and " + first + " difference in years: " + first.differenceInYears(second));
        System.out.println(first + " and " + third + " difference in years: " + third.differenceInYears(first));
        System.out.println(third + " and " + first + " difference in years: " + first.differenceInYears(third));
        System.out.println(third + " and " + second + " difference in years: " + second.differenceInYears(third));
        System.out.println(second + " and " + third + " difference in years: " + third.differenceInYears(second));
	}
}
