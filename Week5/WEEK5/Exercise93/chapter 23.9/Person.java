public class Person {
	  private String name;
    private int age;
    private int weight;
    private int height;
    private MyDate birthMyDate;

	public Person(String name, int day, int month, int year) {
	  this.name = name;
    this.weight = 0;
    this.height = 0;
    this.birthMyDate = new MyDate(day, month, year);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name + ", born " + this.birthMyDate;
	}
}
