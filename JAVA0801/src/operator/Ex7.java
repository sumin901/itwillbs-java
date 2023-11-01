package operator;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * 증감 연산자(++, --)
		 * - 단항 연산자
		 * - 수치 데이터 타입의 피 연산자 앞 또는 뒤에 사용한다.
		 *   해당 피 연산자의 값을 1만큼 증가 또는 감소 시키는 연산자.
		 * - 다른 연산과 결합해 사용할 때, 위치에 따라 결과가 다르다.
		 * 
		 * 1. 선행 연산자(전위 연산자)
		 *    - 피 연산자 앞에 위치해 값을 1만큼 증가 또는 감소시킨다.
		 *      이때, 다른 연산과 결합하여 사용하는 경우
		 *      먼저 값을 1 증감 시킨 후 다른 연산에 참여한다.
		 *    ex) ++a, --a
		 * 
		 * 2. 후행 연산자(후위 연산자)
		 *    - 피 연산자 뒤에 위치해 값을 1만큼 증가 또는 감소시킨다.
		 *      이때, 다른 연산과 결합하여 사용하는 경우
		 *      먼저 다른 연산에 참여시킨 후 값을 1 증감 시킨다.
		 *    ex) a++, a--
		 */

		// 정수 a의 값을 1만큼 증가시킨다.
		byte a = 10;
		
		// 1. 일반적인 산술 연산자와 대입 연산자를 사용한다.
//		a = a+1; >> 형변환 오류, byte + int = int + int = int 
		a = (byte)(a+1); // 강제 형변환
		a += 1; // 형변환 불 필요
		// 2. 증감 연산자를 사용한다.
		a++; // 형변환 불 필요
		System.out.println(a);
		
		int b = 5;
		b++; // 변수 b의 값을 1만큼 증가. 5 -> 6
		System.out.println(b);
		++b; // 변수 b의 값을 1만큼 증가. 6 -> 7
		System.out.println(b);
		b--; // 변수 b의 값을 1만큼 감소. 7 -> 6
		System.out.println(b);
		--b; // 변수 b의 값을 1만큼 감소. 6 -> 5
		System.out.println(b);
		System.out.println("======================");
		
		// * 증감 연산자 위치에 따른 연산 과정의 차이
		int x1 = 5;
		int y1 = ++x1; // 선행 연산자, 전위 연산자
		// 변수 x1의 값을 먼저 1 증가 시킨 후, y1에 대입한다.
		// >> x1 : 5 -> 6, y1 = 6(x1)
		System.out.println(x1 + "," + y1);
		
		int x2 = 5;
		int y2 = x2++; // 후행 연산자, 후위 연산자
		// 변수 x2의 값을 먼저 y2에 대입 한 뒤, 1 증가 시킨다.
		// >> y2 = 5(x2), x2 : 5 -> 6
		System.out.println(x2 + "," + y2);
		
		// 대입 연산자와 결합 대신 출력문에서 또한 사용 가능하다.
		x2 = 5;
		
		System.out.println(++x2); // x2의 값을 먼저 증가 시킨 후, 출력
		System.out.println(x2++); // x2의 값을 먼저 출력 시킨 후, 증가
		// 위의 과정에서 6이 출력된 후 6 -> 7로 증가됨. 
		System.out.println(x2); // 따라서 7이 출력된다.
		
		
		
	}

}