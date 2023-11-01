package thisex;

public class ThisExample {

	
	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		
		bDay.setYear(2023);
		bDay.setMonth(8);
		bDay.setDay(29);
		System.out.println(bDay);
		bDay.printThis();
		bDay.getDate();
		
		
	}
	
	
	
	
	
	
	
}

class BirthDay {
	
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
		
	}
	
	public void setMonth(int month) {
		this.month = month;
		
	}
	public void setDay(int day) {
		this.day = day;
		
	}
	public void printThis() {
		System.out.println(this);
	}
	public void getDate( ) {
		System.out.println(day + "-" +month+"-"+ year);
	}
	
	
}


