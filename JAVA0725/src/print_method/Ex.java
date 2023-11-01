package print_method;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 화면에 데이터를 출력하는 print(), printf(), println() method
		 * - system.out.XXXX() method 형태로 사용.
		 * 1. println() method
		 * : 소괄호 () 내부에 출력할 데이터를 전달하면 화면에 출력한다.
		 * 화면에 데이터를 출력한 뒤 줄바꿈 수행
		 * = 출력 후 엔터 키를 입력한 것과 동일한 결과
		 * 아무런 데이터도 전달하지 않을 경우 단순 줄바꿈 기능을 수행한다.
		 * 
		 * */
System.out.println(1);
System.out.println(3);
System.out.println(2);
int age = 28;
System.out.println("나이는 age세 입니다.");
// age가 문자열로 취급받는다.
// age 라는 변수를 사용해 데이터를 활용해야하는 경우
// 문자열 바깥에 '+' 기호를 사용하여 변수를 문자열에 '연결'해야한다.
System.out.println(); // 줄바꿈 기능 수행한다.
System.out.println("나이는 " + age + "세 입니다.");

		/*
		 * 2. print() method
		 * 소괄호 () 내부에 출력할 데이터를 전달하면 화면에 출력한다.
		 * 화면에 데이터를 출력한 뒤에 줄바꿈을 수행하지 않는다.
		 * () 내부에 아무런 데이터를 전달하지 않을 경우 오류 발생한다.
		 *
		 */
System.out.print("Hello, World!");
System.out.print("안녕");
System.out.println();
System.out.print("Hello, World!");
System.out.print("안녕");
System.out.print("1");
//System.out.print(); >> 오류
		/*
		 * 3. printf() method
		 * - 출력할 데이터가 변수 및 여러가지 타입이 복합적으로 사용될 경우
		 *   출력할 데이터의 모양을 유지하기 위한 용도로 사용한다.
		 * - 소괄호() 내부에 출력할 데이터를 전달하면 화면에 출력한다.
		 *   데이터를 출력한 뒤 줄바꿈을 수행하지 않는다.
		 *   아무런 데이터도 전달하지 않을 경우 오류
		 *   <특징>
		 *   소괄호() 내부에 문자열 데이터를 첫번째로 사용하고
		 *   화면에 출력할 데이터 형식을 문자열 내부에서 지정한다.
		 *   이 때, 변수 등을 사용할 경우 해당 변수가 표시될 자리를
		 *   '형식 지정 문자'를 사용해 표시만 하고,
		 *   문자열이 끝난 후 콤마(,) 기호 뒤에 형식 지정 문자에 들어갈 데이터를 명시한다.
		 *   e.g> printf("출력할 데이터 형식", 데이터1, 데이터2, 데이터3...
		 *   
		 *   
		 * */
System.out.printf("Hello, Wolrd.");
System.out.printf("윤수민");
//System.out.printf(1); >> 오류
System.out.printf("%d", 1);
		/*
		 * 형식 지정 문자를 사용한 printf() method
		 * %d : 10진수 1개 표현
		 * %nd : n자리 수 만큼의 자리를 차지한다.
		 * %0nd : n자리 수 만큼의 자리를 차지하고, 빈자리는 0으로 채운다.
		 * e.g> printf("%02d", 2) -> 02
		 * %f : 실수 표현
		 * %.xf : 실수 표현 (소수점 x 자리만큼만 표시)
		 * %c : 문자 표현
		 * %s : 문자열 표현
		 * 
		 *\n : 줄 바꿈, \t : tap
		 * */
System.out.println();
System.out.printf("나이는 %d세 입니다.\n", 28);
System.out.printf("나이는 %d세 입니다.", age);
System.out.println();
		float temp = 31.3f;
System.out.printf("오늘의 기온은 %3.1f도씨 입니다.\n", temp);
System.out.printf("현재 시각은 \n%d시 %d분 %02d초입니다.", 12, 16, 01);
System.out.println();
System.out.printf("오늘 날짜는\n%02d년 %02d월 %02d일입니다.\n", 23, 7, 25);
			// %d 가 3개있어 데이터 3개를 순차적으로 대입한다.
System.out.println();
System.out.printf("평균 나이는 %.1f세입니다.\n", 27.50);
				// 소수점 한 자리까지만 표시하라.
				// 소수점 n 자리까지만 표시하라 = %.nf

// %c : 문자 표현
// char 타입 변수 ch 에 문자 'r' 저장
System.out.printf("정수 65에 해당하는 문자는 %c입니다.\n", 'A');

char ch = 'r';
System.out.printf("%c\n", ch);

// %s : 문자열 표현
// String 타입 변수 str에 문자열 "부산 서면" 저장
String str = "부산 서면";
System.out.printf("현재 위치한 장소:%s\n", str);



	}

}
