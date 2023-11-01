package while_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * do ~ while문 
		 * 
		 *  - while 문은 조건을 검사 후 반복 여부를 결정하지만
		 *    do ~ while문은 반복문을 먼저 실행 후 조건을 검사해 다음 반복 여부를 결정한다
		 *  
		 *  - while 문은 조건식에 따라 반복문이 0회 실행할 수 있지만
		 *    do ~ while 문은 최소 1회 실행한다
		 *    
		 *  <기본 문법>
		 *  do {	조건식이 없으므로 코드는 일단 한 번 실행
		 *  		반복 실행 코드
		 *  		조건식 판별을 마지막에 수행
		 *  } while(조건식); << 세미콜론 필수 사용
		 *  
		 *    
		 */

		int i = 11;
		while (i <= 10) {
			System.out.println(i);
		}
		
		do {
			System.out.println("i = " + i);
			i++;
		} while(i <= 10);
		
		System.out.println("do while문 종료 후 i의 값 : " + i);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
