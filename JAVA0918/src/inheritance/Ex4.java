package inheritance;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 상속에서의 생성자
		 * 
		 * - 생성자 : 클래스명의 이름과 같고 리턴타입이 없는 메서드의 일종
		 * 
		 * - 상속 시 생성자는 상속하지 않는다
		 *   => 상속받을 경우 자신의 클래스 이름과 생성자 이름이 다르기 때문에 생성자 정의 규칙에 위반한다 
		 * 
		 * - 상속 관계에서 인스턴스를 생성할 때
		 *   자식 클래스의 인스턴스가 생성되기 전 부모 클래스의 인스턴스를 먼저 생성한 후
		 *   자식 클래스의 인스턴스를 생성한다
		 *   => 자식 클래스의 생성자가 호출되면 가장 먼저
		 *      부모 클래스의 생성자를 호출해 부모 클래스의 인스턴스를 생성하고
		 *      그 후에 자식 클래스의 인스턴스가 생성되어 생성자 코드가 실행된다
		 *   
		 *   
		 */
		
		Manager4 m = new Manager4();
		/*
		 * 				<Manager4 인스턴스 생성 과정>
		 * 서브클래스 인스턴스 생성 과정에서 서브 클래스 생성자에서 인스턴스 생성 전 
		 * 슈퍼클래스 생성자를 호출한다 
		 * 즉, 슈퍼 클래스의 인스턴스가 먼저 생성된 후 서브 클래스의 인스턴스가 생성된다.
		 * 
		 * 1. new Manager4() => Manager4() 생성자로 이동
		 * 2. manager4() 생성자에서 슈퍼 클래스 Employee4의 생성자 Employee4 () 호출
		 *    => super();
		 * 3. Employee4 생성자 내부의 super(); => Obeject의 생성자 호출
		 *    => super(); 
		 * 4. Object 인스턴스 생성, Object() 생성자 내 코드 실행 
		 *    => null
		 * 5. Employee4 인스턴스 생성, 생성자 내의 코드 실행
		 * 6. Manager4 인스턴스 생성, 생성자 내의 코드 실행
		 *  
		 * 
		 */
		
	}

}

class Employee4 {
	String name = null;
	int salary;
	public Employee4() {
		super(); // Object class 호출
		System.out.println("Employee4 생성자 호출 완료");
	}
	// 이름과 연봉을 전달받아 초기화하는 파라미터 생성자
	public Employee4(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	// 파라미터 생성자를 정의했을 때 기본 생성자가 자동으로 생성되지 않으므로
	// 서브 클래스의 생성자에서 기본적으로 호출되는 슈퍼 클래스의 기본 생성자가
	// 존재하지않을 수 있다. 
	// 서브 클래스의 생성자에서 컴파일 에러가 발생할 수 있다.
	// => 슈퍼 클래스의 파라미터 생성자를 정의할 때 기본 생성자가 정의 필요함
	
	
}
// Employee4 클래스 상속받는 클래스
class Manager4 extends Employee4 {
	String depart;

	public Manager4() {
		super(); // = Employee4() {} 기본 생성자 호출
		// 서브 클래스의 생성자를 호출하게 되면
		// 내부적으로 가장 먼저 슈퍼 클래스의 기본 생성자를 자동 호출한다
		// => 슈퍼 클래스의 생성자 작업이 종료된 후 서브 클래스의 생성자 호출
		System.out.println("Manager4 생성자 호출 완료");
	}
	public Manager4(String name, int salary, String depart) {
		super();
		System.out.println("Manager4(String, int, Stirng) 생성자 호출");
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	
}






