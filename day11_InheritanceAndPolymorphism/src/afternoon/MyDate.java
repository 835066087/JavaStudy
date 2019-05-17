package afternoon;

class MyDate {

	private int year;
	private int month;
	private int day;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public MyDate() {

	}

	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public String show() {
		return "年:" + year + ",月:" + month + ",日:" + day;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate d1 = (MyDate) obj;
			if (this.year == d1.getYear()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (year % 201 + month * 2013 + day * 2012);
	}

	@Override
	public String toString() {
		return show();
	}

}
