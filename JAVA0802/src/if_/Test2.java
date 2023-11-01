package if_;

public class Test2 {

	public static void main(String[] args) {
		// 
		// "아이티윌로 걸어서 출발" 출력
		// money 변수 선언, 초기값 2000(원)
		// 윤지가 돈이 5천원 이상 있다면 "택시타고 가기!" 출력
		// 			   5천원 미만 있다면 "버스타고 가기!" 출력
		// "아이티윌 도착 출력"
		int money = 10000;
		System.out.println("아이티윌로 출발");
		if (money < 5000) {
			System.out.println("버스타고 가기!");
		} else {
			System.out.println("택시타고 가기!");
		} System.out.println("아이티윌 도착");

	}

}
