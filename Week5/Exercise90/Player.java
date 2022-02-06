package test5;

public class Player {
	private String name;
	private int goals;

	public Player(String name) {
		this.name = name;
	}

	public Player(String name, int goal) {
		this.name = name;
		this.goals = goal;
	}
	
	public int goals() {
		return this.goals;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name + ", goals " + this.goals;
	}
}
