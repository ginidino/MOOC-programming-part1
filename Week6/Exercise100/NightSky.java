package test6;

import java.util.*;

public class NightSky {
	private double density;
	private int width;
	private int height;
	private int starsInLastPrint;
	
	public NightSky(double density) {
		this.density = density;
		this.width = 20;
		this.height = 10;
	}
	
	public NightSky(int width, int height) {
		this.density = 0.1;
		this.width = width;
		this.height = height;
	}

	public NightSky(double density, int width, int height) {
		this.density = density;
        this.width = width;
        this.height = height;
	}

	public int starsInLastPrint() {
		return starsInLastPrint;
	}

	public void print() {
		this.starsInLastPrint = 0;
		for (int i = 0; i < this.height; i++) {
			printLine();
		}
	}

	public void printLine() {
		Random random = new Random();
		for (int i = 0; i < this.width; i++) {
			double ranVal = random.nextDouble();
			if (ranVal > this.density) {
				System.out.print(" ");
			} else {
				System.out.print("*");
				this.starsInLastPrint++;
			}
		}
		System.out.println();
	}
}
