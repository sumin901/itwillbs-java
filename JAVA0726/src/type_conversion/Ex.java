package type_conversion;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 자바에서의 데이터 타입 간의 형변환 (타입 변환)
		 * - 어떤 데이터 타입이 다른 데이터 타입으로 변환하는 것
		 * - 기본 데이터 타입 중 boolean (논리형) 타입을 제외한
		 * 	 나머지 타입간의 변환을 말한다.
		 * 
		 * 자바 데이터타입 크기 관계
		 * byte < short < int < long < float < double
		 * (    char    ) 
		 * 정수 타입보다 실수 타입이 무조건 큰 타입으로 취급한다.
		 * 
		 * 1. 자동 형변환 (= 묵시적 형변환 = 암시적 형변환)
		 *  - 작은 데이터 타입의 데이터를 큰 데이터 타입으로 변환하는 것
		 *  - 자바 컴파일러에 의해 자동으로 형변환이 일어난다.
		 *    >> 아무런 문제가 생기지 않는다.
		 *  e.g> byte -> int -> long -> float -> double (O)
		 *  
		 *  
		 * 2. 강제 형변환(= 명시적 형변환)
		 *  - 큰 데이터 타입 데이터를 작은 데이터 타입으로 변환하는 것
		 *  - 작은 데이터 타입 허용치보다 커서 Overflow(넘침)가 발생할 수 있다.
		 *    > 따라서 자바 컴파일러가 자동으로 형변환을 수행하지 않는다.
		 *    	(코드 상에 오류가 발생)
		 *  - 반드시 우변의 데이터 앞에 '형변환 연산자'를 사용해
		 *    강제 형변환을 수행한다. e.g> a1 = (int) a2;
		 *  - 강제 형변환 이후 오류가 없더라도 데이터는 원본 데이터와 다를 수 있다.
		 *    > Overflow issue, 형변환 후 책임은 개발자에게 있다.
		 *  - 작은 데이터 타입 허용치 이내의 데이터는 원본 데이터와 동일하다.
		 * 
		 * */ 
int a1 = 32768; // 큰 데이터 타입
short a2 = 32767; // 작은 데이터 타입
System.out.println("변환 전 a1(int) : " + a1 + ", a2(short) : " + a2);
System.out.printf("변환 전 a1(int) : %d, a2(short) : %d\n", a1, a2);
// -> 두 출력문은 같은 결과 값을 출력한다.

// 자동 형변환
// 작은 데이터 타입(a2) -> 큰 데이터 타입(a1)
a1 = a2; // 컴파일러에 의해 자동 형변환, 변환 후에도 원본 데이터에 영향은 없다.
System.out.printf("변환 후 a1(int) : %d, a2(short) : %d\n", a1, a2);

int b1 = 999999;
short b2 = 32767;
System.out.printf("변환 후 b1(int) : %d, b2(short) : %d\n", b1, b2);

// b2 = b1; >> 오류, 큰 데이터 타입 -> 작은 데이터 타입은 자동 형변환 불가(Overflow 위험)
// 강제 형변환, 형변환 연산자 사용 (우변의 데이터 앞 (데이터타입)을 명시한다.)
b2 = (short) b1;
System.out.printf("변환 후 b1(int) : %d, b2(short) : %d\n", b1, b2);

int c1 = 100;
// short c2 = c1; >> 오류, 큰 데이터 타입의 데이터가 작은 데이터 타입의 허용 범위 내라도
short c2 = (short)c1;
System.out.printf("변환 후 c1(int) : %d, c2(short) : %d\n", c1, c2);
// 범위 내의 데이터 값이기 때문에 Overflow 문제 없다.

int d1 = 100;
double d2 = 3.14;
// d2 = d1; >> 오류, int보다 double이 더 큰 데이터 타입이라 자동 형변환
d2 = d1;
System.out.println("변환 후 d1(int) : " + d1 + ", d2(double) : " + d2);

// long(8Byte) vs float타입(4Byte)
long l = 100L;
float f = l; // float f = l; >> 오류 발생하지 않는다. = float >> long
// l = f; 오류 발생.
l = (long)f; // 강제 형변환. 형변환 연산자 long 사용


		
		
		
		
	}

}
