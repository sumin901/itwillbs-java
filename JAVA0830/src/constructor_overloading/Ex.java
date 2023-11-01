package constructor_overloading;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 
		 * 생성자 오버로딩
		 * 
		 * - 메서드 오버로딩과 동일
		 * - 생성자 호출 시 다양한 형태의 파라미터를 전달해 객체를 다양하게 초기화 하는 목적
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Person p = new Person("홍길동","120401-1111111", "대한민국");
		p.showPersonInfo();
		
		// 문자열 2개만 전달할 경우 이름, 주민번호만 초기화하고
		// 국적은 대한민국으로 초기화하는 생성자 호출
		
		Person p2 = new Person("이순신", "222-2222-222");
		p2.showPersonInfo();
		
		
		
		
	}

}


class Person {
	
	String nation;
	String name;
	String jumin;
	
	// 기본 생성자 정의
	public Person () {
		System.out.println("Person3() 생성자 호출");
	}
	
	// 국가는 자동으로 "대한민국"으로 초기화
	// 파라미터 2개 (name, jumin)을 전달받아 초기화하는 생성자 정의
	
	public Person (String name, String jumin) {
		System.out.println("Person3(String, String) 호출");
		nation = "대한민국";
		this.name = name;
		this.jumin = jumin;
	}
	
	
	// 파라미터 3개 (name, jumin, nation)을 전달받아 초기화하는 생성자 정의
	
	public Person(String name, String jumin, String nation) {
		System.out.println("Person3(String, String, String) 호출");
		this.name = name;
		this.nation = nation;
		this.jumin = jumin;
		
		
	}
	// showPersonInfo 메서드 정의
		
	public void showPersonInfo () {	
		System.out.println("이름 : " + name + " 국적 : "+ nation + " 주민번호 : " + jumin);
		
	}
	
	
	
}






