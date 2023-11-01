package while_;

public class Test3 {

	public static void main(String[] args) {
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


			int min = 0;
			while(min < 60) {
				int sec = 0;
				while(sec < 60) {
					System.out.printf("%d분 %d초\n", min, sec);
					sec++;
				}
				min++;
			}
		
		// 중첩 while문 구구단
			
			int dan = 2;
			while (dan < 10) {
				System.out.println();
				System.out.println("< " + dan + "단 >");
				int i = 1;
				while(i < 10) {
					System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
					i++;
				}
				dan++;
			}
		
		
		
		
		
		
		
		
	}

}
