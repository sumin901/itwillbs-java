package operator;

public class Ex {

	public static void main(String[] args) {
		/*
		 * <산술연산자> (+, -, /, *, %)
		 * - 일반적인 사칙연산과 동일하다.
		 * - % 연산자 : 나머지 연산자(퍼센트 연산자), 나머지를 계산한다.
		 * 				e.g> 100%3 = 1
		 * 
		 * */
		
		System.out.println(287 + 24);
		System.out.println(287 - 24);
		System.out.println(287 / 24); // 몫의 값
		System.out.println(287 * 24);
		System.out.println(287 % 24); // 나머지의 값
		
		// int형 변수로 저장한 후의 계산
		
		int a = 287, b = 24;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		
		// 연산 결과를 변수에 저장 후 출력
		int c; // 변수 선언
		
		c = a + b; // 연산자들 중 대입 연산자(=)가 가장 후 순위다.
		System.out.println(c);
		System.out.println(a + "+" + b + "=" +  c);
		System.out.printf("%d + %d = %d\n", a, b, c);
		
		c = a - b;
		System.out.println(c);
		System.out.println(a + "-" + b + "=" + c );
		System.out.printf("%d - %d = %d\n", a, b, c);
		
		c = a * b;
		System.out.println(c);
		System.out.println(a + "*" + b + "=" + c);
		System.out.printf("%d * %d = %d\n", a, b, c);
		
		c = a / b;
		System.out.println(a/b);
		System.out.println(a + "/" + b + "=" + c);
		System.out.printf("%d / %d = %d\n", a, b, c);
		
		c = a % b;
		System.out.println(a%b);
		System.out.println(a + "%" + b + "=" + c);
		System.out.printf("%d % %d = %d\n", a, b, c);
		
		
	
	

	}

}
