package array;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 거스름돈을 몇 개의 동전으로 지불할 수 있는지 계산하는 문제
		 * 변수 money의 금액을 동전으로 바꿀때
		 * 각각 몇 개의 동전이 필요한지 계산해서 출력한다
		 * 단, 가능한 적은 수의 동전으로 거슬러 줘야한다
		 * (Hint) 나눗셈 연산자와 나머지 연산자를 이용한다
		 * 
		 * [출력 예시]
		 * money = 2680;
		 * 500원 = 5
		 * 100원 = 1
		 * 50원  = 1
		 * 10원  = 3
		 * 
		 */

		// floor(변수 money / 500) = 500원 갯수
		// floor( (변수 money - 500 * 500원 갯수) / 100 ) = 100원 갯수
		
		/*
		 * int money = 3790;
		 * 
		 * int 오백원; int 백원; int 오십원; int 십원;
		 * 
		 * 오백원 = Math.floorDiv(money, 500); 백원 = Math.floorDiv((money - 오백원*500),100);
		 * 오십원 = Math.floorDiv((money-오백원*500-백원*100), 50); 십원 =
		 * Math.floorDiv((money-오백원*500-백원*100-오십원*50), 10);
		 * 
		 * System.out.println("필요한 500원 동전 갯수 : " + 오백원);
		 * System.out.println("필요한 100원 동전 갯수 : " + 백원);
		 * System.out.println("필요한 50원 동전 갯수 : " + 오십원);
		 * System.out.println("필요한 10원 동전 갯수 : " + 십원); System.out.println("총합 : " +
		 * (500*오백원 + 100*백원 + 50*오십원 + 10*십원));
		 */
	
		// 배열 생성 (동전 액수)
		int[] coinUnit = {500, 100, 50, 10};
		
		// 거스름돈 변수(money)
		int money = 2680;
		
		// 배열 접근
		for(int i = 0 ; i < coinUnit.length ; i++) {
			// 거스름돈을 각 동전으로 나눴을 때 몫 = 필요 동전 수
			// 거스름돈을 각 동전으로 나눴을 때 나머지 = 남은 거스름돈
			System.out.println(coinUnit[i] + "원" + (money / coinUnit[i]) + "개");
			money %= coinUnit[i];
			System.out.println("남은 거스름돈 : " + money + "원");
		}
		
		
		
		
		
	}

}
