package WEEK1;

import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Exercise13 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Top ten by points");
		
		NHLStatistics.sortByPoints();
        NHLStatistics.top(10);
        
        System.out.println("Top 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(10);
        
        System.out.println("Stats for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("Stats for the Philidelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("Players in Anaheim Ducks");
        NHLStatistics.teamStatistics("ANA");
	}
}
