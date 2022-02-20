package test6;

public class GradeDistribution {
	private int[] grades;
	
	public GradeDistribution() {
		grades = new int[6];
	}

	public void addAScore(int score) {
		if (score < 0 || score > 60) {
			return;
		}
		int theGrade = grade(score);
		grades[theGrade]++;
	}

	public void distribution() {
		System.out.println("Grade distribution:");
		for (int i = 5; i >= 0; i--) {
			System.out.println(i + ": " + stars(grades[i]));
		}
		System.out.println("Acceptance percentage: " + acceptancePercentage());
	}

	private String stars(int n) {
		String star = "";
		for (int i = 0; i < n; i++) {
			star += "*";
		}
		return star;
	}

	private int grade(int score) {
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
	
	private double acceptancePercentage() {
		double all = 0;
		for (int num : grades) {
			all += num;
		}
		double failed = grades[0];
		return 100 * (all - failed) / all;
	}
}
