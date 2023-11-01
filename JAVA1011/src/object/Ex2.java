package object;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 *	toString() 메서드 (public String toString() {})
		 *	- 어떤 객체의 정보를 문자열로 변환 후 리턴
		 *
		 *	- 기본적으로 Object 클래스의 toString() 메서드는 객체의 정보 (= 주소값)를 문자열로 리턴하도록 정의한다
		 *
		 *	- 일반적으로 객체의 정보는 객체 내의 멤버변수에 저장된 데이터 (속성값)를 의미하므로
		 *	  Object 클래스의 toString() 메서드를 오버라이딩해 객체가 가진 멤버변수 값을 문자열로 결합해 리턴하도록 해야한다
		 *
		 * 	- 출력문 내에는 toString() 메서드 생략 가능 (참조변수명만 사용 가능)
		 * 
		 * 	- 자바에서 제공하는 대부분의 클래스(API)들은 toString() 메서드rk
		 * 	  오버라이딩 돼 있으므로 객체에 저장된 값을 문자열로 리턴받기 가능
		 * 	  ex) String 클래스, ArrayList 클래스 등...
		 * 
		 * 	- Alt Shift s + s
		 *
		 *
		 *
		 */
		String str = new String("자바"); // String 또한 클래스
		/* String str2 = "자바"; */
		System.out.println(str); // toString() 메서드가 생략 되어있음
		System.out.println(str.toString());
		
		Person2 p = new Person2("홍길동", 1, "12");		
		System.out.println("사람 p : " + p.toString());
		System.out.println("사람 p : " + p); // => print() 메서드 내에서 p 객체 정보 출력시 toString() 생략 가능
		
		// 출력문이 아닌 결과값을 변수에 저장하는 경우 toString() 메서드 필수
		/* String PersonInfo = p; => 오류 : Type mismatch: cannot convert from Person2 to String */
		// => 반드시 toSting() 사용
		String PersonInfo = p.toString();
		
		// Object 클래스의 toString 메서드는 "클래스명@주소값" 형태의 문자열로 리턴한다
		// => 주소값은 16진수로 변환되어 문자열로 결합됨
		System.out.println("Person2 p의 클래스명 : " + p.getClass().getName());
		System.out.println("Person2 p의 주소값 : " + p);
		
		Person3 p2 = new Person3("12", 2, "123");
		System.out.println("p2의 객체 정보 : " + p2);
		System.out.println("p2의 객체 정보 : " + p2.toString());
		
		
	}

}
class Person2 {
	String name;
	int age;
	String jumin;
	
	public Person2(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
}

class Person3 {
	String name;
	int age;
	String jumin;
	
	public Person3(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
//	@Override
//	public String toString() {
//		// 현재 인스턴스가 가진 멤버들을 모두 문자열로 결합해 리턴
//		// => 형태 : 개발자 마음
//		return "이름 : " + name + ", 나이 : " + age + ", 주민번호 : " + jumin;
//	}

	@Override
	public String toString() {
		return "Person3 [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}
	
	
}
