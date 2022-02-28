package WEEK4;

public class Exercise76 {
	public static void main(String[] args) {
		Menu menu = new Menu();
		
		// 76.1: Adding a meal to menu
		menu.addMeal("Hamburger");
		menu.addMeal("Fish'n'Chips");
		menu.addMeal("Sauerkraut");
		
		// 76.2: Printing the menu
		menu.printMeals();
		
		// 76.3: Clearing a menu
		menu.clearMenu();
		menu.printMeals();
	}
}
