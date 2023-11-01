package cooperation;

public class TakeTrans {
	public static void main(String[] agrs) {
		
		Student James = new Student("James", 5000);
		Student Tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		James.takeBus(bus100);
		James.showInfo();
		bus100.showInfo();
		
		Subway green = new Subway("2호선");
		Tomas.takeSubway(green);
		Tomas.showInfo();
		green.showInfo();
		
		Student Yoon = new Student("윤", 17000);
		Taxi callTaxi = new Taxi("81바 1978");
		Yoon.takeTaxi(callTaxi);
		Yoon.showInfo();
		callTaxi.showInfo();
		
		
		
	}

}
