package test6;

import java.util.Scanner;

public class Exercise102 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		GradeDistribution distribution = new GradeDistribution();
		System.out.println("Type exam scores, -1 completes:");
		while (true) {
			int sco = Integer.parseInt(reader.nextLine());
			if(sco == -1) {
				break;
			}
			distribution.addAScore(sco);
		}
		distribution.distribution();
	}
}
