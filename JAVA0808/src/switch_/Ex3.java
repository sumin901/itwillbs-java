package switch_;

public class Ex3 {

	public static void main(String[] args) {

		
		int score = 110;
		switch (score / 10) {
		case 10:
		case 9 : System.out.println("A학점"); 
		break;
		case 8 : System.out.println("B학점");
		break;
		case 7 : System.out.println("C학점");
		break;
		case 6 : System.out.println("D학점");
		break;
		default : System.out.println("F학점");
		
		}
		// 학점 계산에 있어 switch문의 문제점 : 범위 지정이 불가능
		// => if문과 switch문의 혼합을 통해 해결 가능
		
		score = 115;
		if (0 <= score && score <= 100) {
			
			switch (score / 10) {
			case 10:
			case 9 : System.out.println("A학점"); 
			break;
			case 8 : System.out.println("B학점");
			break;
			case 7 : System.out.println("C학점");
			break;
			case 6 : System.out.println("D학점");
			break;
			default : System.out.println("F학점");
			}
		}
		else {System.out.println("점수 입력 오류");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
