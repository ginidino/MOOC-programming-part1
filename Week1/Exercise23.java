package WEEK1;

import java.util.Scanner;

// draws a graph based on daily temperatures given to it
// 23.1: Asking for numbers
// asks the user to input floating point numbers (double) and then adds the numbers to the graph
// using while(true)
// 23.2: Checking
// temperatures below -30 degrees or over +40 degrees are ignored and not added to the graph.
public class Exercise23 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		while(true) {
			System.out.println("Give a temperature!");
			double temperature = Double.parseDouble(reader.nextLine());
			
			if (temperature >= -30 && temperature <= 40) {
				Graph.addNumber(temperature);
			}
		}
	}
}
