package string;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * StringBuffer , StringBuilder
		 * 
		 * 기존 문자열 : "윤" + "수민" => "윤수민" // 윤, 수민, 윤수민 3개의 메모리 영역 차지
		 * 
		 * StringBuilder or Buffer 사용 시 // 윤수민 << 한 개만 존재, 메모리 사용에 있어 효율적
		 * 
		 * 	- String 클래스는 한 번 생성되면 그 내부의 문자열이 변경되지 않음
		 * 
		 * 	- String 클래스를 사용해 문자열을 계속 연결하거나 변경하는 프로그램을 사용하면
		 * 	  메모리 낭비가 심함
		 * 
		 * 	- StringBuffer 또는 StringBuilder 를 활용해 문자열을 변경하거나 연결.
		 * 
		 * 	- 두 클래스는 비슷하며
		 * 	  스레드가 동작하는 멀티스레드 프로그램이라면 문자열의 안전한 변경을 보장하는
		 * 	  StringBuffer 클래스 사용
		 * 	  스레드가 동작하지 않는 프로그램이라면 실행 속도가 좀 더 빠른 StringBuilder 클래스 사용
		 * 		
		 * 
		 * 
		 */

		String str = new String("JAVA");
		String str2 = new String("JAVA");
		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
//		=> 인스턴스가 처음 생성될 때 메모리 주소 : 936580213
		System.out.println("str2 문자열 주소 : " + System.identityHashCode(str2));
		System.out.println("str hashcode : " + str.hashCode());
		System.out.println("str2 hashcode : " + str2.hashCode());
//		hashcode는 "JAVA"가 저장된 값
		
		System.out.println(str); // JAVA
//		= System.out.println(str.toString());
		
		str = str + "and";
		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
//		= 메모리 주소 : 1131316523, 변경됨
		System.out.println(str); // JAVA and
//		=> "JAVA and"의 문자열을 갖는 메모리 영역이 새로 생성됨
//		=> 기존 "JAVA" 문자열을 갖는 메모리 영역은 참조하는 변수가 없을 경우
//		   자바에서 제공하는 가비지 컬렉터에 의해 자동으로 사라짐
		
		str = str + "JSP";
		System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
//		=> str 문자열 주소 : 852687460
		System.out.println("---------------------------------");
		
		StringBuilder buffer = new StringBuilder(str2);
		
		System.out.println("buffer 문자열 주소 : " + System.identityHashCode(buffer));
//		=> 연산 전 buffer 메모리 주소 : 495792375
		buffer.append(" and");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
//		=> 연산 후 buffer 메모리 주소 : 495792375
		buffer.append(" JSP");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
//		=> 연산 후 buffer 메모리 주소 : 495792375
		
		str2 = buffer.toString();
		System.out.println(str2);
		System.out.println("새로 만든 str2 문자열 주소 : " + System.identityHashCode(str));
		
		
		
		
	}

}
