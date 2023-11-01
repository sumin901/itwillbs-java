package for_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 반복문을 사용한 연산의 누적 (ex. 합계 계산 등)
		 * 
		 * 1. 연산을 누적할 누적 변수선언 및 초기화(반복문보다 선수행)
		 * 2. 반복문을 사용해 특정 횟수 반복
		 * 3. 반복문 내에서 특정 연산(데이터)를 누적 변수에 누적
		 * 4. 반복문 종료 후 누적 변수 값 사용(출력)
		 */
		
		// 1 ~ 5 누적 합을 계산해 변수에 저장 후 출력
		
		int num = 1;
		int sum = 0;
		
		for(num=1; num<6; num++) {
			sum += num;
		}
		System.out.printf("sum의 값은 : %d, num의 값은 : %d", sum, num);
		
		System.out.println();
		
		int total = 0;
		int i = 1;
		for(i=1; i<11; i++) {
			total += i;
		}
		System.out.printf("total의 값은 : %d, i의 값은 : %d", total, i);
	
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
