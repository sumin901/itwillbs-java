package anonymous;

import java.rmi.Remote;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UseAnonyInterfaceClass uic = new UseAnonyInterfaceClass();
		uic.rc.turnOn();
		uic.rc.turnOff();
		
		System.out.println("-------------------------------");
		
		UseAnonyInterfaceClass2 uic2 = new UseAnonyInterfaceClass2();
		uic2.method();
		
		System.out.println("----------------------------------");
		
		UseAnonyInterfaceClass3 uic3 = new UseAnonyInterfaceClass3();
		uic3.method1(null);
		uic3.method2();
		uic3.method3(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트폰을 켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트폰을 끕니다");
				
			}
		});
		
	}

}
// =========================
// 인터페이스 타입의 필드 또는 변수를 선언하고, 구현 객체를 초기값으로 대입
interface RemoteControl {
	void turnOn();
	void turnOff();
}

class TV implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV On");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV Off");
		
	}
	
}

class UseImplementsClass {
	RemoteControl rc = new TV(); // 멤버 변수에 구현 객체 대입
	public void method() {
		RemoteControl localRc = new TV(); // 로컬 변수에 구현 객체 대입
	}
}

// 구현 클래스를 선언하고, new 연산자를 이용해 구현 객체를 생성한 뒤
// 인터페이스 타입의 필드 또는 로컬 변수에 대입하는 것이 일반적임
// 재사용성 높다.

// 그러나 구현 클래스가 재사용되지 않고, 특정 위치에서만 사용할 경우
// 구현 클래스를 명시적으로 선언하는 것은 귀찮은 작업
// => 익명 구현 객체 생성으로 작업을 줄인다.

/*
 * 익명 구현 객체 생성
 * 
 * 인터페이스 [필드|변수] = new 인터페이스() {
 * 				// 인터페이스에 선언된 추상 메서드와 실제 메서드 선언
 * 				// 필드(멤버변수)
 *				// 메서드
 * }
 */

// =====================================================
// 익명 구현 객체를 사용한 클래스
// 멤버변수 rc를 선언할 때 초기값으로 익명 구현 객체 사용
class UseAnonyInterfaceClass {
	RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
		
	};
}

// ===================================================
// 익명 구현 객체를 사용한 클래스
// 멤버 메서드 내에서 로컬 변수(localVar)를 선언할 때 초기값으로 익명 구현 객체를 사용 
class UseAnonyInterfaceClass2 {
	public void method() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("라디오를 켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("라디오를 끕니다");
				
			}
		};
		
		localVar.turnOn();
		localVar.turnOff();
		
		
	}
}

// ======================================================================
// 익명 구현 객체를 사용한 클래스
// 메서드의 매개변수가 부모 타입일 경우 호출하는 메서드 코드에서
// 익명 구현 객체를 생성해 매개값으로 대입
class UseAnonyInterfaceClass3 {
	public void method1(RemoteControl rc) {};
	
	public void method2() {
		method1(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트폰을 켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트폰을 끕니다");
				
			}
		});
	}
	
	void method3(RemoteControl rc ) {
		rc.turnOn();
		rc.turnOff();
		
	}
}


































