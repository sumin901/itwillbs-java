package if_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * - 조건식 결과에 따라 실행할 문장이 달라지는 문(statement)
		 * - 1) if 문 2) swich 문
		 * 
		 * 1) if 문
		 * 
		 * <단일 if문>
		 * - 가장 단순한 조건문
		 * - 조건식 판별 결과가 true일 때 특정 문장(블록)을 추가로 실행한다.
		 * 문장 1;
		 * if(조건식) {
		 * 	조건식 판별 결과가 true일 때 실행할 문장들
		 *  문장 2;
		 *  }
		 *	문장 3;
		 *
		 * >> 조건식 판별 결과 true : 문장 1 -> 조건식(true) -> 문장 2 -> 문장 3
		 * >> 조건식 판별 결과 false: 문장 1 -> 조건식(false)-> 문장 3
		 */
		System.out.println("프로그램 시작"); // 문장 1
		int num = 10; 						 // 문장 1
		// 정수 num이 5보다 작은 가?
		if (num < 5) {						 // 조건식
			System.out.println("num이 5보다 작다"); // true일 때 실행할 문장(문장 2)
		}
		System.out.println("프로그램 종료"); // if문이 종료된 후 실행할 문장(문장 3), 조건식과 무관하다.
		
		// 정수 num2의 절댓값 출력
		// 조건식 결과가 true일 때 변수 num2에 '-'를 붙여 다시 변수 num2에 저장 후 출력
		int num2 = 5;
		if (num2 < 0) {
			num2 = -num2;
			System.out.println("음수를 양수로 변환했습니다.");
		} System.out.println("num2의 절댓값 : " + num2);
		
		
		
		
		
	}
}


