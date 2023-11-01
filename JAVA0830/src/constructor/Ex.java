package constructor;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Person 인스턴스 생성 전 ");
		
		Person p = new Person();  // Person 인스턴스 생성
		// new 키워드에 의해 인스턴스가 생성될 때
		// Person() 형태의 생성자를 자동으로 호출하게 된다
		
//		p.Person();
		
		System.out.println("Person 인스턴스 생성 후");
		
		p.name = "홍길동";
		p.age =  28;
		
		System.out.println("이름 : " + p.name);
		System.out.println("나이 : " + p.age);
		System.out.println("----------------");
		
	
		
		Person p2 = new Person();
		
		System.out.println("이름 : " + p2.name);
		System.out.println("나이 : " + p2.age);
		
		
	}

}





class Person {
	String name;
	int age;
	
	/*
	 * 클래스 정의 시 개발자가 별도의 생성자를 정의하지 않으면
	 * 자바 컴파일러에 의해 기본 생성자가 자동으로 생성된다
	 * 
	 * -> 기본 생성자는 접근제한자가 클래스와 같고,
	 *    리턴 타입이 없으며, 이름은 클래스 이름과 같다.
	 *    또한, 매개변수가 없으며 중괄호 블록 {} 내에 수행할 코드가 없다.
	 *    
	 * 
	 * */
//	public Person() {}
	public Person() {
		// 기본 생성자 내에서 생성자 호출 확인을 위한 출력문 작성
		System.out.println("생성자 Person() 호출");
		name = "홍길동";
		age = 27;
		
	}
	
	
	
}


