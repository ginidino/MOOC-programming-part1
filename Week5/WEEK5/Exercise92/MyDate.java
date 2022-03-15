package WEEK5;

// Exercise 91: Extending MyDate
// Exercise 92: Difference of two dates
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
	// Exercise 91.1: Next day
	public void advance() {
		this.day++;
		if (this.day > 30) {
			this.month++;
			this.day = 1;
			
			if (this.month > 12) {
				this.year++;
				this.month = 1;
			}
		}
	}
	// Exercise 91.2: Advancing many days
	public void advance(int numberOfDays) {
		for (int i = 0; i < numberOfDays; i++) {
			this.advance();
		}
	}
	// Exercise 91.3: Creation of a new date
	public MyDate afterNumberOfDays(int days) {
		MyDate newMyDate = new MyDate(this.day, this.month, this.year);
		for (int i = 0; i < days; i++) {
			newMyDate.advance();
		}
		return newMyDate;
	}
	// Exercise 92: Difference of two dates
	public int differenceInYears(MyDate comparedDate) {
		/*// Exercise 92.1: Difference in years, first version
		return Math.abs(this.year - comparedDate.year);*/
		
		// Exercise 92.2: More accuracy
		int difference = 0;
		if (this.earlier(comparedDate)) {
			if (this.month > comparedDate.month) {
				difference = 1;
			} else if (this.month == comparedDate.month && this.day > comparedDate.day) {
				difference = 1;
			}
			return comparedDate.year - this.year - difference;
		}
		
		if (this.month < comparedDate.month) {
			difference = 1;
		} else if (this.month == comparedDate.month && this.day < comparedDate.day) {
			difference = 1;
		}
		return this.year - comparedDate.year - difference;
	}
}
