package if_;

public class Test {

	public static void main(String[] args) {
		// "아이티윌로 걸어서 출발" 출력
		// money 변수 선언, 초기값 2000(원)
		// 윤지가 돈이 5천원 이상 있다면 "택시타고 가기!" 출력
		// 			   5천원 미만 있다면 "버스타고 가기!" 출력
		// "아이티윌 도착 출력"
		System.out.println("아이티윌로 걸어서 출발");
		int money = 5000;
		if (money >= 5000) {
			System.out.println("택시타고 가기!");
		}
		if (money < 5000) {
			System.out.println("버스타고 가기!");
		}
		System.out.println("아이티윌 도착!");
		
		// if문 조건식에 비교 연산자, 논리 연산자 등을 조합해 활용 가능하다.
		// 1. 나이(age)를 입력받아 20대인지 판별한다.
		int age = 30;
		String gender = "MAN";
		if (age >= 20 && age < 30) {
			System.out.println("20대 입니다.");
		} else {
			System.out.println("20대가 아닙니다.");
		}
		boolean A = age >= 20 && age < 30;
		boolean B = gender == "MAN";
		if (A && B) {
			System.out.println("20대 남성입니다.");
		}
		
		// 2. 나이를 입력 받아 놀이동산 무료 입장 여부 판별
		// * 5세 미만 또는 65세 이상은 무료 입장 *
		age = 31;
		String army = "미필";
		boolean C = army == "현역";
		if (age < 5 || age >= 65) {
			System.out.println("무료 입장 대상자입니다.");
		}
		else {
			System.out.println("무료 입장 대상자가 아닙니다.");
		}
		if (C == true) {
			System.out.println("할인 대상자 입니다.");
		} else {
			System.out.println("할인 대상자가 아닙니다.");
		}
			
		
		
		
		
		
	}

}
