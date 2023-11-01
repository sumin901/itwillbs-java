
public class Num2 {

	public static void main(String[] args) {
		
		Character ch = 'R';
		
		if (ch.isUpperCase(ch)) {
			System.out.println(ch + " : 대문자");
		} else if (ch.isLowerCase(ch)) {
			System.out.println(ch + " : 소문자");
		} else if (ch.isDigit(ch)) {
			System.out.println(ch + " : 숫자");
		} else {
			System.out.println(ch + " : 기타문자");
		}
		
		
	}

}
