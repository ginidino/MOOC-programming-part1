package WEEK4;

import java.util.ArrayList;

public class Menu {
	private ArrayList<String> meals;
	
	public Menu() {
		this.meals = new ArrayList<String>();
	}
	// 76.1: Adding a meal to menu
	public void addMeal(String meal) {
		if (!(this.meals.contains(meal))) {
			this.meals.add(meal);
		}
	}
	// 76.2: Printing the menu
	public void printMeals() {
		for (String meal : this.meals) {
			System.out.println(meal);
		}
	}
	// 76.3: Clearing a menu
	public void clearMenu() {
		this.meals.clear();
	}
}
