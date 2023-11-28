package lambda;

import java.util.function.Function;

public class Ex {

	public static void main(String[] args) {

		/*
		 * 			람다식(Lambda Expressions)
		 * 
		 * - 자바 8에 추가된 가장 큰 특징
		 * 
		 * - '함수형' 프로그래밍 형태를 받아들임
		 * 	  
		 * -> 함수형 프로그램 : 
		 *    기능 위주의 프로그래밍 기법
		 *    매개변수만을 사용해 만드는 함수 (순수 함수, pure function)를
		 *    구현하고 호출함으로써 외부 자료에 부수적인 영향을 주지 않도록 구현하는 방식
		 *    
		 *    함수 이름이 없는 익명 함수를 만드는 것
		 *    메서드의 이름과 리턴타입을 빼고 '->'를 활용해 람다식을 구현한다
		 *    
		 *    ex) 	public int add(int x, int y) {
		 *    			return x+y;
		 *    } = 객체 지향형 함수
		 *    
		 *    		(int x, int y) -> { return x+y }; 
		 *      = 람다식
		 *    
		 * ! 객체 지향 : 객체를 기반으로 구현, 클래스에 속성과 기능을 정의
		 * ! 함수형 : 함수를 기반으로 자료를 입력받아 구현, 기능(함수)가 따로 존재
		 * 
		 *			< 람다식의 기본 문법 >
		 *
		 * (데이터타입 매개변수, ...) -> { 실행문, ... }
		 * 
		 * 1. 기본형
		 * (int x) -> { System.out.Println(x); }
		 * 
		 * 2. 매개변수의 타입을 추론할 수 있는 경우에는 타입 생략이 가능하다
		 * (x) -> { System.out.Println(x); }
		 * 
		 * 3. 매개변수나 실행문이 하나라면 소괄호()와 중괄호{}를 생략할 수 있다
		 *    (이 때, 세미콜론';'은 생략)
		 * x ->  System.out.Println(x)
		 *    ! 매개변수가 두 개 이상인 경우 소괄호()를 생략할 수 없다
		 * 
		 * 4. 매개변수가 없을 경우 소괄호()를 사용해야한다
		 * () -> System.out.println(x)
		 *
		 * 5. 리턴이 필요한 경우 return 키워드를 사용한다
		 *    ! return 문이 필요한 경우 중괄호{}를 생략할 수 없다
		 * (x, y) -> {return x+y;}   
		 * 6. 실행문이 단순히 return 문 하나로 표현되는 경우 
		 *    표현식만 사용할 수 있으며, 이때 리턴 값은 표현식의 결과값이다.
		 *    ! 세미콜론(;)은 사용하지않는다
		 * (x, y) -> x+y
		 * 
		 * 
		 */
		
		MaxPrintNumber mpn = new MaxPrintNumber();
		System.out.println(mpn.maxNum(1, 7));
		System.out.println("-----------------");
		
		MyNumber max = new MyNumberClass();
		System.out.println(max.getMax(13, 12));
		System.out.println("-----------------");
		
//		MyNumber max2 = (num1, num2) -> {(num1>=num2) ? num1 : num2} ;
//		오류 : The target type of this expression must be a functional interface
		
		MyNumber max2 = (a, b) -> (a >= b) ? a : b ;
		System.out.println(max2.getMax(3, 4));
	}

}

// 두 수를 입력받아 비교해 큰 수를 출력하는 메서드를 갖는 클래스
class MaxPrintNumber {
	
	public int maxNum(int num1, int num2) {
		if (num1 >= num2) {
			return num1;
		}
		if (num1 < num2) {
			return num2;
		}
		return 0;
	}
	
}

// MyNumber 인터페이스를 구현한 MyNumberClass 정의
//interface MyNumber {
//	int getMax(int num1, int num2);
//}

class MyNumberClass implements MyNumber {

	// 두 수를 입력받고 비교해 큰 수를 리턴하는 메서드
	@Override
	public int getMax(int num1, int num2) {
		if (num1 >= num2) {
			return num1;
		}
		if (num1 < num2) {
			return num2;
		}
		return 0;
	}
	
}

// 위의 getMax() 메서드를 람다식으로 표현하고자하면, 
// 함수형 인터페이스를 선언해야함 (functional Interface)

// 자바에서는 참조 변수 없이 메서드를 호출할 수 없다

// 람다식을 구현하기 위해 함수형 인터페이스를 만들고,
// 인터페이스에 람다식으로 구현할 메서드를 선언하는 형태로 사용해야한다

// ! 람다식은 하나의 메서드를 구현해 인터페이스형 변수에 대입하므로 
//   인터페이스가 두 개 이상의 메서드를 가질 수 없다.

@FunctionalInterface
interface MyNumber {
	int getMax(int num1, int num2);
	
//	int getMin(int x, int y);
//	오류 : Invalid '@FunctionalInterface' annotation; MyNumber is not a functional interface
//	함수형 인터페이스는 두 개 이상의 메서드를 가질 수 없다
}

