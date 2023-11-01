package dataType;

public class Ex2 {

	public static void main(String[] args) {
		// 2진수, 8진수, 10진수, 16진수의 표현
		// 1. 10진수 : 일반적인 정수 그대로 표현
		int num1 = 10; 
		System.out.println(num1);
		// 2. 2진수 : 0 또는 1만 사용하고, 접두사 0b를 붙인다.
//		num1 = 0b10101;  //2진수 -> 10진수로 변환
		System.out.println(num1);
		// 0 또는 1 이외의 값 사용 절대 불가.
		// 3. 8진수 : 0 ~ 7 사이 숫자만 사용. 접두사 0 붙인다.
		//num1 = 017; // 8진수 -> 10진수 변환
		System.out.println(num1);
		// 4. 16진수 : 0 ~ 9 사이 숫자와 A ~ F 알파벳 사용한다.
		// 			   접두사 0x를 붙인다.
//		num1 = 0xC8; // 16진수의 알파벳은 대소문자 구분하지않는다.
		System.out.println(num1);
		
		
		
	}

}
