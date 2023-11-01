package switch_;

public class Ex2 {

	public static void main(String[] args) {
		
		/*
		 * 입력받은 월(month)이 다음과 같을 때 월의 일수를 출력하라
		 * 1, 3, 5, 7, 8, 10, 12월 : "한 달은 31일" 출력
		 * 4, 6, 9, 11월		   : "한 달은 30일" 출력
		 * 2월 					   : "한 달은 28일" 출력
		 */
		int month = 11;
		switch(month) {
		case 1 : System.out.println(month + "월 한달은 31일"); break;
		case 3 : System.out.println(month + "월 한달은 31일"); break;
		case 5 : System.out.println(month + "월 한달은 31일"); break;
		case 7 : System.out.println(month + "월 한달은 31일"); break;
		case 8 : System.out.println(month + "월 한달은 31일"); break;
		case 10 : System.out.println(month + "월 한달은 31일"); break;
		case 12: System.out.println(month + "월 한달은 31일"); break;
		case 4 : System.out.println(month + "월 한달은 30일"); break;
		case 6 : System.out.println(month + "월 한달은 30일"); break;
		case 9 : System.out.println(month + "월 한달은 30일"); break;
		case 11 : System.out.println(month + "월 한달은 30일"); break;
		case 2 : System.out.println(month + "월 한달은 28일"); break;
		}
		
		month = 11;
		switch(month) {
		case 1 : // 결과값이 1, 3, 5, 7, 8, 10, 12 일 때
		case 3 : // 모든 case 문에서 같은 문자열을 출력하는데
		case 5 : // 출력문이 중복이므로 각 case문에서 모두 출력하지않고
		case 7 : // 마지막 case문에서만 출력하고 나머지는 비워두면
		case 8 : // break 문이 없으므로 case 12까지 도달한 후 출력문을 실행한다
		case 10 : // 정돈 => case1: case2: case3: ...
		case 12: System.out.println(month + "월 한달은 31일"); break;
		case 4 : 
		case 6 : 
		case 9 : 
		case 11 : System.out.println(month + "월 한달은 30일"); break;
		case 2 : System.out.println(month + "월 한달은 28일");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
