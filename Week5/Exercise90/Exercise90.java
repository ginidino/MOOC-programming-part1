package test5;

public class Exercise90 {
	public static void main(String[] args) {
		Team manchester = new Team("Manchester United");
		System.out.println("Team: " + manchester.getName());
		manchester.setMaxSize(1);
		
		Player shaw = new Player("Shaw");
       // System.out.println("Player: " + shaw);

        Player ronaldo = new Player("Ronaldo", 39);
        //System.out.println("Player: " + ronaldo);
        
        manchester.addPlayer(shaw);
        manchester.addPlayer(ronaldo);
        manchester.addPlayer(new Player("Bruno", 1));
        
        manchester.printPlayers();
        System.out.println("Number of players: " + manchester.size());
        System.out.println("Total goals: " + manchester.goals());
	}
}
