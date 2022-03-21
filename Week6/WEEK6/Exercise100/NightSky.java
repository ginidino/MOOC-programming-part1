package WEEK6;

import java.util.Random;

//Exercise 100: Night sky
public class NightSky {
	private double density;
	private int width;
	private int height;
	private int starsInLastPrint;
	
	// Exercise 100.1: Class NightSky and a star line
	public NightSky(double density, int width, int height) {
		this.density = density;
		this.width = width;
		this.height = height;
	}
	// Exercise 100.1: Class NightSky and a star line
	public NightSky(double density) {
		this.density = density;
		this.width = 20;
		this.height = 10;
	}
	// Exercise 100.1: Class NightSky and a star line
	public NightSky(int width, int height) {
		this.density = 0.1;
		this.width = width;
		this.height = height;
	}
	// Exercise 100.1: Class NightSky and a star line
	public void printLine() {
		Random random = new Random();
		for (int i = 0; i < this.width; i++) {
			if (random.nextDouble() <= this.density) {
				System.out.print("*");
	            this.starsInLastPrint++;
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	// Exercise 100.2: Printing the night sky
	public void print() {
		this.starsInLastPrint = 0;
		for (int i = 0; i < this.height; i++) {
			printLine();
		}
	}
	// Exercise 100.3: Counting the number of stars
	public int starsInLastPrint() {
		return starsInLastPrint;
	}
}
