package constructor;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 파라미터 생성자
		 * 
		 *  - 생성자 호출 시점에서 전달해야할 데이터가 있을 경우
		 *    생성자 파라미터(매개변수)를 선언할 수 있다(=메서드 방식과 동일)
		 *  
		 *  - 파라미터(매개변수)를 통해 전달받은 데이터는 인스턴스 변수를 초기화하는 용도로 사용한다
		 *  
		 *  - 즉, 객체마다 다른 데이터를 가진 채로 인스턴스를 생성하기 위해 사용한다
		 *  
		 *  < 파라미터 생성자 정의 기본 문법 >
		 *  
		 *  [접근 제한자] 클래스명(매개변수 선언...) {
		 *  	생성자 호출 시점에 파라미터에 데이터를 전달해
		 *  	인스턴스 내의 인스턴스 변수(멤버 변수)를 초기화한다
		 *  	인스턴스변수명(멤버변수명) = 매개변수명(데이터)
		 *  }
		 *  
		 *  <파라미터 생성자 자동 생성 단축키 : Alt + Shift + S -> O
		 *  (단 멤버변수가 하나도 없을 경우 생성되지 않는다.)
		 *  
		 *  
		 */
//		Person2 p = new Person2(); >> 오류 : 파라미터 생성자를 하나라도 정의할 경우 
//											 컴파일러에 의해 기본 생성자가 자동으로 생성되지 않기 때문에
//										 	 기본 생성자를 호출 할 수 없게된다
//								   >> 해결 : 기본 생성자를 직접 정의 or Person2 (String, int) 파라미터 생성자로 호출
		
		Person2 p = new Person2("홍길동", 20);
		p.showInfo();
		
		Person2 p2 = new Person2("이순신", 39);
		p2.showInfo();
				
		Person2 p3 = new Person2("대한민국", "강감찬", 28);
		p3.showInfo();		
		
	}

}



class Person2 {
	String nation; // 멤버변수 선언(= 인스턴스 변수, 필드)
	String name; // 멤버변수 선언(= 인스턴스 변수, 필드)
	int age;	// 멤버변수 선언(= 인스턴스 변수, 필드)
	
	// 생성자를 정의하지않으면 jvm이 자동으로 기본 생성자를 생성한다.
//	public Person2 () {} << 기본 생성자
	
	// 파라미터가 존재하는 생성자
	public Person2 (String newName , int newAge) {
		
		System.out.println("Person2(String, int) 생성자 호출");
		// 전달받은 파라미터 값을 인스턴스 변수에 저장
		name = newName;
		age = newAge;
		
		// 만약 국가명은 무조건 "대한민국"으로 고정하고싶다면,
		// 별도로 파라미터값을 전달받지 않고 생성자 내에서 "대한민국"으로 초기화
		nation = "대한민국";
		
	}
	
//	파라미터 생성자 자동 단축키 : Alt + Shift + S -> O
	
	public void showInfo () {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("국가 : " + nation);
	}

	public Person2(String nation, String name, int age) {
		super();
		this.nation = nation;
		this.name = name;
		this.age = age;
	}
	
	
}