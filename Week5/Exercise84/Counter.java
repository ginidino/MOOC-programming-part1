package test5;

public class Counter {
	private int stratingValue;
	private boolean check;

	public Counter(int num, boolean check) {
		this.stratingValue = num;
		this.check = check;
	}
	
	public Counter(int num) {
		this(num, false);
	}
	
	public Counter(boolean check) {
		this(0, true);
	}
	
	public Counter() {
		this(0, false);
	}
	
	public int value() {
		return this.stratingValue;
	}
	
	public void increase() {
		increase(1);
	}

	public void decrease() {
		decrease(1);
	}
	
	public void increase(int in) {
		if(in >= 0) {
			this.stratingValue += in;
		}
	}

	public void decrease(int de) {
		if (de < 0) {
			return;
		} 
		this.stratingValue -= de;
		
		if (this.check && this.stratingValue < 0) {
			this.stratingValue = 0;
		}
	}
}
