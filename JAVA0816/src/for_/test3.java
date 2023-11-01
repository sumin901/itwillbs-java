package for_;

public class test3 {

	public static void main(String[] args) {
		/*
		 * 바깥 1 ~ 10 반복
		 * 안쪽 1 ~ 5  반복 
		 * i, j 값 출력 
		 */

		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
			
			for(int j = 1; j <= 5; j++) {
				System.out.println("---->j = " + j);
			} 
		}
		
		/*
		 * 타이머(xx분 xx초)
		 * - 시간 : 0 ~ 23시
		 * - 분   : 0 ~ 59분
		 * - 초   : 0 ~ 60초
		 * 
		 * <출력 예시> 
		 *  0분 0초
		 *  0분 1초
		 *  생략
		 *  0분 59초
		 *  1분 00초
		 *  생략
		 *  59분 44초 
		 *  ...
		 *  59분 59초
		 */
		
//		for(int i = 0; i <= 23; i++) {
//			
//			for(int j = 0; j <= 59; j++ ) {
//				for(int k = 0; k <= 59; k++) {
//					System.out.printf("%2d시 %2d분 %2d초\n", i , j , k);
//				}
//			}
//		}
		
		// 중첩 for문 이용 구구단 출력 (2단 ~ 9단)
		// <출력 예시>
		// < 2단 > 
		// 2 * 1 = 2
		// ...
		// < 9단 > 
		// 9 * 9 = 81
//		
//		for(int i = 2; i <= 9; i++) {
//			System.out.printf("< %d단 >\n", i);
//			
//			for(int j = 1; j<= 9; j++) {
//				System.out.printf("%d * %d = " + i * j + "\n", i, j );
//			}
//			System.out.println();
//		}
	
		/*
		 * 주사위 2개를 굴려 주사위 두 개의 눈의 합이 6일 때 두 주사위 값을 출력한다.
		 * ex) 주사위1		주사위2		합
		 * 		1		+		5	=	6
		 * 		2		+		4	=	6
		 *		3		+		3	=	6
		 *		4		+		2	=	6
		 *		5		+		1	=	6
		 *	주사위 변수 값을 1 ~ 6까지 1씩 증가하면서 반복
		 *	주사위 눈의 합이 6인지 판별한 후 주사위 눈의 값 출력
		 *
		 */
		
		
		
		
		for(int dice1 = 1; dice1 <= 6; dice1++) {
			for(int dice2 = 1; dice2 <= 6; dice2++) {
				int diceSum = (dice1 + dice2);
				if(diceSum == 6) {
					System.out.printf("%d + %d = %d\n", dice1, dice2, diceSum);
				}
			}
		}
			
		// 방정식 4x + 5y = 60의 해를 구해서 출력하기
		// 단, 0 <= x,y <= 10
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if( (4 * x) + (5 * y) == 60) {
					System.out.println("x = " + x +  " y = " + y + " 일 때 " + "4x + 5y = 60");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
