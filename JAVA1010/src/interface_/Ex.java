package interface_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 				<인터페이스(interface)>
		 * 
		 * 클래스가 아니다
		 * 
		 * 인터페이스는 상수와 추상 메서드에서만 가질 수 있다.
		 * => 모든 멤버 변수는 public static final 상수로 취급된다
		 * => public static final 생략 가능
		 * => public이므로 누구나 접근 가능, static이므로 클래스명만으로 접근 가능
		 * => final 이므로 변경 불가
		 * 
		 * 모든 메서드는 public abstract가 붙은 추상 메서드로 취급
		 * => public abstract 생략 가능
		 * => 메서드 바디를 가질 수 없고, public으로 인해 누구나 접근 가능
		 * 
		 * 추상 클래스와 마찬가지로 추상 메서드를 포함하므로 객체 생성 불가
		 * => 단, 참조변수 타입으로 사용 가능 (다형성, 업캐스팅으로 활용)
		 * 
		 * 서브 클래스(구현 클래스)에서 인터페이스를 상속받아 구현해야 하는 경우
		 * extends 대신 implements 사용
		 * => 클래스는 상속받아 확장의 개념이라면, 
		 * => 인터페이스는 상속받아 추상 메서드를 구현(implement)하는 개념
		 * 
		 * 클래스는 서브 클래스에서 다중 상속이 불가능하지만
		 * 인터페이스는 서브 클래스에서 다중 상속(구현)이 가능하다
		 * => implements + 여러 개의 인터페이스 지정 가능
		 * 
		 * 인터페이스끼리 상속의 경우 implements가 아니라 extends로 상속
		 * => 추상 메서드는 구현(implements)하지 못하기 때문
		 * 
		 * 				<인터페이스 기본 문법>
		 * 
		 * [접근제한자] interface 인터페이스명 {
		 * 		상수
		 * 		추상 메서드
		 * }
		 * 
		 * 
		 * 
		 * 				<인터페이스를 상속받는 서브클래스 정의 문법>
		 * 
		 * [접근제한자] class 클래스명 implements 인터페이스명 {}
		 * 
		 */
		
		MySubClass msc = new MySubClass();
		msc.method1();
		msc.method3();
	}

}
// 인터페이스 정의
// class 대신 interface 사용
interface MyExInterface {
	// 인터페이스 내의 모든 멤버 변수는 public static final 임
	public static final int NUM1 = 0; // 상수
	int NUM2 = 2; // public static final 생략
	
//	public MyExInterface() {} 오류 : Interfaces cannot have constructors
//	인터페이스는 생성자를 가질 수 없다
//	=> 반드시 변수의 초기화를 해야함
	
//	인터페이스 내의 모든 메서드는 추상 메서드로 취급한다
	public abstract void method1();
	
//	public void method2() {} 오류 : Abstract methods do not specify a body
//	=> abstract 키워드를 사용하지 않아도 abstract 메서드로 취급한다
	
	void method3(); // public abstract 생략
}


abstract class MyClass {
	// 클래스 내의 멤버 변수는 선언 방법에 따라 다르다 <-> 인터페이스 : 항상 상수
	public static final int NUM1 = 1; // 상수
	public int NUM2 = 2; // 인스턴스 멤버 변수(상수X)
	
	public MyClass () {
		// 생성자 생성 가능
	}
	public abstract void method1(); // 추상 메서드
	// 추상 메서드를 갖는 클래스는 반드시 추상 클래스로 선언해야한다
	
	public void method2() {
		// 추상 클래스는 일반 메서드를 갖는다
	}
}



// 인터페이스를 상속받아 구현하는 MySubClass

class MySubClass implements MyExInterface {

	@Override
	public void method1() {
		System.out.println("서브클래스 method1()");
	}

	@Override
	public void method3() { // MyExInterface에선 public을 생략했지만 클래스에서는 반드시 public 키워드 사용
		System.out.println("서브클래스 method3()");
		
	}
	
}


















