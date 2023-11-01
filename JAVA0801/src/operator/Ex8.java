package operator;

public class Ex8 {

	public static void main(String[] args) {
		/*
		 * 삼항 연산자(조건연산자) (?, :)
		 * - 피 연산자가 세 개인 연산자
		 * - 조건식의 판별 결과가 true일 때와 false일 때
		 *   서로 다른 위치의 값(또는 식)을 선택하는 연산자
		 * - 조건식은 결과가 true or false가 되는 식을 사용해야한다.
		 * 
		 * <기본 문법>
		 * 조건식 ? 값1(true일 때 선택) : 값2(false일 때 선택);
		 */
		
		int num = 0;
		
		// num이 0 이상 인지를 판별하는 식
		
		System.out.println(num >= 0);
		System.out.println(num >= 0 ? "num은 양수!" : "num은 음수!");
		// num이 0 이상 일 경우 true 값을 return하고 true에 해당하는 "num은 양수!" 값을 선택해 출력한다.
		
		String result = num >= 0 ? "num은 양수!" : "num은 음수!";
		System.out.println(result);

		result = num > 0 ? "num은 양수!" : (num < 0 ? "num은 음수!" : "num은 0");
		System.out.println(result);
		
		
		// 1 ~ 50번이 새겨진 공이 있다.
		// 이 중 1 ~ 18번 공은 빨간색, 19 ~ 41번 공은 파란색, 42 ~ 50번 공은 초록색이다.
		// n번의 공을 뽑았을 때 색깔은 무엇인가?
		
		int n = 0;
		result = n <= 18 ? n + "번 공은 빨간색" : n >= 42 ? n + "번 공은 초록색" : n + "번 공은 파란색";
		System.out.println(result);
	}

}
