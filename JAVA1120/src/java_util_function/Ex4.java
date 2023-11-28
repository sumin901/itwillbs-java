package java_util_function;

import java.util.function.DoubleBinaryOperator;
import java.util.function.UnaryOperator;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 
		 * 자바에서 제공하는 함수형 인터페이스 java.util.function 패키지
		 * 
		 * 						파라미터		리턴
		 * - Consumer 계열 			O			  X
		 * - Supplier 계열			X			  O
		 * - Function 계열			O			  O
		 * - Operator 계열			O			  O
		 * - Predicate 계열			O			  boolean
		 * 
		 * 
		 * 4. Operator 계열
		 * : 파라미터, 리턴 모두 존재 
		 *	 Function 계열과 차이점은 매개변수 타입이 곧 리턴타입이 된다
		 *   매개변수를 전달받아 "연산" 후 같은 타입을 리턴할 때 사용한다
		 *   
		 *    
		 */

		// <Type T> 인자를 받고 동일한 제너럴 타입의 객체를 리턴하는 함수형 인터페이스
		UnaryOperator<Double> opl = x -> Math.pow(x, 2);
		
		System.out.println(opl.apply(10.0));
		
		UnaryOperator<Double> op2 = t -> Math.pow(t, 2);
			
		// Double 타입의 파라미터를 입력받아 Double 리턴
		DoubleBinaryOperator op3 = new DoubleBinaryOperator() {
			
			@Override
			public double applyAsDouble(double left, double right) {
				// TODO Auto-generated method stub
				return Math.pow(left, right);
			}
		};
		
		System.out.println("-------------------------");
		System.out.println(op3.applyAsDouble(100, 2));
		
		DoubleBinaryOperator op4 = (x,y) -> Math.pow(x, y);
		System.out.println(op4.applyAsDouble(100, 2));
		
		
		
		
	}

}
