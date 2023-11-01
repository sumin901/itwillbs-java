package wrapper_class;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * char 타입 배열 (chArr)에 'A', 'b', '5', '공백', '#' 문자 5개 저장 
		 * 반복문을 활용해 각각의 문자에 대한 판별 수행하여 결과 출력한다.
		 * (대문자, 소문자, 숫자, 기타 문자에 대한 판별을 수행하고 출력한다)
		 *  
		 */

		char[] chArr = {'A', 'b', '5', ' ', '#'};
		for(int i = 0; i < chArr.length; i++) {
			char ch = chArr[i];
			if(Character.isUpperCase(ch)) {
				System.out.println("chArr " + i +"번 '" + chArr[i] +"' = 대문자");
			} else if (Character.isLowerCase(ch)) {
				System.out.println("chArr " + i +"번 '" + chArr[i] +"' = 소문자");
			} else if (Character.isDigit(ch)) {
				System.out.println("chArr " + i +"번 '" + chArr[i] +"' = 숫자");
			} else {
				System.out.println("chArr " + i +"번 '" + chArr[i] +"' = 기타 문자");
			}
		}
	}

}
