package for_;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 중첩 for문
		 * 
		 * - for문 내부에 또 다른 for문을 기술하는 것
		 * 
		 * - 바깥 for문과 안쪽 for문으로 구분한다
		 *   => 바깥 for문이 한 바퀴 돌 때, 안쪽 for문은 여러 바퀴를 돈다.
		 *   => 즉, 안쪽 for문의 반복 횟수가 바깥 for문 반복 횟수보다 많다.
		 *      = 안쪽 for문 반복 횟수 = 안쪽 for문 횟수 * 바깥 for문 횟수
		 * ex) 시계의 시침과 분침 -> 1시간 시침 : 1바퀴 (바깥for문)
		 * 						  -> 1시간 분침 : 60바퀴 (안쪽 for문)
		 * 
		 * for(초기식1;조건식1;증감식1) {
		 * 	문장1; // 바깥 for문의 조건식1이 true일 때 실행
		 * 
		 * 		for(초기식2;조건식2;증감식2{
		 * 		문장2; // 반복 횟수 : 바깥 for문 반복 수 * 안쪽 for문 반복 수
		 * 	}
		 *  	문장3; // 안쪽 for문 반복 종료된 후 실행
		 * }
		 *   
		 *  
		 *  
		 */

		// 바깥 for문 : i 값이 1 ~ 3 1씩 증가
		for(int i = 1; i <= 3 ; i++ ) {
			System.out.println("i = " + i); // 3회 반복 
			
			for(int j = 1 ; j <= 2 ; j++) { //안쪽 for문
				System.out.println("-----> j = " + j);
				// 반복 횟수 = i(3) * j(2) = 6회
			}
			System.out.println("-------->안쪽 for문 종료");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
