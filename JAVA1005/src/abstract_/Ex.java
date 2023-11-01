package abstract_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 			추상 메서드(Abstract method)
		 * 
		 * 메서드 바디 {} << 가 존재하지 않는 메서드 , 미완성 메서드
		 * 
		 * 실행 코드가 없어 실행 될 수 없는 메서드
		 * 
		 * 메서드 선언부 접근제한자 뒤에 abstract 키워드를 붙여 선언한다
		 * => 바디가 없으므로 메서드 마지막을 세미콜론(;)으로 마무리한다
		 * 
		 * 메서드 실행 코드(바디)가 없으므로 외부에서 호출되면 안됨
		 * 
		 * 			기본 문법
		 * 
		 * [접근제한자] abstract 리턴타입 메서드명 ([매개변수...])
		 * 
		 * 
		 * 
		 * 			추상 클래스(Abstract class)
		 * 
		 * 인스턴스를 생성할 수 없는 미완성 클래스
		 * 
		 * 내부에 추상 메서드를 가지고 있을 경우
		 * 추상메서드가 호출되면 안되므로 인스턴스 생성을 차단,제한함
		 * 
		 * class 키워드 앞에 abstract 키워드를 붙여 정의한다
		 * 
		 * 추상메서드 뿐만 아니라 일반메서드, 멤버변수, 생성자를 가질 수 있다
		 * => 추상메서드가 없는 클래스도 추상클래스로 정의할 수 있음
		 * 
		 * 인스턴스를 생성할 수 없지만, 상속을 통한 슈퍼클래스로 사용하거나
		 * 다형성 활용을 위한 참조변수 타입으로 사용 가능
		 * 
		 * => 추상메서드를 포함하는 추상클래스를 상속받는 서브클래스는 반드시 오버라이딩을 통해 추상메서드 바디{}를 구현해야함
		 * => 즉 추상메서드의 오버라이딩을 강제할 수 있다
		 * => What(메서드)에 대한 강제, How(기능)는 서브 클래스에게 위임
		 * 
		 * 추상 메서드에 대한 구현을 강제함으로써 코드의 강제성 및 통일성 향상
		 * 
		 * 			추상 클래스 정의 기본 문법
		 * [접근제한자] abstract classs 클래스명 {
		 * 		// 멤버변수
		 *		// 생성자
		 *		// 일반메서드
		 *		// 추상메서드
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		// 추상클래스 AbstractClass의 인스턴스 생성 (불가)
		// AbstractClass ac = new AbstractClass(); 
		// 오류 : Cannot instantiate the type AbstractClass
		
		SubClass sc = new SubClass();
		sc.abstractMethod();
		sc.subClassMethod();
		
		// 추상클래스를 참조변수 타입으로 활용 가능 = 업캐스팅을 통한 다형성
		AbstractClass ac = new SubClass();
		ac.normalMethod();		// 상속 메서드
		ac.abstractMethod();	// 상속 메서드
//		ac.subClassMethod();	참조 영역의 축소로 보이지 않는 메서드
		
		Flyer[] ex = {new Superman(), new Bird(), new Plane()};
		ex[0].fly();
		ex[1].fly();
		ex[2].fly();
		ex[0].takeOff();
		ex[1].takeOff();
		ex[2].takeOff();
		ex[0].land();
		ex[1].land();
		ex[2].land();
		
		
		
		
		
	}

}

// class AbstractClass { 오류 : The type AbstractClass must be an abstract class to define abstract methods
	// 추상메서드를 갖는 클래스는 반드시 추상 클래스로 선언되야한다
abstract class AbstractClass {
	//	public abstract void abstractMethod() {} // 오류 : Abstract methods do not specify a body
	//  추상 메서드 정의 시 반드시 바디{}를 제거해야 함
	public abstract void abstractMethod();
	
	//	추상 클래스가 추가로 가질 수 있는 것
	public void normalMethod() {} // 일반 메서드
	public AbstractClass() {} // 기본 생성자
	String member; // 인스턴스 변수
}

// 추상클래스 AbstractClass를 상속받는 서브클래스 SubClass 정의

//class SubClass extends AbstractClass { 오류 : The type SubClass must implement the inherited abstract method AbstractClass.abstractMethod() }
// 바디를 갖지 않는 추상 메서드의 바디를 구현(implement)해야한다
	
class SubClass extends AbstractClass {

	@Override
	public void abstractMethod() {
		System.out.println("서브클래스에서 오버라이딩(구현)된 추상메서드");
		
	}
	public void subClassMethod() {
		System.out.println("서브클래스에서 정의한 메서드");
	}
}

/*
 * 슈퍼맨, 새, 비행기의 공통점 : 비행
 * => 공통점을 추출 후 상위클래스로 정의하되,
 *    각 서브클래스에서 비행 기능을 반드시 구현하도록 강제성 부여
 * 
 * Flyer 추상 클래스 정의
 * => 이륙(takeOff), 비행(fly), 착륙(land) 추상 메서드 정의
 * => 슈퍼맨, 새, 비행기 서브 클래스 생성
 *    ex) 각 메서드 호출 시  "슈퍼맨 이륙", "슈퍼맨 비행", "슈퍼맨 착륙" 출력
 * 
 */
abstract class Flyer {
	public abstract void takeOff();
	public abstract void fly();
	public abstract void land();
}

class Superman extends Flyer {

	@Override
	public void takeOff() {
		System.out.println("슈퍼맨 이륙");
	}

	@Override
	public void fly() {
		System.out.println("슈퍼맨 비행");
	}

	@Override
	public void land() {
		System.out.println("슈퍼맨 착륙");
	}
	
}
class Bird extends Flyer {

	@Override
	public void takeOff() {
		System.out.println("새 이륙");
		
	}

	@Override
	public void fly() {
		System.out.println("새 비행");
		
	}

	@Override
	public void land() {
		System.out.println("새 착륙");
		
	}
	
}
class Plane extends Flyer {

	@Override
	public void takeOff() {
		System.out.println("비행기 이륙");
		
	}

	@Override
	public void fly() {
		System.out.println("비행기 비행");
		
	}

	@Override
	public void land() {
		System.out.println("비행기 착륙");
		
	}
	
}



