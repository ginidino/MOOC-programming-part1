package test;

public class Bird {
	private String name;
	private String latinName;
	private int observation;

	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
		this.observation = 0;
	}

	public String name() {
		return this.name;
	}

	public void observe() {
		this.observation++;
	}

	public String toString(){
        return "\n" + this.name + " (" + this.latinName + "): " + this.observation + " observations";
    }
}
