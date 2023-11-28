package interface_;

public class Ex2 {

	public static void main(String[] args) {

		고래상어 고래상어 = new 고래상어();
		고래상어.번식();
		
		동물 동물 = 고래상어;
		
	}

}
/*
 * 고래와 상어의 특징을 추상화해 동물 인터페이스로 정의
 * 
 * 
 */

interface 동물 {
	public abstract void 번식();
}

// 헤엄칠 수 있는 특징을 갖는 인터페이스 '헤엄칠 수 있는'
interface 헤엄칠수있는 {
	public abstract void 번식();
}

// 동물을 상속받는 서브 고래와 상어 정의
// => 인터페이스간의 상속 'extends'
// => 인터페이스간의 상속은 다중상속 가능
interface 고래 extends 헤엄칠수있는, 동물 {}
interface 상어 extends 헤엄칠수있는, 동물 {}

// 고래와 상어 인터페이스를 동시에 상속받아 구현하는 서브클래스 고래상어 정의
// => 클래스에서 인터페이스 상속(구현)받을 경우 implements 키워드 사용,
//    반드시 인터페이스가 가진 추상메서드를 오버라이딩해 구현해야함
// => 복수 개의 인터페이스를 상속받을 수 있다
class 고래상어 implements 고래, 상어 {
	// 인터페이스 내에서는 슈퍼클래스(인터페이스)의 모든 메서드가 추상메서드이므로
	// 중복되는 메서드에 대한 구별없이 직접 구현하면 되기에
	// 중복된 메서드로 인한 혼란이 없다 (= '다이아몬드 상속'에서의 문제점이 사라진다)
	@Override
	public void 번식() {
		System.out.println("알을 낳아 번식");
		
	}
	
}

// ================다이아몬드 상속===============================
/*
 * 번식() 메서드를 갖는 슈퍼클래스 동물 클래스를 정의하고 
 * 고래 상어 클래스에서 동물 클래스 상속받기
 *  
 */
abstract class 동물2 {
	public abstract void 번식();
}

class 상어2 extends 동물2{

	@Override
	public void 번식() {
		System.out.println("알 낳아 번식");
		
	}
	
}

class 고래2 extends 동물2 {

	@Override
	public void 번식() {
		System.out.println("새끼 낳아 번식");
		
	}
	
}

// 다중 상속을 허용할 경우 발생하는 문제점
// 고래, 상어 두 클래스를 동시에 상속받는 고래상어 클래스 정의
//class 고래상어2 extends 고래2,상어2 {
	// 외부 또는 내부에서 고래와 상어클래스가 공통적으로 갖는 
	// 번식() 메서드를 호출하게 되면 어느 객체의 번식() 메서드를 호출하는지 분명하지 않기에
	// 자바에서 다중 상속은 금지한다
//}




