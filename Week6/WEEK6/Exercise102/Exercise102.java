package WEEK6;

import java.util.Scanner;

// Exercise 102: Grade distribution
public class Exercise102 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] grades = new int[6];
		System.out.println("Type the exam scores [0-60], -1 completes:");
		while (true) {
			int scores = Integer.parseInt(reader.nextLine());
			if (scores == -1) {
				break;
			}
			if (scores >= 0 && scores <= 60) {
				int theGrade = distribution(scores);
				grades[theGrade]++;
			}
		}
		System.out.println();
		System.out.println("Grade distribution:");
		for (int i = 5; i >= 0; i--) {
			System.out.println(i + " : " + stars(grades[i]));
		}
		System.out.println("Acceptance percentage: " + acceptancePercentage(grades));
	}

	public static int distribution(int score) {
		if (score < 30) {
			return 0;
		} else if (score < 35) {
			return 1;
		} else if (score < 40) {
			return 2;
		} else if (score < 45) {
			return 3;
		} else if (score < 50) {
			return 4;
		} else {
			return 5;
		}
	}
	
	public static String stars(int n) {
		String star = "";
		for (int i = 0; i < n; i++) {
			star += "*";
		}
		return star;
	}
	
	public static double acceptancePercentage(int[] grades) {
		// formula 100 * accepted / allScores
		double allScores = 0;
		for (int num : grades) {
			allScores += num;
		}
		double failed = grades[0];
		return 100 * (allScores - failed) / allScores ;
	}
}
