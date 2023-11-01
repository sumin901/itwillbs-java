package array;

public class Ex {
	
	public static void main(String[] args) {
		
	/*
	 * 배열(array)
	 * 
	 * 같은 타입 데이터 여러 개를 하나의 묶음(변수)으로 다루는 메모리 공간
	 * 
	 * - 1. 같은 타입 데이터만 저장 가능
	 *   2. 여러 번수에 해당하는 메모리 공간이 연속된 공간에 차례대로 생성됨
	 *      => 한 번 생성된 배열은 크기 변경 불가능
	 *   3. 기본 데이터 타입과 참조 데이터 타입 모두 배열로 사용 가능
	 *   4. 배열은 선언, 생성, 초기화 3단계 과정을 거쳐 사용한다
	 *   5. 배열 생성 시 각 공간에 해당하는 인덱스(번호)가 자동으로 부여된다
	 *      => 0부터 시작해 배열크기-1까지 부여된다
	 *   6. 배열이 생성 될 경우 배열의 데이터 저장 공간은 
	 *      배열 데이터타입에 해당하는 기본값으로 자동 초기화된다.
	 *      (byte, short, int = 0), long = 0L, float = 0.0f, double = 0/0
	 *      char = 0 또는 '\u0000', boolean = 'false', String = null
	 *   7. 배열의 이름(변수명)을 사용해 배열에 접근 가능(인덱스 필요함)
	 *   8. 배열의 크기는 배열명.length 속성을 통해 알 수 있다.
	 *   
	 *   
	 *   <배열의 선언 기본 문법>
	 *   
	 *   데이터타입[] 변수명;
	 *   => 변수 선언과 유사하지만 데이터타입 뒤에 [] 기호를 사용한다
	 *   => 배열 공간이 생성되기 전이므로, 아직 데이터 저장은 불가하다
	 *   => 선언된 배열의 변수는 참조형 변수로 취급됨.
	 *      (주의! int는 기본형이지만, int[] 은 참조형이다)
	 *   
	 *      
	 *   <배열의 생성 기본 문법>
	 *   
	 *   변수명 = new 데이터타입[배열크기];
	 *   => new 키워드를 사용해 배열 공간을 생성하는데
	 *      데이터타입 뒤의 대괄호 안에 생성할 배열의 크기를 명시한다
	 *   => 생성되는 배열의 위치(주소값)를 선언된 배열 타입 변수에 저장
	 *   => 이제, 실제 메모리 공간이 생성됐으므로 데이터 저장 가능
	 *   => 생성된 배열에는 자동으로 인덱스 번호가 부여된다
	 *      (인덱스 번호는 0 ~ 배열크기-1 까지 자동부여)   
	 *   
	 *   
	 *   
	 *   
	 *   <배열 선언 및 생성을 한 문장으로 결합>
	 *   
	 *   데이터타입[] 변수명 = new 데이터타입[배열크기];
	 *   int[] score = int[5];
	 *   
	 *   
	 *   
	 *   
	 *	   < 배열 접근 기본 문법 >
	 *
	 * 	   변수명[인덱스]
	 * 	=> 변수명에 해당하는 주소(배열 공간)에 접근 한 뒤
	 *     인덱스에 해당하는 데이터 저장 공간에 접근
	 * 	=> 배열에 데이터 초기화(저장) 시
	 *     변수명[인덱스] = 데이터;
	 *   
	 *   
	 *   
	 *   
	 *   <반복문을 사용해 배열 전체에 접근 기본 문법>
	 *   
	 *   for (int i ; i < 배열명.length ; i++) {
	 *   	배열명[i];
	 *   }
	 * 
	 * */	
		// 학생 점수 5개를 별도의 변수에 저장하고 관리하는 경우
		int score1 = 90, score2 = 60, score3 = 80, score4 = 100, score5 = 50;
		int scoreTotal = score1 + score2 + score3 + score4 + score5;
		// ====================================================
		
		// 학생 점수 5개(정수)를 저장할 배열(score) 선언 및 생성 초기화
		// 1. 배열 선언 : 데이터타입[] 배열명;
		int[] score; // int형 정수 여러 개를 저장할 배열 score 선언, 아직 데이터 저장 할 메모리 공간 생성 전임
		// score = 12; => 오류, 배열 이름으로 사용되는 변수에 데이터 저장 불가
		
		// 2. 배열 생성 : 변수명(배열명) = new 데이터타입[배열크기];
		score = new int[5];
		// 연속적인 int형 배열 공간 5개를 생성하고
		// 해당 공간의 메모리 주소를 int[] 타입 변수 score에 저장
		// 이 때, 5개의 메모리 공간에는 각각의 인덱스 번호가 자동으로 부여된다
		// 인덱스 번호 : 0 ~ 4
		
		// 배열 선언 및 생성을 하나의 문장으로 결합
		int[] score6 = new int[5];
		
		// 배열에 접근해 각 배열 공간의 데이터 출력
		// => 배열명이 score 이므로 score[인덱스] 형식으로 접근한다
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		// => 배열은 자동으로 기본값 0으로 초기화된다.
		
		/*
		 * 주의! 생성된 배열의 인덱스 범위를 벗어나는 배열 접근 시 오류 발생함
		 * => 단, 문법적으로 오류가 아니기 때문에 코드 상에서는 알 수 없고,
		 *    프로그램 실행 시점에서 오류가 발생한다
		 *    
		 * 
		 * */
		// System.out.println(score[5]); => 코드 상 오류가 아니지만, 실행 시 오류
		// =>  java.lang.ArrayIndexOutOfBoundsException:
		
		// 배열에 데이터 저장(초기화) = 90, 60, 80, 100, 50
		score[0] = 80;
		score[1] = 70;
		score[2] = 100;
		score[3] = 60;
		score[4] = 50;
		// score[5] = 30; => 존재하지 않는 인덱스 접근, 오류 발생함
		
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		System.out.println("============================================");
		
		// for문 사용 배열 모두 출력
		
		for (int i = 0; i < score.length ; i++) {
			System.out.println(score[i]);
		}
		// 배열의 모든 인덱스 접근 시 조건식에 배열 크기 직접 지정할 경우
		// 배열 크기 변동 시 조건식 코드도 변경해야하므로 배열명.length를 사용한다
		System.out.println("배열 score의 크기 : " + score.length);
		
		// 배열 선언 시 [] 기호 위치에 따른 차이점
		int[] arr1, arr2; // arr1, arr2 모두 int[] 타입 변수로 선언됨
		int arr3, arr4[]; // arr3은 int, arr4는 int[] 타입 변수로 선언됨
		// 따라서, 자바에서 권장하는 문법 < 데이터타입[] 변수명; > 
		
		
	}
}
