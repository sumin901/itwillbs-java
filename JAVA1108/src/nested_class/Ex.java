package nested_class;

public class Ex {
	
	public static void main(String[] args) {
		
		/*
		 * 중첩클래스
		 * : 클래스 내에서 정의된 또다른 클래스
		 * 
		 * : 중첩 클래스를 사용하면 두 클래스의 멤버들을 서로 쉽게 접근할 수 있다
		 * 
		 * : 외부에서는 불필요한 관계 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있는 장점이 있다
		 * 
		 * : 독립적인 일반 클래스 형태로 작성할 필요는 없지만
		 *   나름대로 클래스 형태(멤버변수, 메서드, 생성자)를 갖춰야 할 때 사용한다
		 *   
		 * : 보통 자신의 클래스 내에서만 접근 가능하도록 전용 클래스로 정의할 때 사용한다
		 *   => 주로, GUI 구현 시 이벤트 처리를 위한 핸들러 클래스 정의시 사용한다
		 * 
		 * : 외부 클래스와 내부 클래스로 구분한다
		 * 
		 * : 내부 클래스는 클래스 정의 위치에 따라 구분하며
		 *   클래스 멤버로서 선언되는 중첩 클래스를 [멤버 클래스]라고 하며,
		 *   생성자 또는 메서드 내부에서 선언되는 중첩 클래스를 [로컬 클래스]라고 한다
		 * 
		 * : 다시 멤버 클래스는 객체를 생성해야만 하는 1) 인스턴스 멤버 클래스
		 * 	 			  클래스로 바로 접근할 수 있는 2) 정적 멤버 클래스로 나눈다
		 * 
		 *   1) 인스턴스 멤버(내부) 클래스
		 *    - 멤버변수 및 메서드와 동일한 레벨에 정의한 클래스
		 *    - static 키워드를 지정하지 않은 클래스
		 *    - 인스턴스 멤버 변수(필드)와 메서드만 선언이 가능하고
		 *      정적 변수(필드)와 정적 메서드는 선언 불가
		 *    - 반드시 외부클래스 인스턴스 생성 후 접근 가능
		 *    
		 *   2) 정적 멤버(내부)클래스
		 *    - 멤버변수 및 메서드와 동일한 레벨에 정의한 클래스
		 *    - static 키워드를 지정한 클래스
		 *    - 모든 종류의 필드와 메서드를 선언 가능
		 *    - 외부클래스명만으로 접근 가능
		 *    
		 *   3) 로컬 멤버(내부) 클래스 (=로컬 클래스)
		 *    - 클래스 내의 메서드 내에서 정의한 클래스
		 *    
		 *  - 멤버 클래스의 경우 [바깥클래스$멤버클래스.class] 파일 생성
		 *    로컬 클래스의 경우 [바깥클래스$1로컬클래스.class] 파일 생성
		 *    
		 * < 중첩 클래스 기본 문법 >
		 * class 바깥클래스명 {
		 * 		class 안쪽클래스명 {
		 * 
		 * 
		 */
		
		// 1. 인스턴스 내부 클래스에 접근하기
		// : 반드시 외부 클래스 인스턴스 생성 후 참조변수를 통해 접근해야한다
		// : 외부클래스참조변수명.new 내부클래스명() 형태로 인스턴스를 생성한다
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		// 참조변수 선언 시 패키지명을 생략하고 내부 클래스 타입만으로도 선언이 가능하다
		
		// 2. static 멤버 내부 클래스 접근하기
		Outer.StaticInner staticInner = new Outer.StaticInner();
		
		
	}
}

class Outer {	// 바깥 클래스, 외부 클래스
	private int num = 10; 	// 인스턴스 멤버 변수
	int num2 = 20; 			// 인스턴스 멤버 변수
	static int num3 = 30; 	// 정적 멤버 변수
	
	public void method() { 	// 인스턴스 멤버 메서드
		// 인스턴스 멤버 메서드 내에서는 인스턴스 멤버변수 및 메서드에 자유롭게 접근 가능
		System.out.println("인스턴스 멤버 변수 num = " + num);
		method2();
	}
	
	public void method2 () {
		System.out.println("인스턴스 메서드 method2()");
		
	}
	
	public static void method3() {	// 정적 메서드
		// 정적 메서드 내에서는 인스턴스 멤버 변수 접근 불가능 
		// > 정적 메서드 입장에서 인스턴스 멤버 변수가 아직 메모리상에 올라가지 않았기 때문에
//		System.out.println("인스턴스 멤버변수 num = " + num); -> 오류
		System.out.println("정적 멤버변수 num3 = " + num3); 	// 정적 멤버 접근 가능
	}
	
	class Inner {	// 내부 클래스, 중첩 클래스, 인스턴스 멤버 클래스
		int innerNum = 100;
//		static int innernu2 = 200;  -> 내부 클래스에서는 static 선언 불가능
		
		public void innerMethod() {
			System.out.println("외부 클래스의 인스턴스 멤버 변수 num = " + num);
			System.out.println("외부 클래스의 인스턴스 멤버 변수 num2 = " + num2);
			System.out.println("외부 클래스의 정적 멤버 변수 num3 = " + num3);
			method();
			method2();
			method3();
			// 인스턴스 멤버 내부 클래스에서는 외부 클래스의 멤버에 자유롭게 접근 가능하다
			// 인스턴스 멤버 메서드에서 클래스에 접근하는 방식과 같음 
		}
		
//		public static void innerMethod2() {
//			static 메서드 선언 불가능	
//		}
		
		
			
			
		}
	static class StaticInner {
		int innerNum = 10;
		static int innerStaticNum = 20;
		
		public void innerMethod() {
			// 외부 클래스의 멤버 변수 접근 불가능
			// 메모리 로딩 시점이 다르기 때문에 외부 클래스의 인스턴스 멤버에 접근 불가능
//			System.out.println("외부 클래스의 인스턴스 멤버 변수 num = " + num);
//			method2();
			System.out.println("외부 클래스의 정적 멤버 변수 num3 = " + num3);
			
		}
		
		public static void innerStaticMethod() {
//			System.out.println("내부 클래스의 인스턴스 멤버변수 innerNum = " + innerNum);
//			System.out.println("내부 클래스의 인스턴스 static 멤버변수 innerStaticNum = " innerStaticNum);
		}
		
		
	}	
	
		
}
	
	
	
	
