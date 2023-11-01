package method_overloading;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩(method overloading) : 메서드의 다중 정의 
		 * 
		 * - 동일한 이름의 파라미터가 다른 메서드를 여러 번 정의하는 것
		 * - 비슷한 기능을 수행하지만, 전달받은 데이터 타입이 다른 경우 메서드 이름을 각각 따로 정의하지 않고,
		 *   동일한 이름으로 파라미터만으로 구분되는 메서드를 여러 개 정의하는 것 
		 * - *주의사항* 메서드 시그니처(이름, 리턴타입, 파라미터, 접근제한자) 
		 *              중 파라미터를 제외한 나머지는 동일하게 정의한다
		 *               => 외부에서 메서드를 호출하는 시점에 이름이 동일한 메서드 간에 전달되는 데이터(파라미터값) 만으로
		 *                  각 메서드가 구분되어야한다
		 *                  
		 *          
		 * 			< 메서드 오버로딩 규칙(택1) >
		 * 
		 * 1. 메서드 파라미터의 데이터 타입이 달라야한다
		 * 
		 * 2. 메서드 파라미터의 갯수가 달라야한다.
		 * 
		 * 
		 * 
		 * */
		NormalMethod nm = new NormalMethod();
		nm.addInt(10, 16);
//		nm.addInt(1.4, 2.6);
		
		OverLoadingMethod om = new OverLoadingMethod();
		// 오버로딩된 메서드 호출 시 파라미터를 전달하면
		// 오버로딩 메서드 중에서 파라미터가 일치하는 메서드가 자동 호출된다
		// => 단 메서드 호출 시점에서 각 메서드가 구분되야 오버로딩이 성립한다
		om.add(1.3,1.5);

	}

}

class NormalMethod {
	// 두 수를 전달받아 덧셈 결과를 출력하는 메서드 정의한다
	// 1. int형 정수 2개를 전달받을 경우
	
	public void addInt(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	// 2. double형 실수 2개를 전달받을 경우
	public void addDouble(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	// 일반적으로 메서드명도 식별자에 해당되므로 중복이 불가능하다
	// 따라서, addInt()와 addDouble() 메서드는 하는 일은 같지만, 서로 다른 파라미터를 전달받으므로
	// 다른 이름으로 정의함
	// => 메서드 정의 시 메서드명을 달리해야하므로 호출 시 구분이 불편하다
	
}

class OverLoadingMethod {
	
	// 오버로딩 기능을 활용해 두 수를 전달받아 덧셈 결과를 출력하는 메서드 정의
	// => 동일한 이름의 파라미터 타입만 서로 다른 메서드를 여러 번 저으이
	// 1. 정수 2개를 전달받아 덧셈 수행
	
	public void add(int num1, int num2) {
		System.out.println("add(int,int) 호출됨!");
		System.out.println(num1 + num2);
	}
	
	// 2. 실수 2개를 전달받아 덧셈 수행
	
	public void add(double num1, double num2) {
		System.out.println("add(double,double) 호출됨");
		System.out.println(num1 + num2);
	}
	
	// 3. 정수 3개를 전달받아 덧셈 수행
	
	public void add(int num1, int num2, int num3) {
		System.out.println("add(int, int, int) 호출됨");
		System.out.println(num1 + num2 + num3);
		
	}
	
//	*주의사항* : 파라미터의 변수명만 다를 경우 오버로딩 성립하지않는다.
	
//	public void add(int a , int b) {
//		System.out.println("add(int a, int b) 호출");
//		System.out.println(a + b);
//	}
	
//	*주의사항* : 리턴타입만 다를 경우 오버로딩 성립하지않는다.
	
//	public void add(int num1 + int num2) {
//		System.out.println("add(int,int) 호출");
//		return num1+num2;
//	}
	
	
	
	}
	
	
	
	
	




