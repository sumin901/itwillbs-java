package math_class;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 	java.lang.Math 클래스
		 * 	- 수학적인 다양한 기능을 
		 * 
		 * 
		 * 
		 */
		
		System.out.println("PI 값 : " + Math.PI);
		
		int num = -10;
		
		System.out.println("num의 절대값 : " + Math.abs(num));
		
		System.out.println("num과 20 중 큰 값 : " + Math.max(num, 20));
		System.out.println("num과 20 중 작은 값 : " + Math.min(num, 20));
		System.out.println("4의 제곱근 : " + Math.sqrt(4.0));
		
		double dNum = 3.1415926535;
		System.out.println(Math.ceil(dNum)); 	// 소수점 첫째자리 올림
		System.out.println(Math.floor(dNum)); 	// 소수점 첫째자리 내림
		System.out.println(Math.round(dNum));	// 소수점 첫째자리 반올림(리턴값 : 정수(int))
		
		/*
		 * round() : 항상 소수점 첫째자리에서 반올림을 수행한다
		 * x번째 반올림 수행을 위해서는 x번째 숫자를 첫째자리로 위치하게하고 round()메서드를 수행한다
		 * => 10^(x-1)=Math.pow(10,x-1)을 곱한 후 수행하고 다시 나눈다
		 * 
		 */
		System.out.println(Math.round(dNum*1000));
		System.out.println(Math.round(dNum*1000)/1000.0); // 결과 : 3, Math.rount()의 리턴 long타입 / 1000 int타입 , 둘 중 하나라도 double타입으로 변환한다
		
		// 특정 위치의 숫자까지만 남기고 나머지는 제거해야 할 경우
		// ex) 3.141592의 소수점 넷째까지만 남길 경우 3.1415
		// 3.141592 => 31415.92 => 31415.0 => 3.1415
		System.out.println(Math.floor(dNum*10000));
		System.out.println(Math.floor(dNum*10000)/10000);
		
	}

}
