package if_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * <if ~ else문>
		 * - 조건식 판별 결과가 true일 때와 false일 때 서로 다른 블록을 실행한다
		 * - 삼항 연산자와 유사한 형태로 수행되나, 삼항 연산자보다 더 유연하게 사용 가능하다.
		 *   (조건식 판별 결과에 따라 실행 가능한 문장이 더 다양하다)
		 * - if문 블록은 조건식 결과가 true일 때 실행하고,
		 * 	 else문 블록은 조건식 결과가 false일 때 실행한다.
		 *   >> 조건식 결과 값에 따라 둘 중 하나의 블록만 실행한다.
		 *   
		 * 문장1;
		 * 
		 * if(조건식) {
		 * 		문장2; 조건식 결과가 true.
		 * } else {
		 * 		문장3; 조건식 결과가 false.
		 *   }
		 * 문장4;
		 */
		
		// 정수 num에 대한 절댓값 계산
		int num = 1; // 문장 1
		
		if (num < 0) {
			System.out.println("음수이므로 양수로 변환");
			num = -num;
		} else {
			System.out.println("양수이므로 변환 생략");
		}
		System.out.println("num의 절댓값 : " + num);
		
		// 정수 num2에 대해 홀수, 짝수(0포함) 판별
		int num2 = 1;
		if (num2%2 == 0) {
			System.out.println(num2 + " : 짝수입니다.");
		} else {
			System.out.println(num2 + " : 홀수입니다.");
		}
		
		// 문자 ch가 대문자일 때 "대문자!" 출력, 아닐 때 "대문자 아님!" 출력
		// 'A'와 같이 문자로 입력해도 되고, 65와 같이 숫자로 입력해도 된다.
		char ch = 'i';
				if (ch >= 'A' && ch <= 'Z') { // == (ch >= 65 && ch <= 90)
					System.out.println(ch + " : 대문자!");
				} else {
					System.out.println(ch + " : 대문자 아님!");
				}
			
		// 문자 ch가 소문자일 때 "소문자!"를 출력하고 대문자로 변환 후 출력
		// 아니면 " 소문자가 아님!" 출력
		// 'a' : 97, 'z' : 122, 'A' : 65, 'Z' : 90
		if (ch >= 97 && ch <= 122) {
			System.out.print(ch + " : 소문자!");
			ch -= 32;
			System.out.println(" 대문자로 변환 ! " + ch);
		} else {
			System.out.println(ch + " : 소문자가 아님!");
		}
				
		
		
		
		
	}

}
