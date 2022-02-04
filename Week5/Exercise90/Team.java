package test5;

import java.util.*;

public class Team {
	private String name;
	private int maxSize = 16;
	private ArrayList<Player> players = new ArrayList<Player>();
	

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void addPlayer(Player player) {
		if (this.size() >= this.maxSize) {
			return;
		}
		players.add(player);
		
	}

	public void printPlayers() {
		for (Player player : this.players) {
			System.out.println(player);
		}
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public int size() {
		return this.players.size();
	}

	public int goals() {
		int amount = 0;
		for (Player player : this.players) {
			amount += player.goals();
		}
		return amount;
	}
}
