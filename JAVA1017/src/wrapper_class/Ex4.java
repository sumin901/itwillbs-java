package wrapper_class;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 		Wrapper 클래스의 다양한 메서드
		 * 
		 * - 주로 기본 데이터타입을 다양하게 처리하기 위한 메서드가 제공
		 * 
		 * - 주로 static 메서드 형태로 호출해 사용한다
		 * 	 (클래스명.메서드명())
		 * 
		 * - 기본 데이터타입과 Wrapper 클래스 객체 모두 활용 가능
		 * 
		 */
		
		int num1 = 10, num2 = 20;
		Integer n1 = 10, n2 = 20;
		
//		max() : 두 정수의 최대값을 계산 후 return
		System.out.println(Integer.max(num1, num2)); // 기본 데이터타입
		System.out.println(Integer.max(n1, n2)); // Wrapper 클래스타입
		
//		10진수 정수를 다양한 형태의 진법으로 변환
//		Integer.toXXXXString()
		System.out.println("10의 2진수 표현 : " + Integer.toBinaryString(num1));
		System.out.println("10의 2진수 표현 : " + Integer.toBinaryString(n1));
		System.out.println("10의 8진수 표현 : " + Integer.toOctalString(num2));
		System.out.println("10의 16진수 표현 : " + Integer.toHexString(n1));
		
		System.out.println("=======================================");
		
//		Character 클래스를 활용한 문자 데이터 처리
//		=> 주로 특정 문자에 대한 판별을 수행
//		(Character.isXXX() 하거나 변환(Character.toXXX() 수행 )
		
		char ch = 'R';
		System.out.println("원본 데이터 : " + ch);
		
//		입력받은 문자 ch에 대한 대문자, 소문자, 숫자, 기타문자 판별
//		대문자 : 문자 ch가 'A'(65) 이상, 문자 ch가 'Z'(92)이하
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " : 대문자");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " : 소문자");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " : 숫자");
		} else {
			System.out.println(ch + " : 기타문자");
		}
		
//		Character 클래스 isXXX() 메서드 활용해 각 판별을 대체하고
//		toXXX() 메서드 활용 변환을 수행한다
		
		ch = ' ';
		if(Character.isUpperCase(ch)) {
			System.out.println(ch + " : 대문자");
			System.out.println("소문자로 변환 결과 : " + Character.toLowerCase(ch));
		} else if (Character.isLowerCase(ch)) {
			System.out.println(ch + " : 소문자");
			System.out.println("대문자로 변환 결과 : " + Character.toUpperCase(ch));
		} else if (Character.isDigit(ch)) {
			System.out.println(ch + " : 숫자");
		} else if (Character.isWhitespace(ch)) {
			System.out.println(ch + " : 공백문자");
		} else {
			System.out.println(ch + " : 기타문자");
		}
		
		
		
		
		
	}

}
