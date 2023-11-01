package dataType;

public class Ex3 {

	public static void main(String[] args) {
//	문자형 데이터 타입 : char
//	내부적으로 정수형 데이터로 처리된다.
//	2Byte(16bit) 크기
//	정수 범위 0 ~ 65535 사이의 값을 갖는다. 음수 사용 X
//	문자 표현 시 1개의 문자를 ''로 표현한다.
//	-> ''내의 문자 1개가 정수형으로 변환되어 처리된다.
//	e.g> 'A'는 정수 65로 처리한다.
//	-> 유니코드 표현 방법을 사용하기 때문
//	Unicode : 전 세계의 모든 문자를 표현하기 위한 체계
//			  아스키코드를 기반으로 다른 문자를 추가하여 만든 코드 체계
//	아스키코드(7bit) : 미국 표준 문자 코드
//					   'A' = 65, 'a' = 97, '0' = 48
//					   10진수로 된 코드값을 사용하지만, 입력 시 16진수 코드 4자리 사용
//					   '\' 기호와 'u'를 쓰고 16진수 XXXX형태의 유니코드 값 표현 이용
//					   e.g> \uABCD
//		char 타입 변수 ch를 선언하고 대문자 A를 저장 후 출력해본다.
		char ch = 'A';
		System.out.println(ch);
//		char 타입 리터럴을 표기하기 위해서 ''를 사용한다.
//		'' 사이에는 반드시 1개의 문자가 포함되야한다.
//		char 'ABC'; << 오류. 불가능.
//		char '';  << 오류. 불가능.
		ch = ' '; // 공백은 가능.
		ch = 65; // 65 = 'A' 와 같다.
		System.out.println(ch);
		ch = 97;
		System.out.println(ch);
		ch = '\u0041'; // 유니코드 표기법 사용 가능
					   // 0041(16진수) -> 65(10진수) = A
		System.out.println(ch);
		ch = '바';
		System.out.println(ch);
		ch = '\uac00'; // 유니코드 ac00 = 가
		System.out.println(ch);
		
/*
 * 		문자열을 저장하기 위한 참조 데이터타입 : String
 * 		참조 데이터타입은 모두 메모리 크기가 4Byte
 * 		문자 데이터를 표현하는 char 타입은
 * 		1개의 문자만을 ''로 사용하지만
 * 		문자열 데이터를 표현하는 String은 
 * 		0개 이상의 문자열을 ""를 사용하여 표현한다
 * 		e.g> ""문자열 = Null string이라고 한다.
*/
		String str = "Hello, World!";
		System.out.println(str);
		
		str = ""; // Null string(0개 이상 문자가 포함된 문자열)
		System.out.println(str);
		
		str = "A"; // char 타입 대문자 'A'와 다른 데이터다.
		
		
	}

}
