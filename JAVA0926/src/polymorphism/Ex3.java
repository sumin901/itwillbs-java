package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 3000);
		System.out.println("Employee 정보 : " + emp.getEmployee());
		emp.salaryCalculate();
		Manager mng = new Manager("수민", 4500, "개발", 5);
		System.out.println(mng.getManager());
		mng.salaryCalculate();
		Engineer eng = new Engineer("수웅", 4600, 4);
		System.out.println(eng.getEngineer());
		eng.salaryCalculate();
		System.out.println("==================================");
		emp.salaryCalculateAll(mng);
		System.out.println("--------------------------------");
		Employee[] empArr = {emp, mng, eng};
		for (int i = 0 ; i < empArr.length; i++) {
			emp.salaryCalculateAll(empArr[i]);
		}
		
	}

}

// 직원 Employee 클래스

class Employee { // == class Employee extends Object
	String name;
	int salary;
	
	//기본 생성자
//	public Employee() {}
	
	public Employee(String name, int salary) {
		super(); // Employee의 슈퍼클래스 Object 클래스의 기본 생성자 호출
		this.name = name;
		this.salary = salary;
	}
	public String getEmployee() {
		return name + ", " + salary;
	}
	// 일반 직원의 연봉 계산 (기본 연봉을 그대로 적용)
	public void salaryCalculate () {
		System.out.println("연봉 : " + salary);
	}
	// 회사 전 직원의 연봉을 슈퍼클래스인 Employee 클래스에서의 계산
	// => 다형성 필요 (Employee, Manager, Engineer) 모두 처리
	// 따라서 메서드 파라미터로 다형성을 적용한 Employee 타입이 필요함
	public void salaryCalculateAll (Employee emp) { // 자동 업캐스팅
		int salaryResult = 0; // 연봉 계산 결과 저장 변수
		// 업캐스팅으로 인한 참조영역의 축소로 인해 각 서브클래스 타입 멤버변수는 사용 불가
		// Employee를 제외한 Manager, Engineer의 경우 다운캐스팅 후 멤버변수에 접근해야한다
		// 단 무작정 다운캐스팅 사용 시 오류 발생, 
		// 따라서 instanceof 연산자를 사용한다
		
		// * 하위 타입부터 판별한다
		// Employee, Manager, Engineer 모두 Employee에 속하므로
		// 모두 true가 되어 해당 if문 블록만 실행 후 나머지 if문은 실행하지 않으므로 
		// 하위 타입부터 판별해야함
		
		
		if (emp instanceof Manager ) { // emp가 Manager 타입인가
			// Employee -> Manager 타입 다운캐스팅 가능
			System.out.println("Employee -> Manager 다운 캐스팅!");
			Manager mng = (Manager)emp;
			salaryResult = mng.salary + (mng.manageEmployeeCount * 10);
		} else if (emp instanceof Engineer) {
			System.out.println("Employee -> Engineer 다운 캐스팅!");
			Engineer eng = (Engineer) emp;
			salaryResult = eng.salary + (eng.numOfCert * 20);
		} else if (emp instanceof Employee) {
			System.out.println("Employee 그대로 사용");
			salaryResult = emp.salary;
		} 
		// 각 직원의 계산된 연봉 출력
		System.out.println("연봉 : " + salaryResult + "만원");
		
	}
	
}
// 관리자 (Manager) 클래스
class Manager extends Employee {
	String depart; // 부서
	int manageEmployeeCount; // 부하 직원 수
	// 슈퍼클래스의 기본 생성자가 없으므로 파라미터 생성자를 생성한다
	public Manager(String name, int salary, String depart, int manageEmployeeCount) {
		super(name, salary);
		this.depart = depart;
		this.manageEmployeeCount = manageEmployeeCount;
	}
	public String getManager() {
		return getEmployee() + ", " + depart + ", " + manageEmployeeCount + "명";
	}
	// Employee의 연봉 계산 메서드 오버라이딩
	// 매니저 연봉 : 기본 연봉 + (관리직원수 * 10만원) 
	@Override
	public void salaryCalculate() {
		int salaryResult = salary + (manageEmployeeCount*10);
		System.out.println("매니저 연봉 : " + salaryResult);
	}
	
}
// 엔지니어(Engineer) 클래스
class Engineer extends Employee {
	int numOfCert; // 자격증 갯수

	public Engineer(String name, int salary, int numOfCert) {
		super(name, salary);
		this.numOfCert = numOfCert;
	}
	public String getEngineer() {
		return getEmployee() + ", 자격증 : " + numOfCert + "개";
	}
	// Employee 연봉 계산 메서드 오버라이드
	@Override
	public void salaryCalculate() {
		int salaryResult = salary + (numOfCert * 20);
		System.out.println("연봉 : " + salaryResult);
	}
	
}