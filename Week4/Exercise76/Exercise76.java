package test4;

public class Exercise76 {
	public static void main(String[] args) {
		 Menu m = new Menu();
		 
		 m.addMeal("Hamburger");
		 m.addMeal("Fish'n'Chips");
         m.addMeal("Sauerkraut");
         
         m.printMeals();
         
         m.clearMenu();
         m.printMeals();
	}
}
