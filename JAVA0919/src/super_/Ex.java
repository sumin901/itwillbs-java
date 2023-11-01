package super_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 메서드 오버라이딩 및 멤버 변수에 대한 오버라이딩 시
		 * 슈퍼 클래스의 멤버변수와 메서드는 은닉된다
		 * => 서브 클래스 인스턴스를 통해 슈퍼 클래스 멤버에 접근 불가능
		 * 
		 * 				<레퍼런스 super>
		 * - 슈퍼 클래스 멤버에 접근하기 위한 키워드(= 레퍼런스 변수)
		 * 
		 * - 레퍼런스 this와 마찬가지로 서브 클래스 인스턴스를 생성할 때 생성되며
		 *   자동으로 생성되는 슈퍼 클래스의 인스턴스 주소를 저장하는 변수
		 * 
		 * - 오버라이딩에 의해 은닉된 멤버변수 또는 메서드 접근 시 사용
		 * 
		 * 				<기본 문법>
		 * super.부모 멤버변수 or super.메서드()
		 * 
		 * 
		 */
		
		Parent p = new Parent();
		Child c = new Child();
		c.watchTv();
		System.out.println("TV : " + c.tv);
		System.out.println("------------------------------");
		// 레퍼런스 super를 통해 슈퍼클래스의 멤버에 접근한 메서드 호출
		c.watchParentTv();
		
		System.out.println("====================================");
		
		ChildClass cc = new ChildClass();
		cc.method();
		
		
	}

}

class Parent {
	String tv = "부모님 집 티비";
	
	public void watchTv() {
		System.out.println(tv + " 보기");
	}
}

class Child extends Parent {
	// 슈퍼 클래스로부터 상속받은 멤버 변수와 동일한 이름의 변수를 선언하면 
	// 슈퍼 클래스 멤버 변수는 은닉됨
	String tv = "내 티비";
	
	// 상속받은 watchTv() 메서드 오버라이딩
	// 슈퍼클래스 메서드는 은닉된다
	@Override
	public void watchTv() {
		// TODO Auto-generated method stub
		System.out.println("서브클래스 오버라이딩 메서드");
		System.out.println(tv + "보기");
	}
	
	public void watchParentTv() {
		// 현재 클래스 내 오버라이딩으로 인해 은닉된 슈퍼 클래스의 멤버 변수는
		// 레퍼런스 super를 통한 접근으로 사용 가능하다
		// 1. 은닉된 슈퍼클래스의 멤버변수에 접근할 때
		System.out.println(super.tv + " : super.tv");
		System.out.println(this.tv + " : this.tv");
		
		// 2. 은닉된 슈퍼클래스의 메서드에 접근할 때
		super.watchTv();
		
	}
	
}

/*
 * 슈퍼 클래스와 서브 클래스가 존재할 때
 * 		<서브 클래스의 메서드 내에 슈퍼클래스와 동일한 이름의 변수가 존재할 때 자바의 탐색 과정>
 * 
 * - 메서드 내 변수 종류 : 로컬변수, 자신의(서브) 멤버변수, 부모의 멤버변수
 * - 메서드 내 접근 순서 : 로컬변수 → 자신의(서브) 멤버변수 → 부모의 멤버변수
 * - 최종적으로 Object 클래스까지 거슬러 올라가며 탐색해 없으면 오류 발생
 * 
 */

class ParentClass {
	String x = "Parent"; // 3. 슈퍼클래스 멤버 변수 
}

class ChildClass extends ParentClass{
	String x = "Child"; // 2. 서브클래스 멤버 변수 
	public void method() {
		String x = "method"; // 1. 서브 클래스 내 로컬 변수
		System.out.println("x = " + x); // 만약 로컬 변수를 선언하지 않을 경우 this.x와 동일하다
		System.out.println("this.x = " + this.x); //  서브 클래스 멤버 변수가 기본이지만 없을 경우 다음 우선순위 슈퍼 클래스 멤버 변수를 찾는다
		System.out.println("super.x = " + super.x); // 슈퍼클래스 멤버 변수가 없다면 오류
													// 최상위 슈퍼 클래스 Object까지 탐색 후 오류 처리
		
	}
}