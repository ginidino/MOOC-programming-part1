package test;

import java.util.Scanner;

public class Exercise103 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		BirdWatcher birds = new BirdWatcher();
		
		while (true) {
			String command = ask(reader, "? ");
			
			if (command.equals("Quit")) {
				break;
			}
			
			if (command.equals("Add")) {
                add(reader,birds);
            } else if (command.equals("Observation")) {
                observation(reader,birds);
            } else if (command.equals("Show")) {
                show(reader,birds);
            } else if (command.equals("Statistics")) {
                statistics(reader,birds);
            }
		}
	}

	public static String ask(Scanner reader, String command) {
		System.out.print(command + "" );
		return reader.nextLine();
	}

	public static void add(Scanner reader, BirdWatcher birds) {
		String name = ask(reader, "Name: ");
		String latinName = ask(reader, "Latin Name: ");
		
		birds.addBird(name, latinName);
	}

	public static void observation(Scanner reader, BirdWatcher birds) {
		String name = ask(reader, "What was observed:? ");
		
		boolean success = birds.observe(name);
		if (!success) {
            System.out.println("Is not a bird!");
        }
	}

	public static void show(Scanner reader, BirdWatcher birds) {
		String name = ask(reader, "What?: ");
		String answer = birds.showBird(name);
		
		if (answer == null) {
			System.out.print("Is not a bird!");
		} else {
			System.out.print(answer);
		}
	}

	public static void statistics(Scanner reader, BirdWatcher birds) {
		System.out.print(birds.statistics());
	}
}
