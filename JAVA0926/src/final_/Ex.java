package final_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 
		 * final 키워드
		 * 
		 * 대상의 변경이 불가능하도록(변경의 최종) 지정
		 * 
		 * 1. 변수에 final이 붙은 경우
		 * => 변수 값 변경 불가, 상수로 취급
		 * => 일반 변수와 구분하기 위해 보통 대문자로 사용하고 단어간의 구분은 언더스코어(_)를 사용한다
		 * => 반드시 초기화가 필수적이다
		 * => 초기화를 하지않는 상수를 blank final 상수라고하며 생성자를 통해 초기화하면 사용 가능
		 *    객체마다 다른 상수 값을 갖게 하기 위해 사용한다
		 * 
		 * 2. 메서드에 final이 붙은 경우
		 * => 메서드 변경 불가, 오버라이딩 불가
		 * 
		 * 3. 클래스에 final이 붙은 경우
		 * => 클래스 변경 불가, 상속 불가
		 * 
		 */
		
		// final 변수의 예시 - Math.PI
		System.out.println("파이 : " + Math.PI);
		// PI 상수값은 변경 불가능
		// Math.PI = 3.14; << final 상수 변경 불가, 오류
		
		
		FinalClass fc = new FinalClass();
		
		SubFinalClass sfc = new SubFinalClass();
		sfc.fc.num = 11;
		
		// final 클래스인 String 클래스의 상속은 불가능하지만 사용은 가능하다
		String str = new String();
		
		
	}

}

// 1. 변수에 final 사용
class FinalMember {
	// final 상수는 초기화가 필수적이다
	 final int finalMember = 10; // << 초기화 X, 오류
	
	// 만약 final 상수를 초기화하지 않을 경우
	final int blankFinalMember; // 초기화 X, 오류 >> 해결 : 생성자를 통해 초기화

	public FinalMember(int blankFinalMember) {
		super();
		this.blankFinalMember = blankFinalMember;
	}
	
	public void change() {
//		finalMember = 100; << final 상수 변경 불가, 오류
		System.out.println("finalMember = " + finalMember);
		
		final int finalLocalVar = 20; // 로컬 변수 또한 final 사용 가능
//		finalLocalVar = 30; << final 상수 변경 불가, 오류	
	}
}

// 2. 메서드에 final 사용
class FinalMethod {
	public final void finalMethod() { // final 메서드 = 오버 라이딩 불가
		System.out.println("슈퍼클래스의 finalMethod()");
		
	}
	public void normalMethod() { 
		System.out.println("슈퍼클래스의 normalMethod()");
	}
}
// FinalMethod의 자식 클래스 SubFinalMethod 클래스
class SubFinalMethod extends FinalMethod {

	@Override
	public void normalMethod() {
		System.out.println("서브클래스에서 오버라이딩된 normalMethod()");
		finalMethod(); // 오버라이딩은 불가능, 호출은 가능
	}
//	@Override
//	public void finalMethod() {
//		System.out.println("서브클래스에서 오버라이딩된 finalMethod()");
//	} 
//	>> 오류 : Cannot override the final method from FinalMethod
	
}

// 3. 클래스에 final 사용
final class FinalClass {
	int num = 1;
	
	public void method() {
		System.out.println("슈퍼 클래스 method()");
	}
}
// FinalClass의 자식, SubFinalClass
//class SubFinalClass extends FinalClass {
//	
//}
// 오류 : The type SubFinalClass cannot subclass the final class FinalClass

class SubFinalClass {
	// final 클래스는 상속관계 (is-a) 형태로는 사용할 수 없다
	// 해결 : 포함관계 (has-a)관계로 인스턴스 생성 후 사용 가능
	FinalClass fc = new FinalClass();
	
}