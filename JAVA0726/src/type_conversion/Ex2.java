package type_conversion;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * <char 타입과 byte & short 타입 간의 관계>
		 * 
		 * - byte(1byte) : -128 ~ 127
		 * - short(2byte) : -32768 ~ 32767
		 * - char(2byte) : 0 ~ 65535
		 * 
		 *   >> byte와 short는 음수 표현이 가능하지만 char는 문자를 표현하기에 양수만 표현한다.
		 *   >> byte, short 와 char간의 형변환은 강제 형변환이 필수적이다.
		 * 
		 * */

		byte b = 100;
		short s = 65;
		
		char ch;
		
		// ch = b; >> 오류 
		ch = (char)b;
		System.out.println(ch);
		
		// char -> byte 변환
		// b = ch; >> 오류
		b = (byte)ch;
		System.out.println(b);
		
		// short -> char 변환
		// ch = s; 오류
		ch = (char)s;
		System.out.println(ch);
		
		// char -> short 변환
		// s = ch; 오류
		s = (short)ch;
		System.out.println(s);
		
		// int형 타입은 char 타입 데이터를 온전히 담을 수 있다.
		// int형 변수 idp 변수 ch 값 저장
		int i = ch; // char -> int 자동 형변환 가능하다.
					// int : -21억 ~ +21억, char 데이터 타입 범위보다 크다.
		
		
		
		
		
		
		
		
		
	}

}
