package java_util_package;

import java.util.Random;

public class Ex {

	public static void main(String[] args) {
		
		/*
		 * java.util 패키지
		 * - 다양한 기능을 제공하는 유틸리티 클래스의 모음
		 * - 난수 생성, 날짜 및 시각 관리, 자료구조 등
		 * 
		 * Random 클래스 
		 * - 난수 발생 기능 전용 클래스 
		 * - static 메서드가 아닌 일반 메서드 형태로 제공하므로 인스턴스 생성 필수 
		 * - 정수뿐 아니라 다양한 타입의 난수 제공
		 *   => nextXXX() 메서드 호출해 각 기본 데이터타입 난수 발생
		 *   => 특히, nextInt() 메서드를 통해 정수화 과정없이 정수형 난수 발생 
		 * 
		 */
		
		// Random 클래스 인스턴스 생성
		Random r = new Random();
		
		for(int i = 1; i < 11; i++  ) {
			// nextInt() 메서드 : int형의 전범위 난수 발생 (-21억 ~ +21억)
			System.out.println("nextInt() : " + r.nextInt());
			// nextDouble() 메서드 : double형 범위 난수 발생
			System.out.println("nextdouble() : " + r.nextDouble());
			// nextBoolean() 메서드 : true or false 난수 발생
			System.out.println("nextBoolean() : " + r.nextBoolean());
			
			//nextInt(int) 범위 지정 난수 발생 0 ~ int-1
			System.out.println("nextInt(10) : " + r.nextInt(10));
			// 1 ~ 10 난수 발생
			System.out.println(r.nextInt(10)+1);
			
		}
	}

}
