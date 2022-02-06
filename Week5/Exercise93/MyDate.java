package test5;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String toString() {
		return this.day + "." + this.month + "." + this.year; 
	}
	//Exercise91
	public boolean earlier(MyDate compared) {
        // first we'll compare years
        if (this.year < compared.year) {
            return true;
        }
        // if the years are the same, we'll compare the months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        // years and months the same, we'll compare the days
        if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
            return true;
        }
        return false;
    }
	//Exercise91
	public void advance() {
		this.day++;
		if (this.day > 30) {
			this.month++;
			this.day = 1;
			
			if(this.month > 12) {
				this.year++;
				this.month = 1;
			}
		}
	}
	//Exercise91
	public void advance(int numberOfDays) {
		for (int i = 0; i < numberOfDays; i++) {
			this.advance();
		}
	}
	//Exercise91
	public MyDate afterNumberOfDays(int days) {
		MyDate newMyDate = new MyDate(this.day, this.month, this.year);
		for (int i = 0; i < days; i++) {
			newMyDate.advance();
		}
		return newMyDate;
	}
	//Exercise92
	public int differenceInYears(MyDate compared) {
		int minusOneYear = 0;
		if (this.earlier(compared)) {
			if (this.month > compared.month) {
				minusOneYear = 1;
			} else if (this.month == compared.month && this.day > compared.day) {
	            minusOneYear = 1;
	        }
			return compared.year - this.year - minusOneYear;
		}
		
		if (this.month < compared.month) {
            minusOneYear = 1;
        } else if (this.month == compared.month && this.day < compared.day) {
            minusOneYear = 1;
        }
        return this.year - compared.year - minusOneYear;
	}
}
