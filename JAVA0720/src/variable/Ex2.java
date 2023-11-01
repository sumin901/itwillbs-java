package variable;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * < 식별자 작성 규칙 >
		 * < 필수 >
		 * 1. 첫 글자는 숫자 사용 불가
		 * 2. 특수문자 $(달러) 또는 _(언더스코어)만 사용 가능
		 * 3. 대소문자 구별
		 * 4. 키워드(예약어) 사용 불가
		 * 5. 공백 사용 불가
		 * ---------------------------------------------------------------
		 * < 권장사항 > 
		 * 6. 의미가 있는 단어 사용
		 * 7. 변수명의 첫단어는 소문자로 작성, 두번째 단어부터는
		 * 	  첫글자를 모두 대문자로 작성
		 *    => Camel-case 표기법 사용
		 *    ex) studentName
		 *    참고) 클래스명은 첫 단어의 첫글자를 대문자 표기
		 *    => Pascla-case 표기법
		 * 8. 길이 제한 없음
		 * 9. 한글 사용이 가능하지만 사용하지 않음
		 */
		
		// 1. 첫 글자는 숫자 사용 불가
//		int 7eleven; // 사용불가
		int sevenEleven;
		
		//2. 특수문자는 $(달러) 또는 _ (언더스코어)만 사용 가능
		int $system;
		int my_name;
//		int channel#5 // 사용 불가!

		//3. 대소문자 구별
		int age; // 소문자 age와
		int AGE; // 대문자 AGE는 다른 식별자로 취급됨
		
		//4. 키워드(예약어) 사용 불가
//		int int;    
//		int switch;
//		int char;
		
		//5. 공백 사용 불가
//		int my name;
//		int my, name; // int형 변수 my와 int형 변수 name을 동시에 선언
		
		//6. 한글 사용 가능(하지만 변수명으로 사용하지 않음)
		int 나이;
		
	}

}
