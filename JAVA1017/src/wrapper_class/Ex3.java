package wrapper_class;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 문자열 -> 기본 데이터타입으로 변환
		 * 
		 * 	- 주로 웹 form 태그의 input 태그로 데이터를 입력받거나
		 *    자바, 안드로이드 등의 GUI 환경에서 데이터를 입력받을 때
		 *    수치 데이터를 입력하더라도 모두 문자열로 취급
		 *    => 해당 문자열을 실제 연산하기 위해 기본 데이터타입으로 변환하려면,
		 *       Wrapper 클래스에서 제공하는 메서드를 통해 변환을 수행
		 *       
		 *       
		 *       
		 *       	< 기본 문법 규칙 >
		 *       
		 *	Wrapper클래스명.parse기본데이터타입명(문자열변수 또는 데이터)
		 *	=> ex. 정수형으로 변환 : Integer.parseInt()
		 *	       실수형          : Integer.parseDouble()
		 * 
		 *  
		 */
		String strNum = "100.0";
//		int iNum = Integer.parseInt(strNum);
//		String 타입 문자열 실수 -> int형으로 변환 시
//		실제 데이터가 실수이므로 정수형으로 변환 불가능
//		문법적으론 문제가 없지만, 실행 시점에서 오류 발생
//		=> NumberForamtException 예외 발생
//		int i = 100.0; 오류와 동일함
		
		double dNum = Double.parseDouble(strNum);
		System.out.println(dNum);
		
//		기본 데이터타입이 아닌 Wrapper 클래스 타입으로의 변환
		Double dNum2 = new Double(strNum); // 생성자에 문자열 전달
		System.out.println(dNum2);
		
		strNum = "1234";
//		int형 변수 iNum에 문자열 "1234" 변환 후 저장
		int iNum = Integer.parseInt(strNum);
		System.out.println(iNum);
				
		
		
		
	}

}
