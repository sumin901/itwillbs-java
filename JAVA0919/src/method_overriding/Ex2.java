package method_overriding;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 			메서드 오버라이딩 (method overriding) == 메서드 재정의
		 * 
		 * - 슈퍼클래스로부터 상속받은 메서드를 서브 클래스에서 재정의 하는 것
		 * 
		 * - 기본 슈퍼클래스의 메서드와 동일하게 생긴 메서드를 정의하게 되므로 서브 클래스에서는
		 *   더 이상 슈퍼클래스의 메서드가 보이지 않음
		 *   => 슈퍼클래스의 메서드를 덮어쓰기 때문에 자신의 메서드만 보인다
		 *      (= 슈퍼 클래스의 메서드는 은닉됨)
		 * 
		 * - 슈퍼 클래스의 메서드에 새로운 기능을 추가하는 경우
		 * - 기존에 상속된 메서드 내용을 변경하는 경우
		 * 
		 * 			<오버라이딩 규칙>
		 * 
		 * 1. 상속 관계가 필수 
		 * 2. 메서드 시그니처(메서드 이름, 리턴타입, 파라미터)가 모두 일치해야함
		 *     ※ 단 리턴타입은 부모와 같거나 서브 클래스 타입으로 변경 가능
		 * 3. 접근 제한자는 같거나 더 넓은 범위로만 변경 가능 (좁아질 수 없다)
		 * 
		 */
		Animal cookie = new Animal();
		cookie.bark();
		Dog choco = new Dog();
		choco.bark();
		Cat coco = new Cat();
		coco.bark();
		
		System.out.println("-------------------------------------");
		
		Child c = new Child();
		
		c.childPrn();
		c.parentPrn1();
		c.parentPrn2();
		c.parentPrn3();
		
		
		
		
		
	}

}

class Parent {
	
	public void parentPrn1() {
		System.out.println("슈퍼클래스 parentPrn1()");
	}
	
	public Object parentPrn2() {
		System.out.println("슈퍼클래스 parentPrn2()");
		return null;
	}
	
	public String parentPrn3() {
		System.out.println("슈퍼클래스 parentPrn3()");
		return null;
	}
	
	
}

class Child extends Parent {
	
	public void childPrn() {
		System.out.println("서브클래스 childPrn()");
	}
	// 슈퍼클래스로 상속받은 parentPrn1() 메서드 오버라이딩
	// 슈퍼클래스의 메서드명과 리턴타입 파라미터가 동일한 메서드 재정의
	// 슈퍼클래스가 가진 parentPrn1() 메서드는 child 인스턴스에서 보이지않게됨
	public void parentPrn1() {
		System.out.println("서브클래스에서 오버라이딩 된 parentPrn1()");
	}
	// 오버라이딩 시 슈퍼클래스의 접근제한자보다 좁을 수 없다
	// 부모가 public일 때 자식은 반드시 public
	
	
	
	// 오버라이딩 시 슈퍼클래스의 리턴타입 외 리턴타입을 명시할 수 있다
	public String parentPrn2() {
		System.out.println("서브클래스에서 오버라이딩 된 parentPrn2()");
		return null;
	}
	
	// 오버라이딩 시 리턴타입은 기존 슈퍼클래스 리턴타입의 슈퍼클래스로 할 수 없다
//	public Object parentPrn3() {
//		The return type is incompatible with Parent.parentPrn3()
//		return null;
//	}
	
//	@Override 
	public String parentPrn3() {
		// TODO Auto-generated method stub
		System.out.println("서브클래스에서 오버라이딩 된 parentPrn3()");
		return null;
	}
	
//	※ @override Annotation이 있을 경우, 오버로딩을 수행하거나 오버라이딩 규칙 위반 시 컴파일 에러 발생한다
}

class Animal {
	String name;
	int age;
	
	public void bark() {
		System.out.println("동물 울음 소리");
	}
}

class Dog extends Animal {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
}

class Cat extends Animal {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
	
}




