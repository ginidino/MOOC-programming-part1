package test1;

public class Exercise5 {
	public static void main(String[] args) {
		int dayInYear = 365;
		int hourInDay = 24;
		int minuteInHour = 60;
		int secondInMinute = 60;
		
		int hourInYear = dayInYear * hourInDay;
		int minuteInYear = hourInYear * minuteInHour;
		int secondInYear = secondInMinute * minuteInYear;
		
		System.out.println("There are " + secondInYear + "second in a year. ");
	}
}
