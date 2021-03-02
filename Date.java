
public class Date {
	protected int year;
	protected int month;
	protected int day;
	
	public Date() {
		
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear(){
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	/* public Date compare(Date dt) {
	} */
	
}
