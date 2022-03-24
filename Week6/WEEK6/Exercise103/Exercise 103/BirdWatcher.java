package test;

import java.util.ArrayList;

public class BirdWatcher {
	private ArrayList<Bird> birds;
	
	public BirdWatcher() {
		birds = new ArrayList<Bird>();
	}

	public void addBird(String name, String latinName) {
		birds.add(new Bird(name, latinName));
	}

	public boolean observe(String name) {
		for (Bird bird : birds) {
			if(name.equals(bird.name())) {
				bird.observe();
				return true;
			}
		}
		return false;
	}

	public String showBird(String name) {
		for (Bird bird : birds) {
			if(name.equals(bird.name())) {
				return bird.toString();
			}
		}
		return null;
	}

	public String statistics() {
		String stats = "";
		for (Bird bird : birds) {
			stats = stats + bird.toString() + "\n";
		}
		return stats;
	}
}
