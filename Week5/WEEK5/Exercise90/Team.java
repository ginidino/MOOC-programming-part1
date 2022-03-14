package WEEK5;

import java.util.ArrayList;

// Exercise 90: Team and Players
public class Team {
	private String name;
	private ArrayList<Player> players = new ArrayList<Player>();
	private int maxSize = 16;
	
	public Team(String name) {
		this.name = name;
	}
	// Exercise 90.1: Class Team
	public String getName() {
		// returns the name
		return this.name;
	}
	
	public void addPlayer(Player player) {
		// adds a player to the team
		// Exercise 90.3: Adding players to a team
		//players.add(player);
		
		// Exercise 90.4: The team maximum size and current size
		if (players.size() < this.maxSize) {
			players.add(player);
		}
	}
	// Exercise 90.3: Adding players to a team
	public void printPlayers() {
		// prints the players in the team
		for (Player player : this.players) {
			System.out.println(player);
		}
	}
	// Exercise 90.4: The team maximum size and current size
	public void setMaxSize(int maxSize) {
		// sets the maximum number of players that the team can have
		this.maxSize = maxSize;
		
	}
	// Exercise 90.4: The team maximum size and current size
	public int size() {
		// returns the number of players in the team
		return this.players.size();
	}
	// Exercise 90.5: Goals of a team
	public int goals() {
		// returns the total number of goals for all the players in the team
		int goals = 0;
		for (Player player : this.players) {
			goals += player.goals();
		}
		return goals;
	}
}
