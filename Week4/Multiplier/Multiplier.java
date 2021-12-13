package test4;

public class Multiplier {
	private int ownNum;

	public Multiplier(int num) {
		this.ownNum = num;
	}

	public int multiply(int otherNum) {
		return this.ownNum * otherNum;
	}
}
