package this_;

public class Prc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCar mc = new MyCar();
	}

}

class Car {
	String name;
	int price;
	
	public Car() {
		super();
		
	}
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class MyCar extends Car {
	int buyYear;
	
	public MyCar() {
		super("bbb", 21300);
	}
	
	public MyCar(String name, int price, int buyYear) {
		super(name, price);
	}
}