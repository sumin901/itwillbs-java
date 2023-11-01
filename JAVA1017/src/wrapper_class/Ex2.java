package wrapper_class;

public class Ex2 {
	/*
	 * 오토 박싱(Auto Boxing)
	 * 
	 * - 기본 데이터타입 => Wrapper 클래스 타입의 객체로 자동 변환하는 기능
	 * 		( ex. int -> Integer, char -> Character)
	 * 
	 * 오토 언박싱(Auto Unboxing)
	 * 
	 * 	- Wrapper 클래스 타입 객체 => 기본 데이터타입으로 자동 변환하는 기능
	 * 		( ex. Integer -> int, Character -> char)
	 * 
	 *  
	 * 
	 */
	
	public static void main(String[] args) {
		// 기본 데이터 타입 변수 선언
		int num1 = 10;
		int num2;
//	기본 데이터타입 변수는 그대로 출력하면 저장된 정수데이터가 출력됨
//	=> 즉 변수에 저장된 데이터가 실제로 사용하는 데이터
		
		Integer n1;
//		Integer n2 = new Integer(20);
//		=> 정수 20을 갖는 인스턴스를 생성하고, 해당 주소값을 Integer 타입 참조변수 n2에 저장
		Integer n2 = new Integer("20"); // 문자열로 표현된 20을 실제 정수로 변환
		
		// 참조 데이터타입 변수는 그대로 출력하면 원래 주소값을 출력
		// Wrapper 클래스의 경우 toString() 메서드가 오버라이딩 되어 있으므로
		// 객체가 저장한 값을 문자열로 리턴해 데이터 출력 가능.
		System.out.println("참조타입 변수 n2의 값 : " + n2);
		
		System.out.println("--------------------------------------");
//		기본 데이터 타입은 stack 공간에 실제 데이터 형태로 직접 관리하지만,
//		객체는 Heap 공간에 실제 데이터가 저장되고, 해당 주소값을  Stack 공간에서 관리함
//		따라서 기본 데이터타입 변수와 참조 데이터타입 변수는 상호호환이 불가능함
//		기본 데이터타입 <-> 참조 데이터타입 변환 시 메서드 등을 활용해야했다
		
		n1 = Integer.valueOf(num1);
//		=> int형 데이터를 Integer 타입 객체로 변환 후 n1에 저장
		System.out.println(num1 + ", " + n1);
		
		// Java 1.5 부터 기본형 -> Wrapper 클래스 타입으로 변환 시 
		// 메서드를 호출하는 변환 과정을 생략해도 자동 변환 수행하도록 변경됨
		// => 즉 대입연산자를 통해 직접 대입이 가능함
		n1 = num1;
		// 기본 데이터를 자동으로 Integer 타입으로 변환 후 저장한다
		// => 오토 박싱(Auto Boxing)
		System.out.println(n1 + ", " + num1);
		
		// Heap 공간에 생성된 Wrapper 클래스 타입 객체를 기본형 변수에 저장
		num2 = n2.intValue(); // Integer 객체 => int 타입으로 변환하는 메서드
		// => 오토 언박싱을 활용할 경우 자동으로 변환을 수행
		num2 = n2; // Integer 객체 => 기본 데이터타입(int)으로 자동 변환
		// => 오토 언박싱
		System.out.println(n2 + ", " + num2);
		System.out.println("--------------------------------------");
		
		int num3 = 10;
		Integer n3 = 20;
		System.out.println(num3 + n3);
//		기본 데이터타입과 Wrapper 클래스 타입간의 연산을 수행할 경우
//		Wrapper 클래스타입 객체를 오토 언박싱 후 연산을 수행한다
		
		System.out.println("---------------------------------");
		
//		Object 타입 변수에 기본 데이터타입 저장 가능
//		단, 기본 데이터타입 => Wrapper 클래스 타입으로 오토 박싱 후
//		다시 Wrapper 클래스 타입 객체 => Object 타입으로 업캐스팅
		Object o = 10;
//		=> Object o = Integer.valueOf(10); 오토박싱 + 업캐스팅
		System.out.println(o); // toString() 메서드 생략
		
		
		
		
	}
	
}
