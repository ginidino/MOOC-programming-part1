package WEEK5;

// Exercise 90: Team and Players
public class Exercise90 {
	public static void main(String[] args) {
		Team manutd = new Team("Manchester United FC");

		// Exercise 90.4: The team maximum size and current size
		manutd.setMaxSize(3);
		// Exercise 90.1: Class Team
	    System.out.println("Team: " + manutd.getName());
	    System.out.println();
	    
	    // Exercise 90.2: Player
	    Player shaw = new Player("Shaw");
        System.out.println("Player: " + shaw);

        Player ronaldo = new Player("Ronaldo", 39);
        System.out.println("Player: " + ronaldo);
        System.out.println();
        
        // Exercise 90.3: Adding players to a team
        manutd.addPlayer(shaw);
        manutd.addPlayer(ronaldo);
        manutd.addPlayer(new Player("Burno", 1)); // works similarly as the above

        manutd.printPlayers();
        System.out.println();
        
        // Exercise 90.4: The team maximum size and current size
        System.out.println("Number of players: " + manutd.size());
        System.out.println();
        
        // Exercise 90.5: Goals of a team
        System.out.println("Total goals: " + manutd.goals());
	}
}
