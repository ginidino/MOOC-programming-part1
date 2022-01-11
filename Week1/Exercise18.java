package WEEK1;

import java.util.Scanner;

//gives the course grade based on the following table.
//Points   Grade
//0–29	   failed
//30–34	   1
//35–39	   2
//40–44	   3 
//45–49	   4
//50–60	   5
public class Exercise18 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type the points [0-60], -1 completes:");
		while (true) {
			int score = Integer.parseInt(reader.nextLine());
			if(score == -1) {
				break;
			}
			if (score < 30) {
				System.out.println("Grade: failed");
			} else if (score > 29 && score < 35) {
				System.out.println("Grade: 1");
			} else if (score > 34 && score < 40) {
				System.out.println("Grade: 2");
			} else if (score > 39 && score < 45) {
				System.out.println("Grade: 3");
			} else if (score > 44 && score < 50) {
				System.out.println("Grade: 4");
			} else
				System.out.println("Grade: 5");
		}
	}
}
