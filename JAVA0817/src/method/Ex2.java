package method;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Method 정의 기본 문법
		 * 
		 * [접근제한자] 리턴타입 메서드명 ( [매개 변수] ) {
		 * 		호출 시 수행 코드들
		 * 		[ return [리턴값]; ]
		 * }
		 * 
		 * <메서드 4가지 형태>
		 * 1. 파라미터 X, 리턴값 X
		 * 2. 파라미터 X, 리턴값 O
		 * 3. 파라미터 O, 리턴값 X
		 * 4. 파라미터 O, 리턴값 O
		 * 
		 * 
		 */

		// 3. 파라미터 O , 리턴값 X 메서드 호출
		System.out.println("돈 줄테니까 사 먹어");
//		sister_3(8000); // 메서드 호출 시 전달할 데이터는 메서드명 뒤의 소괄호 내에 작성
						// 메서드 파라미터에 리터럴값을 직접 전달하거나 변수를 사용해 값을 저장한 뒤 파라미터에 전달 가능
		int myMoney = 10000;
		sister_3(myMoney);
		
		// 4. 파라미터 O , 리턴값 O 메서드 호출
		
		System.out.println("10000원으로 음식 배달");
		String food = sister_4(10000);
		System.out.println("배달 음식 : " + food);
		
		
		
		
		
		
	} // main () 끝

	// 3. 파라미터 O , 리턴값 X
	// => 메서드 선언부 소괄호() 안에 외부로부터 호출 시 전달받는 데이터를 저장할 변수(매개 변수) 선언
	// => 리턴값은 없으므로 리턴타입 부분을 void로 설정한다
	
	public static void sister_3(int money) {
		// 파라미터로 선언된 int형 변수 money에 메서드 호출 시 전달받은 값을 저장한다
		// => sister_3(2000); 호출 시 int money = 2000; 과 같다
		System.out.println("동생이 받은 돈 : " + money + "원");
		// 현재 메서드 내에서 money 변수를 자유롭게 사용 가능하다
		// money 변수는 메서드 내에서만 존재한다
		money -= 8000;
		System.out.println("밥 사먹고 남은 돈 : " + money + "원");
	}
	
	// 4. 파라미터 O , 리턴값 O 
	
	public static String sister_4(int money) {
		System.out.println("받은 돈 : " + money + "원");
		money -= 8000;
		System.out.println("받은 돈 - 음식 값 : " + money + "원");
		return  "볶음밥"; // ** return 문 뒤의 값은 하나만 작성 가능
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
//
//	public static void sister_3(int money) {
//		
//		System.out.println("동생이 받은 돈 : " + money + "원");
//		
//		money -= 8000;
//		
//		// if문을 사용, 잔돈이 남았을 때 잔돈을 출력하지 않고 메서드 종료
//		// 잔돈이 남았을 경우 잔돈을 출력한다
//		
//		if ( money > 0 ) {
//			return;
//		}
//		
//		
//		System.out.println("밥 사먹고 남은 돈 : " + money + "원");
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} // Ex2() class  끝
