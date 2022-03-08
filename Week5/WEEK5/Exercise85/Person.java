package WEEK5;

public class Person {
	private String name;
    private int age;
    private int height;
    private int weight;
    
    // Exercise 85.1: Weight of a person
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = 0;
        this.weight = weight;
        this.height = height;
    }

    public void printPerson() {
        System.out.println(this.name + " I am " + this.age + " years old");
    }

    public void becomeOlder() {
        this.age++;
    }

    public boolean adult() {
        if ( this.age < 18 ) {
            return false;
        }

        return true;
    }

    public double weightIndex() {
        double heightInMeters = this.height/100.0;
        return this.weight / (heightInMeters*heightInMeters);
    }

    public String toString() {
        return this.name + " I am " + this.age + " years old, my weight index is " + this.weightIndex();
    }

	public void setHeight(int height){
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
}
