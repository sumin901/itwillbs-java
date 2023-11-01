package math_class;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Math.random()
		 * 
		 * - 난수 발생 메서드
		 * - 0.0 <= x < 1.0 의 double 타입 난수 발생
		 * 
		 * 
		 * 				<난수 발생 범위 지정>
		 * 1. (정수화)(Math.random() * 최댓값) : 0 ~ 최댓값-1 (0 <= x < 최댓값)
		 * 2. (정수화)(Math.random() * 최댓값) + 1 : 1 ~ 최댓값 ( 1 <= x <= 최댓값)
		 * 
		 */
		
		for(int i = 0 ; i < 10 ; i++) {
			// 0 ~ 9 난수 발생 
//			System.out.println((int)(Math.random()*10));
			
			// 1 ~ 20 난수 발생
			System.out.println((int)((Math.random()*20)+1));
			
		}
		
	}

}
