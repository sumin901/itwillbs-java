package inheritance;

public class Ex {
	
	public static void main(String[] args) {
	
		/*
		 * 상속(inheritance)
		 * 
		 * - is-a 관계가 성립하는 객체간의 관계
		 * 
		 * - 슈퍼클래스(부모)의 모든 멤버를 서브클래스(자식)에서 물려받아
		 *   선언없이 사용하는 것 
		 * 
		 * - 슈퍼클래스(Super class, 부모, 상위, 조상)
		 * 
		 * - 서브클래스(Sub class, 자식, 하위, 자손)
		 * 
		 * - 표기 A ↑ B => A : Super, 부모 / B : Sub, 자식
		 * 
		 * - private 접근제한자 지정된 멤버는 상속 대상에서 제외됨
		 * 
		 * - 생성자는 상속 대상에서 제외됨
		 *   => 생성자의 이름은 자신의 클래스여야한다.
		 *      상속받은 생성자는 부모 클래스 이름이므로 규칙 위반!
		 * 
		 * - 자바는 다일 상속만 지원한다
		 *   => 두 개 이상의 슈퍼 클래스(부모)를 지정할 수 없음
		 *   
		 * - 별도로 상속 대상을 지정하지 않을 경우(extends 생략)
		 *   java.lang.Object 클래스를 자동으로 상속 받는다
		 *   => java.lang.Object 클래스는 자바의 최상위 클래스
		 *   
		 * 				<상속의 기본 문법>
		 * class 서브클래스명 extends 슈퍼클래스명{}
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		// 서브 클래스 Child 인스턴스 생성
		Child c = new Child();
		c.childPrn(); // 서브 클래스에서 직접 정의한 메서드
		
		// Child 클래스는 자신의 클래스 내의 멤버변수뿐만 아니라
		// 슈퍼클래스 Parent의 멤버도 선언없이 사용 가능하다
		c.num = 10; // 상속받은 멤버 변수
		c.parentPrn();
		c.showNum();
		
		// 나 클래스 인스턴스 생성
		나 나 = new 나();
		// 나 자신의 멤버변수
		System.out.println("나의 폰 : " + 나.핸드폰);
		나.프로그래밍();
	}
	
}

// 슈퍼클래스에 해당하는 parent 클래스 정의
class Parent { // class Parent extends Object)와 같다고 java는 해석함 => extends 생략 시 java.lang.Object가 부모 클래스
	int num;
	
	public void parentPrn() {
		System.out.println("슈퍼 클래스의 parentPrn()");
	}
}

// 상속받는 서브클래스에 해당하는 child 클래스 정의
// => Child 클래스 선언부에 extends 키워드를 사용하고 슈퍼클래스 Parent를 명시한다
	
 class Child extends Parent { // Parent 클래스를 상속받게되면 
	 							// Child 클래스에서 선언하지 않은 멤버(=Parent의 멤버)도 사용 가능 
	  public void childPrn() {
	  System.out.println("서브클래스의 childPrn()"); 
	  }
	
	  public void showNum() {
		// 슈퍼클래싀 멤버변수 num에 접근 가능함
		num = 10;
		System.out.println("부모로부터 상속받은 멤버변수 num = " + num);
	}
}

class 할아버지 {
	String 집 = "고층 아파트";
	String 티비 = "최신형 티비";
	
	public void 그림그리기() {
		System.out.println("수준 높은 그림 실력");
	}
}
// 할아버지 클래스를 상속받는 아버지 클래스
// 멤버변수 : 자동차 - 스포츠카
// 메서드 : 노래 - 잘함
class 아버지 extends 할아버지 {
	String 자동차 = "스포츠카";
	public void 노래부르기 () {
		System.out.println("노래를 잘 부른다");
	}
}
// 아버지 클래스를 상속받는 나 클래스
class 나 extends 아버지 {
	String 핸드폰 = "스마트폰";
	public void 프로그래밍() {
		System.out.println("잘한다");
	}
}



