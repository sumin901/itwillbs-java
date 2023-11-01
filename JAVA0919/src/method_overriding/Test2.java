package method_overriding;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.addFuel();
		c.speedDown();
		c.speedUp();
		
		DieselCar myCar = new DieselCar();
		
		myCar.addFuel();
		myCar.speedDown();
		myCar.speedUp();
		
		
		
	}

}



/*
*
* 			Car 클래스
* speed - int / maxSpeed - int
* 
* speedUp() : "자동차 속력 증가" 리턴X paraX
* speedDown() : "자동차 속력 감소" 리턴X paraX
* addFuel() : "자동차 연료 주입" 리턴X paraX
* 
*/

class Car {
	int speed;
	int maxSpeed;
	
	public void speedUp() {
		System.out.println("자동차 속력 증가");
	}
	
	public void speedDown() {
		System.out.println("자동차 속력 감소");
	}
	
	public void addFuel() {
		System.out.println("자동차 연료 주입");
	}
	
	
}

/*			DieselCar
 * cc - int
 * 
 * 
 */
class DieselCar extends Car {

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("디젤, 자동차 속력 증가");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("디젤, 자동차 속력 감소");
	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		System.out.println("디젤 주입");
	}
	
}
