package anonymous;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 익명 객체의 로컬 변수 사용
		 * 
		 * - 메서드의 매개변수나 로컬변수를 익명 객체 내부에서 사용할 때 제한이 있음
		 * 
		 * - 익명 객체는 메서드 실행이 종료되면 없어지는게 일반적이지만
		 *   메서드가 종료되도 계속 실행 상태에 존재할 수 있음
		 *   (ex. 익명 쓰레드 객체)
		 * 
		 * - 메서드의 매개변수나 로컬변수를 익명 객체 내부에서 사용할 때 매개변수나
		 *   로컬변수는 메서드 실행이 끝나면 스택(Stack) 메모리에서 사라지기 때문에
		 *   익명 객체에서는 지속적으로 사용할 수 없다
		 *   
		 * - 이런 문제를 해결하기 위해 자바는 컴파일 시 익명 객체에서 사용하는
		 *   매개변수나 로컬변수의 값을 익명 객체 내부에 복사해두고 사용한다
		 *   
		 * - 메서드의 매개변수나 로컬변수가 수정되어 값이 변경되면 수정된 값과
		 *   익명 객체에 복사해둔 값이 달라질 수 있기 때문에
		 *   자바가 매개변수나 로컬변수를 final로 선언할 것을 요구함
		 *   > 자바 8 이후 생략 시 자바가 자동으로 부여함
		 * 
		 * 
		 */
		
		AnonymousClass ac = new AnonymousClass();
		ac.method(1,1);
		ac.method(3, 4);
	}

}

interface Calculatable {
	public int sum();
}

class AnonymousClass {
	private int num;
	
	public void method(final int arg1, int arg2) {
		
		final int num1 = 0;
		int num2 = 0;
		
		num = 10; // 인스턴스 멤버 변수 값 변경 가능
//		arg1 = 20;		오류 : The final local variable arg1 cannot be assigned
//		arg2 = 20;
		
//		num1 = 30;		오류 : The final local variable arg1 cannot be assigned
//		num2 = 30;
		
		Calculatable cal = new Calculatable() {
			
			@Override
			public int sum() {
				int result = num + arg1 + arg2 + num1 + num2;
				// 오류 : Local variable arg2 defined in an enclosing scope must be final or
				// effectively final
				// 익명 객체에서 매개변수값 또는 로컬변수 사용 시 값의 변경이 있으면 컴파일 에러
				// 따라서 익명 객체 사용 전 값을 변경하는 부분이 없어야함
				return result;
			}
			
		};
		
		System.out.println(cal.sum());
	}
	
	
	
	
	
	
	
	
}