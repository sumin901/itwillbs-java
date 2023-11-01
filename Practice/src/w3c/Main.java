package w3c;

public class Main {
	int modelYear;
	String modelName;
	
	
	public Main(int year, String name ) {
		
		modelYear = year;
		modelName = name;
	
		
	}
	public static void main(String[] agrs) {
		
		Main test1 = new Main(2001, "K5");
		System.out.println(test1.modelName);
		System.out.println(test1.modelYear);
		
	}
}
