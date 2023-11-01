package for_;

public class Test2 {

	public static void main(String[] args) {
		// 1 ~ 100 누적 합 출력 (변수 : total)
		
		int total = 0;
		int i = 1;
		for( i=1; i<101; i++) {
			total += i;
			
		}
		System.out.printf("total의 값 : %d, i의 값 : %d", total, i);
		
		System.out.println();
		
		
		// 1 ~ 10까지 1씩 증가한다, 정수 중 짝수의 합만 계산 후 출력
		
		int sum = 0;
		for(i=1;i<11;i++) {
			if (i % 2 == 0) {
				sum += i;
			}
			
		}
		System.out.println("sum의 값 : " + sum);
		
		System.out.println("------------------------------------");
		
		// 1 ~ 10 정수 중 홀수의 합 계산 후 출력
		total = 0;
		for(i=1; i<11; i+=2) {
			total += i;
		}
		System.out.println("1 ~ 10 홀수의 합 : " + total);
		
		
		
		
		
		
		
		
		

	}

}
