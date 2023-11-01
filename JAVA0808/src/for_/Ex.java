package for_;

public class Ex {

	public static void main(String[] args) {
		
		/*
		 * <반복문>
		 * 
		 * - 특정 조건에 따라 지정된 범위의 문장들을 반복 실행하는 문
		 * 
		 * - for문, while문으로 구분한다.
		 * 
		 * 1. for문
		 * 
		 * - 가장 기본적인 반복문
		 * - 반복 횟수가 정해져 있는 경우에 주로 사용한다.
		 * - 초기식, 조건식, 증감식의 위치가 정해져있다.
		 * 
		 * 초기식 : 반복 횟수를 판별하기 위한 조건에 사용될 제어변수를 선언하거나 초기화하는 문장
		 * 
		 * 조건식 : 반복 여부를 결정하기 위한 조건 문장
		 * 			=> if문과 마찬가지로 true일 때 블록 내의 문장을 실행하고
		 * 			   false일 때 for문의 실행을 종료한다.
		 * 
		 * 증감식 : 반복을 위한 조건식에 맞춰 초기식에서 초기화한 제어변수를 증가 또는 감소시키는 문장
		 *
		 * <기본 문법>
		 * for(초기식;조건식;증감식){
		 * 		조건식 결과 : true, 반복 실행할 코드
		 * }
		 * 
		 * 
		 */
		
		// "x : Hello, Wolrd!" 문자열 10회 반복 출력 (x : 반복 횟수)
		System.out.println("1 : Hello, World!");
		System.out.println("2 : Hello, World!");
		System.out.println("3 : Hello, World!");
		System.out.println("4 : Hello, World!");
		System.out.println("5 : Hello, World!");
		System.out.println("6 : Hello, World!");
		System.out.println("7 : Hello, World!");
		System.out.println("8 : Hello, World!");
		System.out.println("9 : Hello, World!");
		System.out.println("10 : Hello, World!");
		System.out.println("------------------");
		// for 반복문 사용 시
		// 초기식 : 제어변수 x 선언 후 1로 초기화
		// 조건식 : 제어변수 x가 1 ~ 10
		// 증감식 : 제어변수 x가 1씩 증가(i++, ++i)
		
		int i; // for문 종료후에도 변수로 존재한다.
		for(i=1;i<=10;i++) { // javascript와 달리 변수 선언이 필수적이다.
			System.out.println(i + " : Hello, World!");
		}
		System.out.println("for문 종료 후 i 값 = " + i);
		// 제어변수 i는 for문에서 선언된 변수이므로 
		// for문의 코드 블록이 끝나면 사용 불가능한 변수(존재하지 않음)
		// 제어변수 i를 for문 종료 후에도 사용하려면 최소한 for문 전에 선언해야한다.
		// Stack의 개념이 필요하다.
		
		
		// 위 for문에 대한 디버깅
		// 초기식(x)	조건식(x<=1)	실행결과= (x + " : Hello, World!")	증감식(x++)
		/*
		 * 		1			true			"1 : Hello, World!"				1 -> 2
		 * 		2			true			"2 : Hello, World!"				2 -> 3
		 * 		3			true			"3 : Hello, World!"				3 -> 4
		 * 		4			true			"4 : Hello, World!"				4 -> 5
		 * 		5			true			"5 : Hello, World!"				5 -> 6
		 * 		6			true			"6 : Hello, World!"				6 -> 7
		 * 		7			true			"7 : Hello, World!"				7 -> 8
		 * 		8			true			"8 : Hello, World!"				8 -> 9
		 * 		9			true			"9 : Hello, World!"				9 -> 10
		 * 		10			true			"10 : Hello, World!"			10 -> 11
		 * 		11			false			   for문 실행 종료								 
		 */
		
		// 1 ~ 10 1씩 증가하면서 i 값 출력
		// 출력 예시 : 1 2 3 4 5 6 ... 10
		i = 1;
		for(i=1;i<=10;i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// i가 1 ~ 10까지 2씩 증가하면서 i값 출력 (홀수 출력)
		// 출력 예시 : 1 3 5 7 9
		
		for(i=1;i<=5;i++) {
			System.out.print(1 + (2*(i-1) ) + " ");
		}
		
		System.out.println();
		
		for(i=1; i<=9; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		i = 2;
		for(i=2;i<=10;i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		i = 10;
		for(i=10;i>0;i--) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
