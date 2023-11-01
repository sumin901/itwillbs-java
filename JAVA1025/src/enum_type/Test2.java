package enum_type;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * enum(Week)와 switch-case 문을 활용해
		 * 평일이면(월~목) : "~~"
		 * 금요일 : "~~"
		 * 주말 : "~~"
		 */
		
		Week2 today = Week2.FRI;
		switch(today) {
		case MON:
		case TUE:
		case WED:
		case THU:
			System.out.println("ㅎㅎㅎㅎㅎㅎ");
		break;
		case FRI:
			System.out.println("내일,,,,,,,");
			break;
		case SAT:
		case SUN: 
			System.out.println("주말");
		break;
		}
		
		
	}

}

// enum type 'Week' 정의
// 각 요일 앞 세글자 대문자로 작성

enum Week2 {
	MON, TUE, WED, THU, FRI, SAT, SUN
}
