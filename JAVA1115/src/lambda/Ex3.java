package lambda;

public class Ex3 {

	public static void main(String[] args) {

		/*
		 * 함수형 인터페이스(functional interface) 또는 타겟 타입(target type)
		 * 
		 * - 람다식은 결과적으로 인터페이스의 클래스를 손쉽게 구현하는 법이다
		 * 
		 * - 반드시 하나의 abstract 메서드만 존재한다
		 * 
		 * - 만약 abstract 메서드가 없거나 두 개 이상 존재한다면 람다식으로 대체 불가능
		 * 
		 * - 함수형 인터페이스 @FunctionalInterface 어노테이션 선언
		 * 
		 * 
		 */
		
		// 1. 파라미터 : X, 리턴 : X
		System.out.println("파라미터 : X, 리턴 : X");
		// 정적 메서드 useFIMethodA의 파라미터가 MyFunc1 의 인터페이스 타입이므로
		// 람다식으로 만들어지는 익명 객체가 파라미터로 사용된다
		
					// 표현방식 1
		useFIMethodA( () -> {
			System.out.println("람다식1");
		});
		
					// 표현방식 2 
		useFIMethodA(() -> System.out.println("람다식2"));
		
		System.out.println("--------------------------");
		
		// 2. 파라미터 : O, 리턴 : X
		System.out.println("파라미터  리턴 : X");
		
					// 표현방식 1
		useFIMethodB(
				(String msg) -> {
					System.out.println("람다식1 : " + msg); 
				}
				);
					
					// 표현방식 2
		useFIMethodB( msg -> System.out.println("람다식2") );
		
		// 3. 파라미터 : O, 리턴 : O
		System.out.println("파라미터 : O, 리턴 : O");
		
					// 표현방식 1
		String result = useFIMethodC(
				(String msg) -> {return "람다식1 : " + msg;}
				);
		System.out.println(result);
		
					// 표현방식 2 
		System.out.println(useFIMethodC(msg -> "람다식2 : " + msg));
		
		} // main 끝
		
	// 1. 파라미터 : X, 리턴 : X
	public static void useFIMethodA(MyFunc1 fi) {
		fi.methodA();
	}
	
	// 2. 파라미터 : O, 리턴 : X
	public static void useFIMethodB(MyFunc2 fi) {
		fi.methodB("홍길동");
	}
	
	// 3. 파라미터 : O, 리턴 : O
	public static String useFIMethodC(MyFunc3 fi) {
		return fi.methodC("김유신");
	}

} // Ex3 끝

// 함수형 인터페이스를 사용하는 람다식 유형

// 1. 파라미터 : X, 리턴 : X
@FunctionalInterface
interface MyFunc1 {
	// 함수형 인터페이스는 반드시 하나의 추상 메서드를 가져야한다
	public void methodA();
}

// 2. 파라미터 : O, 리턴 : X
@FunctionalInterface
interface MyFunc2 {
	public void methodB(String msg);
}

// 3. 파라미터 : O, 리턴 O
@FunctionalInterface
interface MyFunc3 {
	public String methodC(String str);
}