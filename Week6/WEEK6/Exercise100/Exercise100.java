package WEEK6;

// Exercise 100: Night sky
public class Exercise100 {
	public static void main(String[] args) {
		/*// Exercise 100.1: Class NightSky and a star line
		NightSky NightSky = new NightSky(0.1, 40, 10);
		
		// Exercise 100.2: Printing the night sky
		NightSky NightSky = new NightSky(8, 4);
		
		// Exercise 100.1: Class NightSky and a star line
		NightSky.printLine();
		
		// Exercise 100.2: Printing the night sky
		NightSky.print();
		
		// Exercise 100.3: Counting the number of stars
		NightSky NightSky = new NightSky(8, 4);
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
		System.out.println("");

		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());*/
		
		NightSky NightSky = new NightSky(0.1, 40, 10);
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
		System.out.println("");

		NightSky = new NightSky(0.2, 15, 6);
		NightSky.print();
		System.out.println("Number of stars: " + NightSky.starsInLastPrint());
	}
}
