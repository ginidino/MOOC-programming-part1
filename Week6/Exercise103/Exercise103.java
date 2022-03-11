package test6;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise103 {
	private static ArrayList<Bird> birds = new ArrayList<Bird>();
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.print("? ");
			String command = reader.nextLine();
			
			if (command.equals("Quit")) {
				break;
			}
			
			if(command.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                Bird bw = new Bird(name, latinName);
                birds.add(bw);
			} else if (command.equals("Observation")) {
				System.out.print("What was observed:? ");
                String name = reader.nextLine();
                
                boolean success = observe(name);
                if (!success) {
                    System.out.println("Is not a bird!");
                }
			} else if (command.equals("Statistics")) {
				for (Bird bird : birds) {
					System.out.print(bird);
				}
			} else if (command.equals("Show")) {
				System.out.print("What? ");
				String name = reader.nextLine();
				for (Bird bird : birds) {
					if (bird.getName().equals(name)) {
						System.out.print(bird);
					}
				}
			}
		}
	}

	public static boolean observe(String name) {
		for (Bird bird : birds) {
			if(name.equals(bird.getName())) {
				bird.observation();
				return true;
			}
		}
		return false;
	}
}
