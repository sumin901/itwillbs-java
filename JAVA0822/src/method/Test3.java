package method;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(sum(100,200));
		
		
		
		
		System.out.println(calculate('-',11,32));
		
		
		
		
		
			
		} // main
	
	// 5. 파라미터가 2개 이상인 메서드 호출의 연습

	// 정수 2개를 전달하면 두 정수의 합을 리턴하는 메서드를 호출하고 리턴값 출력 
	// ( ex. 10, 20 전달 시 10 + 20 결과인 30을 리턴하라)

	public static int sum (int a , int b) {
		int sumNum = 0;
		
		sumNum = a + b;
		System.out.print(a + " + " + b + " = ");
		
		return sumNum;

	}	
	
	
	// => 연산자 문자 1개와 정수 2개를 전달하면
			// 	  두 정수에 대한 어떤 연산을 수행 후 
			//    결과 값을 리턴하는 매서드를 호출하고 리턴하는 값을 출력하라
			
			//    ex) '+', 10, 20 전달 시 10 + 20 의 결과 30을 리턴
			//        '-', 20, 10 전달 시 20 - 10 의 결과 10을 리턴
		
		
	public static int calculate (char x, int y, int z) {
		if ( x == '+') {
			System.out.printf("%d %c %d = %d\n",y,x,z,y+z);
			return y+z;
		}
		else if ( x == '-') {
			System.out.printf("%d %c %d = %d\n",y,x,z,y-z);
			return y-z;
		} else {
			System.out.println("연산자가 올바르지 않습니다.");
			return 0;	
		}
		
		// 만약 return result; 를 하고싶다면
		// 변수값 초기화가 필수다.
		
		
		
	}

	
	
	
	
	
	
	
	
}
