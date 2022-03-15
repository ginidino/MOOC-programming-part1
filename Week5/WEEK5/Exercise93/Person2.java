package WEEK5;

import java.util.Calendar;

//Exercise 93: Person extended
public class Person2 {
	private String name;
	private MyDate birthday;
	private MyDate birthMyDate;
	
	// Exercise 93.1: Calculating the age based on the birthday
	public Person2(String name, int pp, int kk, int vv) {
		this.name = name;
		this.birthday = new MyDate(pp, kk, vv);
	}
	// Exercise 93.3: New constructors
	public Person2(String name) {
		//constructor sets the current date (i.e., the date when the program is run) to be the birthday of the person
		this.name = name;
		Calendar cl = Calendar.getInstance();
		int year = cl.get(Calendar.YEAR);
		int month = cl.get(Calendar.MONTH);
		int day = cl.get(Calendar.DATE);
		this.birthday = new MyDate(day, month, year);
	}
	// Exercise 93.3: New constructors
	public Person2(String name, MyDate birthday) {
		//constructor sets the current date (i.e., the date when the program is run) to be the birthday of the person
		this.name = name;
		this.birthday = birthday;
	}
	// Exercise 93.1: Calculating the age based on the birthday
	public String getName() {
        return this.name;
    }
	// Exercise 93.1: Calculating the age based on the birthday
	public int age() {
		// calculate the age based on the birthday and the current day
	    // you get the current day as follows:
	    // Calendar.getInstance().get(Calendar.DATE);
	    // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
	    // Calendar.getInstance().get(Calendar.YEAR);
		Calendar now = Calendar.getInstance();
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
		int day = Calendar.getInstance().get(Calendar.DATE);
		MyDate date = new MyDate(day, month, year);
		return birthday.differenceInYears(date);
	}
	// Exercise 93.1: Calculating the age based on the birthday
	public String toString() {
        return this.name +", born "+ this.birthday;
    }
	// Exercise 93.2: Comparing ages based on birth date
	public boolean olderThan(Person2 compared) {
		// compare the ages based on birth date
		return birthday.earlier(compared.birthday);
	}
}
