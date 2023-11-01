package operator;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 산술 연산 시 자동 형변환
		 * - 연산 수행 시 피연산자끼리의 데이터 타입을 일치 시킨 후 연산을 수행한다.
		 * 
		 * 규칙 1. int 타입보다 작은 타입(byte, short, char) 끼리의 연산은
		 * 		   모두 int 타입으로 변환 후 수행한다. 
		 * 		   >> 결과 값은 int 타입이다.
		 * 		   e.g> byte + byte = (int)byte + (int)byte = int + int = int
		 * 		   e.g> char + int = (int)char + int = int + int = int
		 * 
		 * 규칙 2. int 타입보다 큰 타입과의 연산, 큰 타입으로 변환 후 수행한다.
		 * 		   >> 결과 값은 무조건 큰 타입이다.
		 * 		   e.g> int + long = (long)int + long = long + long = long
		 * 		   e.g> long + float = (float)long + float = float + float = float
		 * 
		 * 
		 * */ 

		byte b1 = 10;
		byte b2 = 20;
		byte b3;
		
		// b1과 b2의 연산 결과를 byte 타입 변수 b3에 저장할 때 문제가 발생한다.
		// b3 = b1 + b2; >> 오류, b1 + b2 의 결과 값은 int 타입인데 b3는 byte로 선언했기 때문.
		// b3 = (byte)b1 + (byte)b2 = (int)(byte)b1 + (int)(byte)b2 = int + int = int
		b3 = (byte)(b1 + b2); // 연산 결과에 형변한 연산자를 적용하여 byte 타입으로의 변환
							  // = (byte)(int+int) = (byte)(int) = byte
		System.out.println(b3);
		
		// short s = b1 + b2; >> 오류 발생
		short s = (short)(b1+b2);
		System.out.println(s);
		
		char ch = 'A';
		
		// char 타입 변수 ch2에 ch 값에 2를 더한 결과를 저장해본다.
		// char ch2 = ch + 2; >> 오류 = char + int = (int)char + int = int + int = int
		char ch2 = (char)(ch + 2);
		// >> (char)('A' + 2) = (char)(65+2) = (char)67 = 'C'
		System.out.println(ch + 2);
		System.out.println(ch2);
		System.out.println((char)(ch2+2));
		
		int i = 100;
		long l = 200L;
	
		// int형 변수 i2에 i + l 결과 값을 저장해본다.
		// int i2 = i + l; >> int + long = long 이므로 오류
		
		int i2 = (int)(i+l); // int로 강제 형변환
		System.out.println(i2);
		
		float f = 3.14f; // 3.14f  = (float)3.14
		// long l2 = l + f; >> long + float = float 
		long l2 = (long)(l+f);
		System.out.println(l2);
		
		System.out.println(3/2);
		// 나눗셈 연산은 몫을 계산해 int 값을 출력한다. >> int/int = int
		// 연산 결과 값을 실수 형태로 얻고싶을 경우, 최소한 피연산자 중 하나를 실수로
		// 형변환한다. >> 규칙 2.에 따라 int형 보다 큰 데이터 타입을 따라간다.
		System.out.println((double)3/2);
		System.out.println(3/2.0);
		// 주로 수치 데이터 값에 .0을 붙여 실수로 변환하고
		// 실수형 변수는 형변환 연산자로 변환을 한다.
		System.out.println(l/(double)l2);
		
		// 실수끼리의 연산 (float과 double간의)
		float f1 = 0.1f;
		double d1 = 0.1;
		System.out.println(f1 + d1); // 오류는 아니지만 결과 값이 이상하
		// >> float -> double, double + double = double이 된다.
		// 따라서 0.1f + 0.1 = 0.1 + 0.1 = 0.2가 정상값이지만
		// 근사치 표현에 의해 잘못된 결과가 발생할 수 있다.
		// double -> float 타입으로 강제 변환 후 연산을 수행하거나
		// 두 실수 모두 정수로 변환하여 연산 수행 후 다시 실수로 변환한다.
		System.out.println(f1 + (float)d1);
		System.out.println(((int)(f1*10) + (int)(d1*10)) / 10.0);
		
		// 리터럴끼리 연산시에는 자동 형변환이 발생하지 않는다.
		byte b4 = 10 + 20;
		System.out.println(b4);
		
		// 단, 리터럴끼리의 연산이라도 표현 가능 범위를 초과하면 오류 발생.
		// byte b5 = 10 + 200; >> byte 타입 범위를 초과해 결과 값이 int로 변환된다.
	
		
		
		
	}

}
