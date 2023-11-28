package anonymous;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 		익명 객체
		 * 
		 * - 클래스 이름이 없고, 클래스 선언과 객체의 생성을 동시에 하기 때문에
		 *   단 한번 사용할 수 있고 오직 하나의 객체만을 생성할 수 있는 일회성 클래스
		 *   
		 * - 이름이 없기 때문에 생성자 갖지 못함
		 * 
		 * - 익명 객체를 만들기 위해서는 어떤 클래스를 상속하거나 인터페이스를 구현해야 함
		 * 
		 * - 한번에 하나의 클래스로 상속받는 동시에 인터페이스를 구현한다
		 * 
		 * - 하나의 클래스를 상속받거나 하나의 인터페이스만을 구현할 수 있다.
		 *   (다중 인터페이스 구현 불가능)
		 *   
		 * 		<기본 문법>
		 * 
		 * new 슈퍼클래스이름() {
		 * 		// 멤버 선언
		 * };
		 * 
		 * new 구현할 인터페이스 이름() {
		 * 		// 멤버 선언
		 * };
		 */
		
		NormalParent np = new NormalChild();
		np.wake();
//		np.work(); >> 업캐스팅으로 인해 참조영역 축소, 사용불가 오류
		
		System.out.println("----------------------");
		
		NormalInterface ni = new NormalChild2();
		ni.run();
		
		System.out.println("----------------------");
		
		NormalParent np2 = new NormalChild3();
		np2.wake();
//		np2.run(); 업캐스팅을 통해 접근하면 참조영역 축소로 인터페이스로 구현한 메서드 사용불가
		
		NormalChild3 nc3 = new NormalChild3();
		nc3.wake();
		nc3.run();

		System.out.println("-------------------------");
		
		UseExtendsClass uec = new UseExtendsClass();
		uec.p.wake(); // 오버라이딩 된 NormalChild의 wake() 메서드
		uec.method();
		
		System.out.println("-------------------------");
		UseAnonyClass uac = new UseAnonyClass();
		uac.p.wake();
//		System.out.println(uac.p.childVar); 	접근 불가
//		uac.p.childMethod();					접근 불가
		
		System.out.println("===========================");
		
		UseAnonyClass2 uac2 = new UseAnonyClass2();
		uac2.method();
		
		
		System.out.println("===========================");
		
		UseAnonyClass3 uac3 = new UseAnonyClass3();
		uac3.method1(np);
		uac3.method2();
		uac3.method3(new NormalParent() {
			public void study() {
				System.out.println("공부를 하다!");
			}

			@Override
			public void wake() {
				System.out.println("4시 기상");
			}
			
		});
	}

}

// 익명 객체를 사용하지 않는 일반 상속 관계
class NormalParent {
	
	public void wake() {
		System.out.println("7시 기상");
	}
	
}

// NormalParent를 상속받는 NormalChild 클래스
class NormalChild extends NormalParent {
	
	public void work() {
		System.out.println("출근");
	}

	@Override
	public void wake() {
		System.out.println("6기 기상");
		work();
	}
	
	
}

// ================================================
// 익명 객체를 사용하지 않는 일반 인터페이스 구현
interface NormalInterface {
	void run(); // public abstract 생략 가능
}

// NormalInterface를 구현하는 NormalChild2 클래스
class NormalChild2 implements NormalInterface {

	@Override
	public void run() {
		System.out.println("출근 전 러닝");
	}
	
}

// NormalParent를 상속받는 동시에 NormalInterface를 구현하는 NormalChild3 클래스
class NormalChild3 extends NormalParent implements NormalInterface {
	public void work() {
		System.out.println("출근...");
		
	}

	@Override
	public void run() {
		System.out.println("출근 전 러닝");
	}

	@Override
	public void wake() {
		System.out.println("5시 기상");
		work();
	}
	
	
}
// ================================================
// 상속 관계에 있는 서브클래스를 활용하는 클래스
class UseExtendsClass {
	NormalParent p = new NormalChild(); 
	public void method() {
		NormalParent localP = new NormalChild();
	}
}
// >> 서브 클래스를 명시적으로 선언해 이미 선언된 서브 클래스로 간단히 객체를 생성해 사용가능
// >> 재사용성이 높다

//    그러나 서브 클래스를 일회성으로 사용하는 경우 익명 자식 객체를 생성해 사용한다
/*
 * 익명 자식 객체 생성
 * 
 * 부모클래스 [필드|변수] = new 부모클래스(매개값, ...) {
 * 		// 필드(멤버변수)
 * 		// 메서드
 * }
 * 
 */

// =====================================
// 익명 객체를 사용하는 클래스
// 멤버변수 p를 선언할 때 초기값으로 익명 클래스를 사용
class UseAnonyClass {
	NormalParent p = new NormalParent() {
		int childVar = 10;
		public void childMethod() {
			System.out.println("익명 객체 메서드");
		}
		@Override
		public void wake() {
			System.out.println("부모로부터 오버라이딩된 메서드");
		}
		
	};
	
	public void method() {
//		p.childVar = 20;	>> 접근 불가
//		p.childMethod();	>> 접근 불가
		p.wake();
	}
	
	// 익명 자식 객체에 새롭게 정의된 필드(멤버변수)와 메서드는 익명 자식 객체 내부에서만 사용가능함
	// 익명 자식 객체는 부모 타입 변수에 대입되므로 부모 타입에서 선언된 것만 사용할 수 있다.
	
	
}

//=============================================
// 익명 객체를 사용한 클래스
// 멤버 메서드 내에서 로컬변수(localP)를 선언할 때 초기값으로 익명 클래스를 사용
class UseAnonyClass2 {
	public void method() {
		NormalParent localP = new NormalParent() {
			int childVar = 10;
			public void childMethod() {
				System.out.println("익명 객체에서 정의된 메서드");
			}
			@Override
			public void wake() {
				System.out.println("로컬변수 localP에 선언된 익명 객체에 오버라이딩된 wake()");
			}
			
		};
		localP.wake();
		// 로컬 변수는 메서드 종료 시 stack 메모리 영역에서 삭제됨
		// 따라서, 익명 객체가 저장된 localP는 메서드가 종료되기 전에 사용해야 함
		
	}	// method() 끝
}

//===========================================
// 익명 클래스를 사용한 클래스의 정의

// 메서드의 매개변수가 부모타입일 경우, 
// 메서드를 호출하는 코드에서 익명 자식 객체를 생성해 매개값으로 대입

class UseAnonyClass3 {
	public void method1(NormalParent parent) {}
	
	public void method2() {
		method1(new NormalParent() {
			int childVar;
			void childMethod() {}
			@Override
			public void wake() {
				System.out.println("매개변수로 사용된 익명 객체의 오버라이딩된 wake()");
			}
			
		});
	}
	
	public void method3(NormalParent parent) {
		parent.wake();
	}
	
}









