package anonymous;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 
		 * 	run() 메서드를 가지는 인터페이스 Vehicle
		 * 	익명 구현 객체를 이용해 필드, 로컬변수의 초기값과
		 * 	메서드의 매개값으로 사용
		 * 
		 * 	필드 : 자전거가 달린다.
		 * 	로컬변수의 초기값 : 승용차가 달린다.
		 * 	매서드의 매개변수 : 트럭이 달린다.
		 * 
		 * 
		 */

		UseInterfaceClass4 uic4 = new UseInterfaceClass4();
		uic4.vc.run();
		uic4.method1();
		uic4.method2(new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("트럭이 달린다");
				
			}
		});
	}

}

interface Vehicle {
	void run();
}

class UseInterfaceClass4 {
	Vehicle vc = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달린다.");
			
		}
	};
	public void method1() {
		Vehicle localVc = new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("승용차가 달린다.");
				
			}
		};
		localVc.run();
	}
	
	public void method2(Vehicle vc) {
		vc.run();
	}
}