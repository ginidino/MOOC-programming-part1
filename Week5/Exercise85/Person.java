package test5;

import java.util.Calendar;

public class Person {
	
	private String name;
	private int age;
	private int weight;
	private int height;
	private MyDate birthMyDate;
	private MyDate birthday;
	
	/*public Person(String name, int day, int month, int year) {
    	this.name = name;
    	this.weight = 0;
    	this.height = 0;
    	this.birthMyDate = new MyDate(day, month, year);
	}*/

	/*public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}*/
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
	
	//Exercise93.3
	public Person(String name) {
		//constructor sets the current date (i.e., the date when the program is run) to be the birthday of the person
		this.name = name;
		Calendar cl = Calendar.getInstance();
		int year = cl.get(Calendar.YEAR);
		int month = cl.get(Calendar.MONTH);
		int day = cl.get(Calendar.DATE);
		this.birthday = new MyDate(day, month, year);
	}
	//Exercise93.3
	public Person(String name, MyDate birthday) {
		//constructor sets the given MyDate-object to be the birthday of the person
		this.name = name;
        this.birthday = birthday;
	}

	public void becomeOlder() {
		this.age++;
	}

	public void becomeOlder(int years) {
		this.age = this.age + years;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return this.name;
	}

	public double weightIndex() {
		double heightInMeters = this.height / 100.0;
		return this.weight / (heightInMeters * heightInMeters);
	}
	//Exercise93
	public String toString() {
		return this.name +", born "+ this.birthday;
	}

	public int getWeight() {
		return this.weight;
	}
	//Exercise93.1
	public int age() {
		// calculate the age based on the birthday and the current day
        // you get the current day as follows:
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DATE);
		MyDate cl = new MyDate(day, month, year);
		return birthday.differenceInYears(cl);
	}
	//Exercise93.2
	public boolean olderThan(Person compared) {
		// compare the ages based on birthdate
		return birthday.earlier(compared.birthday);
	}
}
