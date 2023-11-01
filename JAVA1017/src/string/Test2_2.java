package string;

import java.util.Arrays;

public class Test2_2 {

	public static void main(String[] args) {
		/*
		 * 문자열을 char[] 배열에 분리하여 저장 후 
		 * 해당 문자열에 대한 간단한 암호화 작업을 진행한다
		 * 
		 * - 문자열을 분리하여 저장한 배열을 encrypt()에 전달
		 * - 전달받은 배열의 무낮에 대해 아스키코드 값 3만큼 증가한 문자를
		 *   별도의 배열에 저장한 후 문자열로 변환해 리턴한다
		 *   
		 *   ex) 'A'(65) => 'D'(68)
		 *   ex) "Hello" => 'H','e','l', 'l', 'o'형태의 char 배열에 저장 => 암호화
		 *        => 'K', 'h', 'o', 'o', 'r' => "Khoor" 리턴
		 */
		
		encrypt("admin123456");
		
		
	}
	
	public static void encrypt(String str) {
		// 암호화 작업 수행 메서드 encrypt()
		// 전달받은 문자 배열 내의 모든 문자 값의 아스키코드 +3 후 문자열로 리턴한다;		char[] charArr = str.toCharArray();
	char[] charArr = str.toCharArray();
	StringBuilder str2 = new StringBuilder();
		char[] charArr2 = new char[charArr.length];
		
		for(int i=0; i<charArr.length; i++) {
			charArr2[i] = (char) (charArr[i]+3);
			str2.append(charArr2[i]);
		}
		
		System.out.println(str2);
		/*
		 * 1. String 생성자 활용
		 * String str3 = new String(charArr);
		 * 
		 * 2. String.valueof() 메서드 활용
		 * String str3 = String.valueOf(charArr);
		 * 
		 * 3. StringBuffer(스레드O) or StringBuilder(스레드X)
		 * StringBuilder builder = new StringBuilder();
		 * for each문
		 * 		for(char ch : charArr) {
		 * 		 builder.append(ch);
		 * 		}
		 */
	}
	
	
}
