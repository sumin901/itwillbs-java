package enum_type;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * enum 상수 연산 및 메서드
		 * 
		 * - enum 상수 값은 동등빅연산자(==)로 일치 여부 비교 가능하며,
		 *   switch-case 문에서 enum 타입 비교가 가능하다
		 *   
		 * - enum 타입 상수에는 각각 ordinary(순서번호) 값이 자동 부여된다
		 *   -> 0번부터 자동 부여
		 *   -> enum 객체의 ordinal() 메서드를 통해 값을 얻을 수 있다
		 *   
		 *   
		 */
		
		EnumWeek today = EnumWeek.WEDNSEDAY;
		if (today == EnumWeek.WEDNSEDAY) {
			System.out.println("수요일");
		} else {
			System.out.println("수요일 X");
		}
		
		// enum 타입 객체는 switch 문에 전달가능
		switch(today) {
			// case문을 사용해 enum 상수를 지정하면 비교가 가능
			// 주의! enum타입명.상수 가 아니라 상수 그 자체를 비교한다
//		case EnumWeek.MONDAY : 오류 !
		case MONDAY : System.out.println("월요일"); break;
		case TUESDAY : System.out.println("화요일"); break;
		case WEDNSEDAY : System.out.println("수요일"); break;
		case THURSDAY : System.out.println("목요일"); break;
		case FRIDAY : System.out.println("금요일"); break;
		case SATURDAY : System.out.println("토요일"); break;
		case SUNDAY : System.out.println("일요일"); break;	
		
		}
		System.out.println("========================================");
		// ordinal() : 상수의 순서번호를 정수로 리턴한다
		System.out.println("오늘의 ordinal() 값 : " + today.ordinal());
		
		if(today.ordinal() < 4) {
			System.out.println("주말 언제 오나..");
		} else if (today.ordinal() == 4) {
			System.out.println("오늘은 금요일 내일부터 주말");
		} else {
			System.out.println("Zzz");
		}
		
		// name() : 상수명을 문자열로 리턴
		String strToday = today.name();
		System.out.println(strToday);
		strToday = today.toString();
		System.out.println(strToday);
		
		
	}

}
