package if_;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 다중 if ~ elsf if 문 (if ~ else if ~ else)
		 * - 두 가지 이상의 조건식을 사용해 세 가지 이상의 경우의 수를 판별한다.
		 * - 기본 if문으로 첫 조건을 설정하고, else if 문으로 두 번째 이후의 조건을 설정한다.
		 * - 모든 조건이 만족하지 않을 때 실행할 문이 있을 경우
		 *   문장의 마지막에 else문을 사용한다. * 문장 마지막 else문이 필수적인 것은 아님.
		 * - if문 비교는 위에서 아래로 차례대로 비교를 수행한다.
		 *   >> 비교 범위가 좁은 조건식부터 비교를 수행해야한다.
		 *   
		 * if (조건식1) {
		 * 		조건식 1의 결과 true 실행 코드
		 * } else if (조건식2) {
		 * 				조건식 1의 결과 false, 조건식 2의 결과 true 실행 코드
		 *         } else if(조건식n) {
		 *         			조건식 1 ~ n-1의 결과 false, 조건식 n의 결과 true 실행 코드
		 *         			}
		 *         		else {
		 *         		위의 모든 조건식(n까지) 결과가 false일 때, 실행 코드
		 *         		생략 가능!
		 *         		}
		 * 
		 * 
		 * 
		 */

		// 정수 num 양수, 음수, 0의 판별
		int num = -2;
		if (num == 0) {
			System.out.println(num + " : 0입니다.");
		} else if (num > 0) {
			System.out.println(num + " : 양수입니다.");
		} else {
			System.out.println(num + " : 음수입니다.");
		}
		
		// 정수형 변수 num에 대해 홀수, 짝수, 0 구별
		
		if (num ==0) {
			System.out.println(num + " : 0!");
		} else if (num%2 == 0) {
			System.out.println(num + " : 짝수!");
		} else {
			System.out.println(num + " : 홀수!");
		}
		
		num = 11;
		// num이 5보다 클 경우 "5보다 크다"
		// num이 10보다 클 경우 " 10보다 크다"
		if (num > 5) {
			System.out.println("5보다 크다");
		} else if (num > 10) {
			// num > 5 조건식 범위 안에 num > 10 조건식이 포함되므로 실행되지 않는다.
			System.out.println("10보다 크다");
		}
		// 만약, 6 ~ 9 의 숫자를 판단하려면?
		// else if문 작성 시 조건식의 범위가 좁은 조건식부터 판별하도록 작성한다.
		if (num > 10) {
			System.out.println("10보다 크다");
		} else if (num > 5) {
			System.out.println("5보다 크다"); // 6, 7, 8, 9 중 숫자가 해당한다.
		}
		
		
	
		
		
		
	}

}
