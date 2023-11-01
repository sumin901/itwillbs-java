package wrapper_class;

public class Test4_2 {

	public static void main(String[] args) {
		/*
		 * 문자열(패스워드)을 char[] 배열에 분리해 저장 후
		 * 해당 패스워드에 대한 안전도 검사(패스워드 복잡도 검사)
		 * - 배열 내의 각 문자에 대해 다음 사항을 판별해 해당되는 항목이 있을 경우 점수를 증가시키고
		 *   해당 점수에 따라 안전도 레벨을 출력한다
		 *   
		 * 1) 대문자 포함 : +1
		 * 2) 소문자 포함 : +1
		 * 3) 숫자   포함 : +1
		 * 4) 특수문자 '!': +1
		 * 안전도 점수 4점 : 안전 // 3점 : 보통 // 2점 : 위험 // 1점 : 사용 불가 ! 출력
		 * 
		 * 
		 */
		safetyCheck("1aA!as"); // 내가 한 방식 : 문자열 전체 기준으로 판별하는 방식 
		// 진석쌤 방식 : 문자열 인덱스 개별로 각각 판별하는 방식
		Boolean isUpperCase = false;
		Boolean isLowerCase = false;
		Boolean isDigit = false;
		Boolean isSpec = false;
		String password = "12";
		char[] arr = password.toCharArray();
		for(char ch : arr) {
			if(Character.isUpperCase(ch)) {
				isUpperCase = true;
			} else if (Character.isLowerCase(ch)) {
				isLowerCase = true;
			} else if (Character.isDigit(ch)) {
				isDigit = true;
			} else if (ch == '!') {
				isSpec = true;
			}
		}
		int safetyLevel2 = 0;
		if(isUpperCase) safetyLevel2 += 1;
		if(isLowerCase) safetyLevel2 += 1;
		if(isDigit) safetyLevel2 += 1;
		if(isSpec) safetyLevel2 += 1;
		
		switch(safetyLevel2) {
		case 4: System.out.println("패스워드 안전도 : 안전2");
		break;
		case 3: System.out.println("패스워드 안전도 : 보통2");
		break;
		case 2: System.out.println("패스워드 안전도 : 위험2");
		break;
		case 1: System.out.println("패스워드 사용불가!2");
		break;
		}
		
		
	}
	
	public static void safetyCheck (String str) {
		int countUpper = 0;
		int countLower = 0;
		int countDigit = 0;
		int countElse = 0;
		int safetyLevel = 4;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				countUpper += 1;
			} else if (Character.isLowerCase(ch)) {
				countLower += 1;
			} else if (Character.isDigit(ch)) {
				countDigit += 1;
			} else if (ch == '!') {
				countElse += 1;
			}
		}
		if (countDigit == 0) {
			safetyLevel -= 1;
		} 
		if (countElse == 0) {
			safetyLevel -= 1;
		}
		if (countLower == 0) {
			safetyLevel -= 1;
		}
		if (countUpper == 0) {
			safetyLevel -= 1;
		}
		
		switch(safetyLevel) {
		case 4: System.out.println("패스워드 안전도 : 안전");
		break;
		case 3: System.out.println("패스워드 안전도 : 보통");
		break;
		case 2: System.out.println("패스워드 안전도 : 위험");
		break;
		case 1: System.out.println("패스워드 사용불가!");
		break;
		
		}
		
		
		
	}
	
	

}
