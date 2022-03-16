package WEEK6;

//Exercise 94: PhoneBook
public class Person {
	private String name;
	private String num;

	public Person(String name, String num) {
		this.name = name;
		this.num = num;
	}
	// Exercise 94.1: Person
	public String getName() {
		return this.name;
	}
	// Exercise 94.1: Person
	public String getNumber() {
		return this.num;
	}
	// Exercise 94.1: Person
	public void changeNumber(String newNum) {
		this.num = newNum;
	}
	
	public String toString() {
        return this.name + " number: " + this.num;
    }
}
