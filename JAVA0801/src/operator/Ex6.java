package operator;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * 논리 연산자 (&&, ||, !, ^)
		 * - 두 피 연산자의 논리적인 판별을 수행하는 연산자
		 * - 피 연산자 모두 boolean 타입 데이터(true, false)만 입력 가능하다.
		 *   결과 값 또한 boolean 타입으로 return한다.
		 *   
		 *   <AND 연산자> (&, &&) - 논리 곱
		 *   - 두 피 연산자가 모두 true일 경우에만 결과 값이 true.
		 *     하나라도 false일 경우 결과 값이 false.
		 *   ex) f AND f = f, f AND t = f, t AND f = f, * t AND t = t
		 *   - 그리고 ~이고 등의 접속사에 해당하는 의미로 사용한다.
		 *     >> A 와 B 사이의 범위를 판별하는데 사용한다.
		 *     ex) A가 5보다 크고 10보다 작다.
		 *  
		 *   <OR 연산자> (|, ||) - 논리합
		 *   - 두 피 연산자 중 하나라도 true일 경우, return 값 = true
		 *     둘 다 false일 경우, return 값 = false
		 *   - f OR f = f, f OR t = t, t OR f = t, t OR t = t
		 *   - 또는, ~이거나 등의 접속사에 해당하는 의미로 사용한다.
		 *   ex) 주로 A 조건 또는 B 조건 중 하나라도 만족하는 값을 구할 때 사용한다.
		 *   
		 *   <NOT 연산자> (!) - 논리부정
		 *   - 단항 연산자, 피 연산자 앞에 '!' 기호를 붙인다.
		 *   - 현재 boolean 값을 반대로 반전한다.
		 *   - !true = false, !false : true
		 *   
		 *   <XOR 연산자> (^) - 배타적 논리합(exclusive OR)
		 *   - 두 피 피연산자가 서로 다를 경우 return 값이 true,
		 *     서로 같은 경우 return 값이 false
		 *   ex) F XOR F = F, F XOR T = T, T XOR F = T, T XOR T = F
		 *   
		 */

		boolean a = false;
		boolean b = true;
		
		System.out.println("AND(%%) 연산 진리표");
		System.out.println("a(false) && a(false) = " + (a&&a));
		System.out.println("a(false) && b(true ) = " + (a&&b));
		System.out.println("b(true ) && a(false) = " + (b&&a));
		System.out.println("b(true ) && b(true ) = " + (b&&b));
		// * && = *, true = 1, false = 0 으로 생각하면 논리곱의 의미를 알 수 있다.
		
		System.out.println();
		System.out.println("a(false) & b(true ) = " + (a&b));
		
		// * && 와 &의 차이 : &&의 연산은 선행 피 연산자가 false일 때, 뒤 피 연산자를 따지지 않고 false 값을 return
  		//					   &의 연산은 모두 따진 후 값을 return 한다. 
		
		System.out.println("OR(||) 연산 진리표");
		System.out.println("a(false) || a(false) = " + (a||a));
		System.out.println("a(false) || b(true ) = " + (a||b));
		System.out.println("b(true ) || a(false) = " + (b||a));
		System.out.println("b(true ) || b(true ) = " + (b||b));
		
		System.out.println("NOT(!) 연산 진리표");
		System.out.println("!a(false) = " + !a);
		System.out.println("!b(true ) = " + !b);
		
		System.out.println("XOR(^) 연산 진리표");
		System.out.println("a(false) ^ a(false) = " + (a^a));
		System.out.println("a(false) ^ b(true ) = " + (a^b));
		System.out.println("b(true ) ^ a(false) = " + (b^a));
		System.out.println("b(true ) ^ b(true ) = " + (b^b));
		System.out.println("======================================");
		
		// 관계 연산자와 결합하여 대소 관계에 대한 논리적인 판별 확인이 가능하다.
		int num = 1;
		// 두 가지 관계 연산을 각각 적용할 경우, 각 연산자에 대한 결과만 판별한다.
		System.out.println(num > 5); // false
		System.out.println(num < 10); // true
		// 만약 두 가지 관계 연산을 하나로 결합하여 적용할 경우
		// ex) num이 5보다 크고 10보다 작은 가?
		System.out.println(num > 5 &&  num < 10); // false
		
		// ex) num 이 5보다 작거나 100보다 큰 가?
		System.out.println(num < 5 || num > 100);
		
		num = 150;
		// NOT 연산자(!)는 현재 조건을 만족하지 않는가를 판별할 수 있다.
		// ex) num이 0보다 작거나 100보다 큰 수가 아닌 가?
//		     => num이 0이상 100이하인 수 인가
		System.out.println(!(num < 0 || num > 100));
		System.out.println(num >= 0 && num <=100); // 위와 똑같다.
		
		
		
	}

}
