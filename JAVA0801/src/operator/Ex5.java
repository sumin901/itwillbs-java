package operator;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 비교 연산자(관계 연산자) (>, <, >=, <=, ==, !=)
		 * - 두 피 연산자 간의 대소 관계 등을 비교하여 true or false 값을 리턴한다.
		 * - 주의! 동등비교 연산자로 '=='를 사용한다.
		 *         '>=' 의 기호 순서는 바꿔서 사용하지 않는다. ('<=' 또한)
		 * - Return 값을 바로 사용하거나 boolean 타입 변수에 저장이 가능하다.
		 * - 서로 다른 데이터 타입끼리의 비교 시 산술 연산과 마찬가지로 동일한 타입으로 일치시킨 후 비교 연산을 수행해야한다.
		 * 
		 *          
		 */

		int a = 10, b = 5;
		System.out.println("a > b 인가? : " + (a>b));
		System.out.println("a < b 인가? : " + (a<b));
		System.out.println("a >= b 인가? : " + (a>=b));
		System.out.println("a <= b 인가? : " + (a<=b));
		System.out.println("a == b 인가? : " + (a==b));
		System.out.println("a != b 인가? : " + (a!=b));
		
		boolean result = a>b; // 결과 값이 true or false 이므로 int 타입에는 저장 불가능.
							  // a > b 의 결과 값 true or false가 result에 저장된다.
		System.out.println(result); 
		
		// * char 타입 간의 비교 시, int 타입으로 변환 후 비교 (유니코드 값 비교)
		System.out.println('A' > 'B');
		System.out.println('A' == 65);
		
		// * 주의 * double 타입과 float 타입 비교
		System.out.println(0.1 == 0.1f); // false, 같은 값이나 다른 값으로 
		System.out.println((float)0.1 == 0.1f);
		
		// 다른 연산과 관계 연산자를 결합한 연산 결과의 대소 관계 판별
		System.out.println(a + b > a - b);
		System.out.println(('A' > 'B') == ('A' == 65)); // false == true >> false
		System.out.println(('A' > 'B') != ('A' == 65)); // false != true >> true
	
		
		
		
	}
	

}
