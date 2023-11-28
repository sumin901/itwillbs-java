package nested_class;

public class Ex2 {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		out.method();
	}

}



class Outer2 {
	private int num = 10;	// 인스턴스 멤버 변수
	
	public void method() {
		
//		LocalInner localInner = new LocalInner();
//		클래스 생성보다 이전에 위치할 수 없다
		
		class LocalInner {
			// 로컬 내부 클래스
			// : 메서드 내에서 정의, 특정 메서드에서만 사용 가능한 클래스
			String name = "LocalInner Class ";	// 로컬 내부 클래스의 인스턴스 변수
//			static int staticMember;
//			> 로컬 내부 클래스에서는 static 변수 사용할 수 없음 
			
//			public static void staticMethod() {
//			
//			}
			
			public LocalInner() {
				System.out.println("LocalInner 생성자 호출");
			}
			
			public void print() {
				System.out.println("로컬 내부 클래스의 인스턴스 멤버 메서드");
			}
		}	// LocalInner
		
		// 로컬 내부 클래스의 인스턴스 생성(일반 클래스처럼 사용 가능)
		// > 로컬 내부 클래스는 메서드 내에서 객체를 생성하고 사용해야 한다
		LocalInner localInner = new LocalInner();
		System.out.println(localInner.name);
		
		
		
	}	// method
	
}		// outer