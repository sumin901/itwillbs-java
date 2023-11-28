package anonymous;

public class Test {

	public static void main(String[] args) {
		/*
		 * 	Worker 클래스의 익명 자식 객체를 이용해
		 * 	필드(멤버 변수), 로컬 변수의 초기값과 메서드의 매개값 대입
		 * 	필드 : "디자인을 합니다" 출력
		 * 	로컬변수 : "개발을 합니다" 출력(method1)
		 * 	매개값: "테스트를 합니다" 출력(method2)
		 * 
		 * 	! Worker 클래스에는 start() 메서드가 정의됨
		 * 	  익명 객체를 이용하는 AnonyClass 정의
		 * 
		 */
		
		AnonyClass ac = new AnonyClass();
		ac.member.start();
		ac.method1();
		ac.method2(new Worker() {

			@Override
			public void start() {
				System.out.println("테스트 합니다");
			}
			
		});
		
		
	}

}

// 부모 클래스
class Worker {
	public void start() {
		System.out.println("start() 메서드");
	}
}
// 익명 객체를 이용하는 AnonyClass 
class AnonyClass {
	Worker member = new Worker() {

		@Override
		public void start() {
			System.out.println("디자인을 합니다");
		}
		
	};
	
	// 개발 합니다 출력
	public void method1() {
		Worker localVar = new Worker() {

			@Override
			public void start() {
				System.out.println("개발 합니다");
			}
		};

		localVar.start();
		
	}
	
	// 테스트 합니다 출력
	public void method2(Worker worker) {
		worker.start();
	}
	
	
	
}