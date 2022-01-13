package test1;

import java.util.*;
import nhlstats.NHLStatistics;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Top ten by points");
		NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        NHLStatistics.searchByPlayer("Sidney Crosby");

        NHLStatistics.teamStatistics("PHI");

        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
	}
}
