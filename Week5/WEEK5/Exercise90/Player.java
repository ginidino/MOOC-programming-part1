package WEEK5;

// Exercise 90: Team and Players
public class Player {
	private String name;
	private int goal;

	public Player(String name) {
		this.name = name;
	}
	// Exercise 90.2: Player
	public Player(String name, int goal) {
		this.name = name;
		this.goal = goal;
	}
	// Exercise 90.2: Player
	public String getName() {
		// returns the player name
		return this.name;
	}
	// Exercise 90.2: Player
	public int goals() {
		// returns the amount of goals
		return this.goal;
	}
	
	public String toString() {
		return this.name + ", goals " + this.goal;
	}
}
