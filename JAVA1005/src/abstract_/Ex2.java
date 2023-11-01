package abstract_;

public class Ex2 {
	public static void main(String[] args) {
		
		AbstractClass2 ac2 = new SubClass2();
		
		ac2.method1();
		ac2.method2();
//		ac2.method3(); 오류 : 업캐스팅으로 인해 참조 영역 축소
	}
}



// 추상 메서드 2개를 갖는 추상 클래스 정의

abstract class AbstractClass2 {
	public abstract void method1();
	public abstract void method2();
}
// 추상 메서드 2개를 갖는 추상 클래스를 상속받는 서브 클래스 정의
abstract class MiddleClass extends AbstractClass2 {
	// 상속받은 추상 메서드 2개 중 1개만 구현하는 경우
	// => 추상 메서드가 구현되지 않은 채 그대로 존재할 경우
	// => 해당 클래스도 추상 클래스로 선언해야 함
	@Override
	public void method1() {
		System.out.println("MiddleClass에서 구현한 method1()");
		
	}

	
	
}

class SubClass2 extends MiddleClass {
	// method1()은 MiddleClass에서 이미 구현했으므로 강제성 X
	// method2()는 강제
	@Override
	public void method2() {
		System.out.println("SubClass2에서 구현한 method2()");
		
	}
	public void method3() {
		System.out.println("SubClass2에서 구현한 method3()");
	}
	
}
