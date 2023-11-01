package operator;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 문자열에 대한 덧셈 연산자 = 연결(결합) 연산자
		 * - 데이터를 문자열과 덧셈 연산자로 연산할 경우 
		 *   산술 연산의 덧셈이 아닌 단순 문자열 결합(연결)으로 사용됨.
		 *   이때, 데이터를 문자열 타입으로 변환해 두 문자열을 연결한다.
		 *   ex) "문자열" + "문자열" = "문자열 + 문자열" = "문자열문자열"
		 *       "문자열" + int = "문자열"+ "int" = "문자열int"
		 *        
		 */ 
		int a = 10, b = 20;
		System.out.println(a+b);
		System.out.println("a"+"b");
		System.out.println("a"+b);
		System.out.println(a+"가나다"+b);
		System.out.println(b+"가나다"+a);
		
		String str = "a = " + a;
		System.out.println(str);
		
		int c = a + b;
		System.out.println(a + " + " + b + " = " + c);
		// a + " + " >> "10 + " 문자열 생성
		// "10 + " + b >> "10 + 20" 문자열 생성
		// "10 +  20" + " = " >> "10 + 20 = " 문자열 생성
		// "10 + 20 = " + c >> "10 + 20 = 30" 문자열 생성
		
		System.out.println(10 + 20);
		System.out.println("10" + 20);
		System.out.println(10 + "20");
		
		System.out.println(10 + "20" + 30);
		System.out.println("10" + 20 + 30);
		System.out.println(10 + 20 + "30"); // 결과 : 3030 >> 기본적인 연산 순서는 왼쪽>오른쪽
		
		// String 타입 변수 name에 자신의 이름 저장
		// int 타입 변수 age에 자신의 나이 저장
		String name = "윤수민";
		int age = 26;
		System.out.println(age+name);
		
		// 주민등록번호 표현 시,
//		int jumin = 960717-111111 >> 뺄셈 취급
//		int jumin = 960717111111 >> int 타입 범위 초과
//		long jumin = 960717111111L; long 타입 (O)
		String jumin = "960717-111111"; // 문자열 취급
		
		// 이름, 나이, 주민등록번호 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민등록번호: " + jumin );
	}

}
