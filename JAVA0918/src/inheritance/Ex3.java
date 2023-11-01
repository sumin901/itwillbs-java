package inheritance;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * has-a 관계 (포함) vs is-a 관계 (상속)
		 * 
		 * 1. has-a 관계 (포함)
		 * 
		 *  - A has a B => A가 B를 포함한다
		 *  
		 *  - 가장 일반적인 객체 간의 관계
		 *  
		 *  - 특정 클래스 내에서 다른 클래스의 인스턴스를 생성해
		 *    해당 인스턴스를 다루는 관계
		 * 
		 *  - ex) 자동차 class - 엔진 // 스마트폰 class  - 카메라
		 *  
		 *  2. is-a 관계 (상속)
		 *  
		 *  - A is a B => A는 B이다
		 *  
		 *  - 특정 클래스가 다른 클래스를 상속 받아 해당 클래스의 멤버를 선언없이 다루는 관계
		 *  
		 *  - ex) 자동차 - 소방차, 핸드폰 - 스마트폰
		 *  
		 *  
		 *  
		 */
		Car c = new Car();
		c.showCarInfo();
		Car119 cc = new Car119();
		cc.showCar119Info();
		
	}

}

class Engine {
	int cc = 3000;
}

// Car와 Engine의 관계 ? => has-a(포함) 관계
class Car {
	// 포함 관계일 경우 해당 클래스의 인스턴스를 통해 접근 가능한 관계다
//	cc = 1000; X
	Engine engine = new Engine();
	String modelName = "그랜져";
	
	public void showCarInfo() {
		// 자신의 멤버변수에 접근 시 모델명만으로도 접근 가능
		System.out.println("모델명 : " + modelName);
		
		// 포함 관계에 있는 클래스 멤버에 접근 시 참조변수를 통해 접근 가능
		System.out.println("배기량 : " + engine.cc);
	}
	
}

// 소방차와 자동차의 관계 ? => is-a 관계(상속)
class Car119 extends Car {
	int supplyLimit = 10000; // 급수량
	
	public void showCar119Info() {
		// 자신의 멤버에 접근
		System.out.println("급수량 : " + supplyLimit);
		// 부모의 멤버에 접근
		System.out.println("모델명 : " + modelName);
		// 부모와 포함 관계인 Engine 객체에 접근
		System.out.println("배기량 : " + engine.cc);
	}
}
