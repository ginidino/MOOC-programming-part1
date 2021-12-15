package test4;

public class Exercise775 {
	public static void main(String[] args) {
        LyyraCard card = new LyyraCard(10);
        System.out.println("Pekka: " + card);
        card.loadMoney(-15);
        System.out.println("Pekka: " + card);
    }
}
