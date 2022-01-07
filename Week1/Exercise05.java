package WEEK1;

//counts how many seconds there are in a year
//assume that a year consists of 365 days (therefore the year is not a leap year).
public class Exercise05 {
	public static void main(String[] args) {
		int dayInYear = 365;
		int secondInMin = 60;
		int minInHour = 60;
		int hourInDay = 24;
		int secondInYear = secondInMin * minInHour * hourInDay * dayInYear;
		
		System.out.println("There are " + secondInYear + "seconds in a year.");
		
		/*int dayInYear = 365;
		int hourInDay = 24;
		int minuteInHour = 60;
		int secondInMinute = 60;
		
		int hourInYear = dayInYear * hourInDay;
		int minuteInYear = hourInYear * minuteInHour;
		int secondInYear = secondInMinute * minuteInYear;
		
		System.out.println("There are " + secondInYear + "second in a year. "); */
	}
}
