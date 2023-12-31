package java_util_package;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		/*
		 * 난수 발생 
		 * 
		 * 1. Math.random() : double 타입 난수 발생
		 * 2. Random 클래스 인스턴스 생성 후 메서드 사용
		 * 
		 * >> 난수 활용 특정 범위 값 발생시키기 - SMS 인증번호 (숫자) 생성
		 * => Random 객체 nextInt(int) 
		 * =>
		 * 
		 */
		Random r = new Random();
		int rNum = r.nextInt(10000);
		
		/*
		 * 4자리 인증번호 (0000 ~ 9999) 생성
		 * 4자리보다 작은 자릿수를 갖는 정수를 4자리로 만드는 방법
		 * (부족한 자리 숫자를 0으로 채우기 = 0으로 패딩(padding))
		 * => String 클래스 format() 메서드 활용
		 * => format() 메서드 첫번째 파라미터로 형식 지정 패턴 문자열 지정한다
		 *    %d 	: 10진수
		 *    %4d 	: 10진수 4자리로 표기하라
		 *    %04d	: 10진수 4자리로 표기할 때 부족한 자리는 0으로 대체한다
		 *    
		 * 
		 */
		String strNum = String.format("%04d", rNum);
		System.out.println(strNum);
		
		/*
		 * ex) 6자리 인증번호 ( 000000 ~ 999999 )
		 * 		 * 
		 */
		for(int i = 0; i < 11 ; i ++) {
			rNum = r.nextInt(1000000);
			strNum = String.format("%06d", rNum);
			System.out.println(strNum);
		}
		
		/*
		 * 난수 활용 특정 범위 값 발생
		 * E-mail 인증코드(문자) 생성
		 * 
		 * 1. 인증코드에 사용될 문자를 배열로 모두 저장하기 
		 * 
		 */
		int codelength = 6;
		
		char[] codeTable = new char[codelength];
		for(int j = 0; j < 10; j++) {
			for(int i = 0 ; i < codelength ; i++) {
				codeTable[i] = (char)(r.nextInt(78)+48);
				System.out.print(codeTable[i]);
			}
			System.out.println();
		}
		
		
		
	}

}
