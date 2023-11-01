package continue_break;

public class Test {

	public static void main(String[] args) {
		/*
		 * 1 ~ 100 정수의 합 계산 total에 저장
		 * 합계가 1000보다클 경우 1000보다 커지는 시점의 정수 (x)를 출력한다 
		 *
		 */
//		
//		int total = 0;
//		
//		for(int x = 1 ; x < 101 ; x++ ) {
//			total += x ; 
//			if ( total > 1000 ) {
//				System.out.println("x가 " + x + "일 때 total의 값 : " + total);
//				break;
//			}
//		}
		
		/*
		 * 1 + ( -2 ) + 3 + ( -4 ) + 5 + ( -6 ) ...
		 * 총합이 100 이상이 되는 x 값을 출력
		 */
		
//		total = 0;
//		for(int n = 1 ; n > 0 ; n++) {
//			if ( n % 2 == 0 ) {
//				n = -1 * n;
//			}
//			total += n ;
//			if ( total >= 100 ) {
//				System.out.println("총합이 100 이상 일 때의 n 값 : " + n);
//				break;
//			}
//		}
		int n = 1;
		int total = 0;
		while ( true ) {
			
			
			if ( n % 2 == 0 ) {
				total -= n;
			}
			
			else {
				total += n;
			}
			
			if ( total >= 100 ) {
				System.out.println("총합이 100 이상 일 때의 n 값 : " + n);
				System.out.println("total : " + total);
				break;
			}
	
			n++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
