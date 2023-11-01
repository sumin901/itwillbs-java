package super_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 				<상속에서의 생성자>
		 * 
		 * - 상속에서 생성자는 상속되지 않는다
		 * 
		 * - 생성자의 이름은 클래스와 동일해야하는데 상속받게되면 상속받은 생성자 != 클래스 이름 이므로 
		 *   생성자 작성 규칙에 위반
		 *   
		 * - 서브클래스의 인스턴스를 생성할 때는 자동으로 슈퍼 클래스 인스턴스를 생성한 후
		 *   서브클래스의 인스턴스가 생성됨
		 *   서브클래스 생성자에서 슈퍼클래스 기본 생성자를 자동 호출한다
		 *   슈퍼클래스에 파라미터 생성자만 존재할 경우
		 *   서브클래스 생성자에서 컴파일 에러가 발생한다
		 *   
		 * 				<생성자 super()>
		 * - 슈퍼 클래스의 생성자를 명시적으로 호출할 때 사용한다
		 *   생성자 this()와 사용 방법 및 목적은 동일하다
		 *   
		 * - 기본 문법 : super(); / super([데이터...]);
		 * 
		 * - 목적 1 : 슈퍼클래스 생성자 중 특정 생성자를 명시적으로 호출할 경우
		 * 				ex) 슈퍼클래스 기본 생성자 없이 파라미터 생성자만 정의 되있다면
		 * 					서브클래스 생성자에서 슈퍼클래스 기본 생성자 호출 불가로 
		 * 					컴파일 에러가 발생, 이 때 슈퍼 클래스의 파라미터 생성자를 명시적으로 호출하기 위함
		 * 
		 * - 목적 2 : 슈퍼클래스 생성자에 멤버변수 초기화 코드가 존재할 경우
		 * 				ex) 서브클래스 생성자에서 슈퍼클래스의 멤버까지 초기화하면 
		 * 					초기화 코드의 중복이 발생한다
		 *  				이 때, 슈퍼클래스의 멤버는 슈퍼클래스의 생성자에서
		 *  				서브클래스의 멤버는 서브클래스의 생성자에서 초기화해 코드 중복을 방지하기 위함
		 *  
		 *  ※ 주의 > 생성자 super() 는 반드시 생성자의 첫 문장에서 실행되야함
		 *           => 생성자 내에서 super()와 this() 동시 사용 불가
		 * 
		 * 
		 * 
		 */
		Student s = new Student();
		System.out.println(s.name + s.age + s.isStudyMode);
		Student s2 = new Student("ㅇㅁㅇ", 11, false);
		System.out.println(s2.name + s2.age + s2.isStudyMode);
		Student s3 = new Student();
		System.out.println(s3.name + s3.age + s3.isStudyMode);
		
	}

}

class Person { // == class Person extends Object
	String name;
	int age;
	public Person(String name, int age) {
		super();				// Object 클래스의 기본 생성자 호출, Object()
		this.name = name;		
		this.age = age;
	}
	
	
	// 1. 슈퍼클래스 기본 생성자를 정의한다
//	public Person() {};
	
	
}

class Student extends Person {
	boolean isStudyMode;

	public Student() {
		// 서브 클래스 기본 생성자에서 자동으로 슈퍼 클래스 기본 생성자를 호출함
		// 만약 슈퍼클래스 기본 생성자가 존재하지 않고 파라미터 생성자만 존재할 경우 오류가 발생한다
		// 		<해결 방법>
		// 1. 슈퍼클래스 기본 생성자를 정의한다
		// 2. 서브클래스에서 슈퍼클래스의 파라미터 생성자를 명시적으로 호출한다
		super("ㅇㅅㅁ", 28);
//		isStudyMode = true;
		
		
//		this("ㅇㅅㅁ", 17, true);

		// 생성자 super()는 생성자 this()와 마찬가지로 
		// 생성자 내부에서 가장 먼저 실행되야함
	}

	public Student(String name, int age, boolean isStudyMode) {
		// Student 클래스 생성자에서 모든 멤버변수를 직접 초기화 할 경우
//		super("ㅅㅁ", 28);
//		this.name = name;
//		this.age = age;
//		this.isStudyMode = isStudyMode;
		// name과 age 멤버 변수를 초기화하는 코드를 슈퍼클래스 Person 파라미터 생성자를 호출하는 코드와 중복된다
		// 따라서 중복되는 초기화는 슈퍼클래스 생성자로 수행하고 서브클래스의 멤버의 초기화만 직접 수행한다
		
		super(name,age); // 슈퍼클래스 생성자에게 name과 age값을 전달해 대신 초기화
		this.isStudyMode = isStudyMode; // 중복되지않는 서브클래스 멤버변수의 초기화
	}
	
}
