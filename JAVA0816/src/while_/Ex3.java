package while_;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 중첩 while문
		 * 
		 *  - 중첩 for문과 마찬가지로 while문 내에 또 다른 while문을 기술
		 *  
		 *  <기본 문법>
		 *  
		 *  초기식 1;
		 *  while(조건식1) {
		 *  		초기식2;
		 *  		while(조건식2){
		 *  		반복 코드
		 *  		증감식2;
		 *  		}
		 *  	증감식1;
		 *  }
		 *  
		 */

		// for문을 사용해 i 값이 1 ~ 5 반복
		// 				  j 값이 1 ~ 3 반복하는 중첩문
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 4; j++) {
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		
		System.out.println();
		
		int i = 1;
		while(i < 6) {
			int j = 1;
			while (j < 4) {
				System.out.println("i = " + i + ", j = " + j);
				j++;
			}
			i++;
		}
		
		
		
		
		
		
		
		
		
	}

}
